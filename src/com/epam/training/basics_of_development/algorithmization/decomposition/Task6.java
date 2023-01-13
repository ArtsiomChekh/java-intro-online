package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
   Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите первое число: ");
      int a = scanner.nextInt();

      System.out.println("Введите второе число: ");
      int b = scanner.nextInt();

      System.out.println("Введите третье число: ");
      int c = scanner.nextInt();

      scanner.close();

      System.out.println("Это взаимно простые числа?");
      System.out.println(isComprimeNumbers(a, b, c));

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  // взаимно простые числа — это целые числа, у которых нет общих делителей, кроме единицы.
  // Источник - Онлайн школа Skysmart: https://skysmart.ru/articles/mathematic/vzaimno-prostye-chisla
  public static boolean isComprimeNumbers(int a, int b, int c) {
    if (nodByEvklid(nodByEvklid(a, b), c) == 1) {
      return true;
    } else {
      return false;
    }
  }

  public static int nodByEvklid(int a, int b) {
    int c = 0;
    while (a != 0 && b != 0) {
      if (a > b) {
        a %= b;
      } else {
        b %= a;
      }
      c = a + b; //  Цикл завершается, когда хотя бы одна из переменных равна нулю.
    }
    return c;
  }

}
