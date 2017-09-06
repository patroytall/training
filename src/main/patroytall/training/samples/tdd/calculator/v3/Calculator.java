package patroytall.training.samples.tdd.calculator.v3;

public class Calculator {
  private long result;
  
  public long add(long integer) {
    result += integer;
    return result;
  }
}