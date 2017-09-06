package patroytall.training.samples.tdd.calculator.v5;

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

  @Test
  public void add_with1then0_returns0() {
    calculator.add(1);
    long result = calculator.add(0);

    assertEquals(1, result);
  }

  @Test
  public void multiply_with0_returns0() {
    assertEquals(0, calculator.multiply(0));
  }

  /**
   * This test superseded all conditions that only multiply and return 0 like with0then0, with0then1, and with1then0
   * because they do not fail.
   */
  @Test
  public void addAndMultiply_withAdd1Multiply1_returns1() {
    calculator.add(1);
    long result = calculator.multiply(1);

    assertEquals(1, result);
  }
}
