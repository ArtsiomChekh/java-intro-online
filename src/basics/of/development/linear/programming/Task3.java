package basics.of.development.linear.programming;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   ((sin x + cos y) / (cos x - sin y)) * tg xy
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для x:");
      double x = scanner.nextDouble();

      System.out.println("Введите значение для y:");
      double y = scanner.nextDouble();

      double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
      System.out.printf("Значение равно: %.2f", result);

      scanner.close();

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: 2 | 2.3 | 2.423");
    }
  }
}
