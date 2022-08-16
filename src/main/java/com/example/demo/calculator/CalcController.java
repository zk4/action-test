package com.example.demo.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	private final Calculator calculator;


	MyService myService;

	public CalcController(Calculator calculator, MyService myService) {
		this.calculator = calculator;
		this.myService = myService;
	}

	@RequestMapping("/")
	public String result(@RequestParam("expression")String expression) {
	    	try {
        		return Double.toString(calculator.process(expression));
    		} catch (CalculatorException e) {
        		return e.getMessage();
	    	}
	}


	@RequestMapping("/name")
	public String add(String expression) {
		return myService.add(expression);
	}
}