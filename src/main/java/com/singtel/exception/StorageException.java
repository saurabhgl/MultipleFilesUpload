package com.singtel.exception;

public class StorageException extends RuntimeException {

	private static final long serialVersionUID = -1050824522334250485L;

	public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
