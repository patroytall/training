package patroytall.training.samples.tdd.calculator.v2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  private Calculator calculator = new Calculator();
  
  @Test
  public void add_with0_returns0() {
    assertEquals(0, calculator.add(0));
  }

  @Test
  public void add_with1_returns1() {
    assertEquals(1, calculator.add(1));
  }
}
