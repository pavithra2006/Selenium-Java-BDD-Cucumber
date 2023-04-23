package com.exceptions;

public class FrameworkException extends RuntimeException {
    public FrameworkException(String msg) {
        super(msg);
    }

    public FrameworkException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
