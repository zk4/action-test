//package com.zk;
//
//import com.example.demo.calculator.Calculator;
//import com.example.demo.calculator.CalculatorException;
//import com.example.demo.calculator.CalculatorImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
//
//
//public class CalculatorTest {
//  @ParameterizedTest(name = ="")
//  @Parameterized.Parameters(name = "{index}: CalculatorTest({0})={1}, throws {2}")
//  public static Collection<Object[]> data() {
//    return Arrays.asList(new Object[][]{
//      {"1 + 1", 2, null},
//      {"1 + 1 + 1", 3, null},
//      {"1–1", 0, null},
//      {"1 * 1", 1, null},
//      {"1 / 1", 1, null},
//      {"( 1 + 1 )", 2, null},
//      {"+", 0, new CalculatorException("Invalid expression: +")},
//      {"1 1", 0, new CalculatorException("Invalid expression: 1 1")}
//    });
//  }
//
//  private final String input;
//  private final double expected;
//  private final Exception exception;
//
//  public CalculatorTest(String input, double expected, Exception exception) {
//    this.input = input;
//    this.expected = expected;
//    this.exception = exception;
//  }
//
//  @Test
//  public void testProcess() {
//    Calculator c = new CalculatorImpl();
//    try {
//      double result = c.process(input);
//      if (exception != null) {
//        fail("should have thrown an exception: " + exception);
//      }
//      // shouldn't compare doubles without a delta, because FP math isn't accurate
//      assertEquals(expected, result, 0.000001);
//    } catch (Exception e) {
//      if (exception == null) {
//        fail("should not have thrown an exception, but threw " + e);
//      }
//      if (!exception.getClass().equals(e.getClass()) || !exception.getMessage().equals(e.getMessage())) {
//        fail("expected exception " + exception + "; got exception " + e);
//      }
//    }
//  }
//}