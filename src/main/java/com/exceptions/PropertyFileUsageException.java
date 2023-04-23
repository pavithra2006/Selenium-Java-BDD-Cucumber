package com.exceptions;

public class PropertyFileUsageException extends FrameworkException {
    public PropertyFileUsageException(String msg) {
        super(msg);
    }

    public PropertyFileUsageException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
