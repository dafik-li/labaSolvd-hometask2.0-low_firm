package com.labasolvd.Exceptions;

public class CrimetypeException extends Exception{
    public CrimetypeException() {
    }
    public CrimetypeException(String message, Throwable cause) {
        super(message, cause);
    }
    public CrimetypeException(String message) {
        super(message);
    }
    public CrimetypeException(Throwable cause) {
        super(cause);
    }
}
