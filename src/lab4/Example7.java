package src.lab4;

public class Example7 {
  public static void main(String[] args) {
    try {
      System.out.println("0");
      throw new NullPointerException("ошибка");
    } catch (NullPointerException e) {
      System.out.println("1");
      throw new ArithmeticException();
    } catch (ArithmeticException e) {
      System.out.println("2");
    }
    System.out.println("3");
  }
}
