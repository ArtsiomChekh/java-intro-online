package basics_of_development.branching_programming;

/*
  Найти max{min(a, b), min(c, d)}.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для a:");
      int a = scanner.nextInt();

      System.out.println("Введите значение для b:");
      int b = scanner.nextInt();

      System.out.println("Введите значение для c:");
      int c = scanner.nextInt();

      System.out.println("Введите значение для d:");
      int d = scanner.nextInt();

      scanner.close();

      int minAb;
      int minCd;
      int maxAbCd;

      if (a < b) {
        minAb = a;
      } else {
        minAb = b;
      }
      if (c < d) {
        minCd = c;
      } else {
        minCd = d;
      }
      if (minAb > minCd) {
        maxAbCd = minAb;
      } else {
        maxAbCd = minCd;
      }

      System.out.println("Ответ: " + maxAbCd);

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
