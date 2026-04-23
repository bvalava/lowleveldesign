package com.striver.lld.taskmanagement.domain.state;

public class InvalidStateTransitionException extends RuntimeException{

    public InvalidStateTransitionException(String message) {
        super(message);
    }

    public InvalidStateTransitionException(String message, Throwable cause) {
        super(message, cause);
    }
}
