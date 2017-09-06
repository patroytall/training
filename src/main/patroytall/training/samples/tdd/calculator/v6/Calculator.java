package patroytall.training.samples.tdd.calculator.v6;

public class Calculator {
  private long result;
  
  public long add(long integer) {
    result += integer;
    return result;
  }
  
  public long multiply(long integer) {
    result *= integer;
    return result;
  }
}