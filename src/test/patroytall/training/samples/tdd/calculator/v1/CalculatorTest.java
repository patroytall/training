package patroytall.training.samples.tdd.calculator.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  private Calculator calculator = new Calculator();
  
  @Test
  public void add_with0_returns0() {
    assertEquals(0, calculator.add(0));
  }
}
