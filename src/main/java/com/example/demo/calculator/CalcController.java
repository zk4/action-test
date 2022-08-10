package com.example.demo.calculator;

import com.example.demo.calculator.Calculator;
import com.example.demo.calculator.CalculatorException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	private final Calculator calculator;

	public CalcController(Calculator calculator) {
    		this.calculator = calculator;
	}

	@RequestMapping("/")
	public String result(@RequestParam("expression")String expression) {
	    	try {
        		return Double.toString(calculator.process(expression));
    		} catch (CalculatorException e) {
        		return e.getMessage();
	    	}
	}
}