package basics_of_development.linear_programming;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   ((𝑏 + √(𝑏^2 + 4ac)) / 2a) - a^3 * c + b^-2
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для a:");
      double a = scanner.nextDouble();

      System.out.println("Введите значение для b:");
      double b = scanner.nextDouble();

      System.out.println("Введите значение для c:");
      double c = scanner.nextDouble();

      double result =
          ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - ((Math.pow(a, 3) * c)
              + Math.pow(b, -2));
      System.out.printf("Значение равно: %.2f", result);

      scanner.close();

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: 2 | 2.3 | 2.423");
    }
  }
}
