package com.example.sbb;

import jdk.jshell.spi.ExecutionControl;

public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
