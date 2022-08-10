//package com.zk;
//
//import com.example.demo.calculator.CalcController;
//import com.example.demo.calculator.Calculator;
//import com.example.demo.calculator.CalculatorImpl;
//import com.example.demo.calculator.DemoApplication;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//@SpringBootTest(classes = DemoApplication.class)
//public class DemoApplicationTests {
//
//	@Autowired
//	ApplicationContext ac;
//
//	@Test
//	public void contextLoads() {
//		Calculator calculator = ac.getBean(Calculator.class);
//		assertTrue(calculator instanceof CalculatorImpl);
//
//		CalcController calcController = ac.getBean(CalcController.class);
//		assertNotNull(calcController);
//	}
//}