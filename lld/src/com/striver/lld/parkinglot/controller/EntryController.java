package com.striver.lld.parkinglot.controller;

import com.striver.lld.parkinglot.domain.ParkingSlot;
import com.striver.lld.parkinglot.domain.Ticket;
import com.striver.lld.parkinglot.domain.Vehicle;
import com.striver.lld.parkinglot.service.SlotService;
import com.striver.lld.parkinglot.service.TicketService;

import java.util.Optional;
import java.util.UUID;

public class EntryController {

    private final TicketService ticketService;
    private final SlotService slotService;

    public EntryController(TicketService ticketService, SlotService slotService) {
        this.ticketService = ticketService;
        this.slotService = slotService;
        System.out.println("[CONTROLLER] EntryController initialized");
    }

    public EntryResult enterVehicle(String licensePlate, Vehicle.VehicleType vehicleType) {
        System.out.println("[CONTROLLER] Vehicle entry request - License: " + licensePlate + ", Type: " + vehicleType);

        try {
            // Create vehicle
            Vehicle vehicle = new Vehicle(licensePlate, vehicleType);
            System.out.println("[CONTROLLER] Vehicle created: " + vehicle.getId());

            // Allocate slot
            Optional<UUID> slotId = slotService.allocateSlot(vehicleType)
                    .map(ParkingSlot::getId);

            if (slotId.isEmpty()) {
                return new EntryResult(false, null, null, "No available slots for vehicle type: " + vehicleType);
            }

            // Generate ticket
            Ticket ticket = ticketService.generateTicket(vehicle, slotId.get());

            System.out.println("[CONTROLLER] Vehicle entry successful - Ticket: " + ticket.getId() + ", Slot: " + slotId.get());
            return new EntryResult(true, ticket.getId(), slotId.get(), "Entry successful");

        } catch (Exception e) {
            System.out.println("[CONTROLLER] Vehicle entry failed: " + e.getMessage());
            return new EntryResult(false, null, null, e.getMessage());
        }
    }

    public static class EntryResult {
        private final boolean success;
        private final UUID ticketId;
        private final UUID slotId;
        private final String message;

        public EntryResult(boolean success, UUID ticketId, UUID slotId, String message) {
            this.success = success;
            this.ticketId = ticketId;
            this.slotId = slotId;
            this.message = message;
        }

        public boolean isSuccess() { return success; }
        public UUID getTicketId() { return ticketId; }
        public UUID getSlotId() { return slotId; }
        public String getMessage() { return message; }
    }
}
