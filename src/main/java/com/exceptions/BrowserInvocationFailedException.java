package com.exceptions;

public class BrowserInvocationFailedException extends FrameworkException {
    public BrowserInvocationFailedException(String msg) {
        super(msg);
    }

    public BrowserInvocationFailedException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
