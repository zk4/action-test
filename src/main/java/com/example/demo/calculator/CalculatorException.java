package com.example.demo.calculator;

public class CalculatorException extends RuntimeException {
	public CalculatorException(String s) {
		super(s);
	}

	public CalculatorException(String s, Exception e) {
		super(s,e);
	}
}
