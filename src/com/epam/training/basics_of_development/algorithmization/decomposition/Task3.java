package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
  Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
  треугольника.
*/

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите длину стороны а правильного шестиугольника: ");
      int a = scanner.nextInt();
      scanner.close();

      System.out.printf("Площадь правильного шестиугольника равана: %.2f", regularHehagonArea(a));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Правильный шестиугольник состоит из шести равных равносторонних треугольников. Расчитаем площадь.
  public static double triangleArea(int a) {
    return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
  }

  public static double regularHehagonArea(int a) {
    return 6 * triangleArea(a);
  }

}
