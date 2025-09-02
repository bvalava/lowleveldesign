package com.rk.openclosed;

public class Invoice {

    private final Marker marker;
    private final int quantity;

    public Invoice(Marker marker, int quantity) {

        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {

        int price = marker.price * this.quantity;
        return price;
    }
}
