package com.labasolvd.Exceptions;

public class WasArrestedBeforeException extends Exception {
    public WasArrestedBeforeException() {
    }
    public WasArrestedBeforeException(String message, Throwable cause) {
        super(message, cause);
    }
    public WasArrestedBeforeException(String message) {
        super(message);
    }
    public WasArrestedBeforeException(Throwable cause) {
        super(cause);
    }
}
