package algorithmization.decomposition;
/*
  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
  если угол между сторонами длиной X и Y — прямой
*/

import java.util.Scanner;

public class Task9 {

  public static void main(String[] args) {
    try {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите длину стороны X: ");
      int x = scanner.nextInt();

      System.out.println("Введите длину стороны Y: ");
      int y = scanner.nextInt();

      System.out.println("Введите длину стороны Z: ");
      int z = scanner.nextInt();

      System.out.println("Введите длину стороны T: ");
      int t = scanner.nextInt();

      scanner.close();

      System.out.printf(
          "Площадь четыреугольника, если угол между сторонами длиной X и Y — прямой, равен: %.2f",
          areaOfRightQuadrilateral(x, y, z, t));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static double areaOfRightQuadrilateral(int x, int y, int z, int t) {
    //Диагональ напротив прямого угла, расчитаем по теореме Пифагора
    double d = Math.sqrt((x * x) + (y * y));
    // площадть прямоугольного треугольника
    double s1 = 0.5 * x * y;
    // находим полупериметр второго треугольника
    double p = (z + t + d) / 2;
    //площадь второго треуголька
    double s2 = Math.sqrt(p * (p - z) * (p - t) * (p - d));
    return s1 + s2;
  }


}
