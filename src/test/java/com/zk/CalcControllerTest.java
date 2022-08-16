//package com.zk;
//
//import com.example.demo.calculator.CalcController;
//import com.example.demo.calculator.Calculator;
//import com.example.demo.calculator.CalculatorException;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CalcControllerTest {
//
//  @Test
//  public void result() {
//    CalcController c = new CalcController(new Calculator() {
//      @Override
//      public double process(String expression) {
//        if (expression.equals("1 + 1")) {
//          return 2;
//        }
//        if (expression.equals("+")) {
//          throw new CalculatorException("Invalid expression: +");
//        }
//        throw new CalculatorException("Unexpected input: "+ expression);
//      }
//    });
//    assertEquals("2.0", c.result("1 + 1"));
//    assertEquals("Invalid expression: +", c.result("+"));
//  }
//}
