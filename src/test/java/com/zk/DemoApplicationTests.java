package com.zk;

import com.example.demo.calculator.CalcController;
import com.example.demo.calculator.Calculator;
import com.example.demo.calculator.MyService;
import org.junit.jupiter.api.Test;




public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		CalcController calcController = new CalcController(new Calculator() {
			@Override
			public double process(String expression) {
				return 3;
			}
		}, new MyService() {
			@Override
			public String add(String name) {
				return "good";
			}
		});
		System.out.println(calcController.add("hello"));
	}



}
