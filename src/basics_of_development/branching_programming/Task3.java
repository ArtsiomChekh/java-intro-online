package basics_of_development.branching_programming;

/*
  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для точки А:");
      System.out.println("x1:");
      int x1 = scanner.nextInt();
      System.out.println("y1:");
      int y1 = scanner.nextInt();

      System.out.println("Введите значение для точки B:");
      System.out.println("x2:");
      int x2 = scanner.nextInt();
      System.out.println("y2:");
      int y2 = scanner.nextInt();

      System.out.println("Введите значение для точки C:");
      System.out.println("x3:");
      int x3 = scanner.nextInt();
      System.out.println("y3:");
      int y3 = scanner.nextInt();

      scanner.close();

      if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
        System.out.println("Точки находятся на одной прямой");
      } else {
        System.out.println("Точки не находятся на одной прямой");
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }

}
