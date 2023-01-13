package com.epam.training.algorithmization.decomposition;
/*
   Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/

public class Task2 {

  public static void main(String[] args) {

    try {

      int a = 428;
      int b = 122;
      int c = 450;
      int d = 40;

      System.out.println("НОД для 4 натуарльных чисел: " + nodByEvklidFour(a, b, c, d));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int nodByEvklidFour(int a, int b, int c, int d) {
    int e = 0;
    return nodByEvklid(nodByEvklid(a, b), nodByEvklid(c, d));
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
