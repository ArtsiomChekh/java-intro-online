package basics_of_development.branching_programming;
/*
  Вычислить значение функции: F(x) = x^2 - 3x + 9 если (x <= 3) &&  1 / (x^2 + 6) если (x > 3)
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для x:");
      int x = scanner.nextInt();
      scanner.close();

      double result;

      if (x < 3 || x == 3) {
        result = Math.pow(x, 2) - (3 * x) + 9;
      } else {
        result = 1 / (Math.pow(x, 2) + 6);
      }

      System.out.printf("Значение функции равно: %.2f", result);

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }

}
