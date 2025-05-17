package com.helwatkar.interview.preparations.exceptionhandling;

public class ResourceNotANumberException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotANumberException(String message) {
        super(message);
    }

    public ResourceNotANumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotANumberException(Throwable cause) {
        super(cause);
    }
}
