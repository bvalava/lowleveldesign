package com.striver.lld.parkinglot.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {

    private final UUID id;
    private final UUID ticketId;
    private final LocalDateTime exitTime;
    private final double totalFee;
    private Payment.PaymentStatus paymentStatus;

    public Receipt(UUID ticketId, double totalFee) {

        this.id = UUID.randomUUID();
        this.ticketId = ticketId;
        this.exitTime = LocalDateTime.now();
        this.totalFee = totalFee;
        this.paymentStatus = Payment.PaymentStatus.PENDING;
    }

    public void markAsPaid() {
        this.paymentStatus = Payment.PaymentStatus.SUCCESS;
    }

    public void markAsFailed() {
        this.paymentStatus = Payment.PaymentStatus.FAILED;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public Payment.PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", ticketId=" + ticketId +
                ", exitTime=" + exitTime +
                ", totalFee=" + totalFee +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
