package com.nnoco.learning.junit.ch3;

public class ErrorResponse implements Response{
	private static final String NAME = "Error";
	private Request originalRequest;
	private Exception originalException;

	public ErrorResponse(Request request, Exception exception) {
		this.originalRequest = request;
		this.originalException = exception;
	}
	
	public Request getOriginalRequest() {
		return originalRequest;
	}
	
	public Exception getOriginalException() {
		return originalException;
	}

	@Override
	public String getName() {
		return NAME;
	}
}
