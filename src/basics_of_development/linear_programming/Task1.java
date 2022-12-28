package basics_of_development.linear_programming;

// Найдите значение функции: z = ((a - 3) * b / 2) + c

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для a:");
      double a = scanner.nextDouble();

      System.out.println("Введите значение для b:");
      double b = scanner.nextDouble();

      System.out.println("Введите значение для c:");
      double c = scanner.nextDouble();

      double z = ((a - 3) * b / 2) + c;
      System.out.printf("z равно: %.2f", z);

      scanner.close();

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: 2 | 2.3 | 2.423");
    }
  }
}
