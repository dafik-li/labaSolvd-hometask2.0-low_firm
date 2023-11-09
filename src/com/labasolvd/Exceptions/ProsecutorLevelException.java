package com.labasolvd.Exceptions;

public class ProsecutorLevelException extends Exception {
    public ProsecutorLevelException() {
    }
    public ProsecutorLevelException(String message, Throwable cause) {
        super(message, cause);
    }
    public ProsecutorLevelException(String message) {
        super(message);
    }
    public ProsecutorLevelException(Throwable cause) {
        super(cause);
    }
}
