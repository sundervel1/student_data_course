package com.cg.boot.exception;

public class NotLoggedInException extends RuntimeException {

	public NotLoggedInException(String message) {
		super(message);
	}

}