public class ExceptionHandling {
  public static void main(String[] args) {
      try {
          int result = divide(10, 0); // This will cause an ArithmeticException
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          System.err.println("Error: Cannot divide by zero.");
      } finally {
          System.out.println("Execution continues...");
      }
  }

  public static int divide(int a, int b) {
      return a / b;
  }
}
