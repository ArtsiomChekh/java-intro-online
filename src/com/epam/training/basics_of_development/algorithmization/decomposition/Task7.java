package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class Task7 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

      for (int i = 0; i < array.length; i += 2) {
        System.out.printf("Факториал !%d равен: %d \n", array[i], factorial(array[i]));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Факториал числа n — это произведение натуральных чисел от 1 до n.
  public static int factorial(int a) {
    if (a == 1) {
      return 1;
    }
    return a * factorial(a - 1);
  }

}
