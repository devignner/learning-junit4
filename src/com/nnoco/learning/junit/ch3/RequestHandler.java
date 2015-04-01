package com.nnoco.learning.junit.ch3;

public interface RequestHandler {
	Response process(Request request) throws Exception;
}
