package com.striver.lld.atmmachine.domain.exception;

public class InvalidATMOperationException extends RuntimeException{

    public InvalidATMOperationException(String message) {
        super(message);
    }
}
