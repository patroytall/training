package patroytall.training.samples.tdd.calculator.v4;

public class Calculator {
  private long result;
  
  public long add(long integer) {
    result += integer;
    return result;
  }
  
  public long multiply(long integer) {
    return 0;
  }
}