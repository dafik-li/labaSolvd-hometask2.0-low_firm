package com.labasolvd.Exceptions;

public class SolicitorLevelException extends Exception {
    public SolicitorLevelException() {
    }
    public SolicitorLevelException(String message, Throwable cause) {
        super(message, cause);
    }
    public SolicitorLevelException(String message) {
        super(message);
    }
    public SolicitorLevelException(Throwable cause) {
        super(cause);
    }
}
