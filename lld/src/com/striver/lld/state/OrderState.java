package com.striver.lld.state;

public interface OrderState {

    void next(OrderContext context); // Move to the next state
    void cancel(OrderContext context); // Cancel the order
    String getStateName();
}
