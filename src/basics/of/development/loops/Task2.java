package basics.of.development.loops;
/*
  Вычислить значения функции на отрезке [а,b] c шагом h
  y = x, (x > 2) & -x, (x <= 2)
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа a (начало отрезка):");
      int a = scanner.nextInt();

      System.out.println("Введите значение для числа b (конец отрезка):");
      int b = scanner.nextInt();

      System.out.println("Введите значение для числа h (шаг):");
      int h = scanner.nextInt();
      scanner.close();

      int y = 0;

      for (int i = a; i <= b; i += h) {
        if (i > 2) {
          y = i;
        } else {
          y = i * (-1);
        }
      }

      System.out.println("Ответ: " + y);

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
