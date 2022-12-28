package basics.of.development.branching.programming;
/*
  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
  отверстие.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для A:");
      int a = scanner.nextInt();

      System.out.println("Введите значение для B:");
      int b = scanner.nextInt();

      System.out.println("Введите значение для x:");
      int x = scanner.nextInt();

      System.out.println("Введите значение для y:");
      int y = scanner.nextInt();

      System.out.println("Введите значение для z:");
      int z = scanner.nextInt();

      if (a >= x && a >= y || b >= x && b >= y ||
          a >= x && a >= z || b >= x && b >= z ||
          a >= y && a >= z || b >= y && b >= z) {
        System.out.println("Кирпич пройдет");
      } else {
        System.out.println("Кирпич не пройдет");
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
