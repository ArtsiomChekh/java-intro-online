package basics_of_development.loops;
/*
Найти сумму квадратов первых ста чисел 1-100
*/

public class Task3 {

  public static void main(String[] args) {

    try {

      int sumOfSquares = 0;

      for (int i = 1; i <= 100; i++) {
        sumOfSquares += (int) Math.pow(i, 2);
      }

      System.out.println("Сумма квадратов первых ста чисел: " + sumOfSquares);

    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
  }
}
