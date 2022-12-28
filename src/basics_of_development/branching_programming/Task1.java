package basics_of_development.branching_programming;
/*
  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
  он прямоугольным.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для первого угла :");
      int x = scanner.nextInt();

      System.out.println("Введите значение для второго угла:");
      int y = scanner.nextInt();

      if (x + y < 180 && x + y > 0) {
        System.out.println("Треугольник существует");
        if (x == 90 || y == 90 || x + y == 90) {
          System.out.println("Треугольник прямоугольный");
        } else {
          System.out.println("Треугольник не прямоугольный");
        }
      } else {
        System.out.println("Треугольник не существует");
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: 20 | 30 | 90");
    }
  }
}
