package com.epam.training.algorithmization.decomposition;
/*
   Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
*/

import java.util.Scanner;

public class Task11 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа a:");
      int a = scanner.nextInt();

      System.out.println("Введите значение для числа b:");
      int b = scanner.nextInt();

      scanner.close();

      maxNumberOfDigits(a, b);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void maxNumberOfDigits(int a, int b) {
    int sizeOfFirst = Integer.toString(a).length();
    int sizeOfSecond = Integer.toString(b).length();

    if (sizeOfFirst > sizeOfSecond) {
      System.out.printf("%d > %d", a, b);
    } else if (sizeOfFirst < sizeOfSecond) {
      System.out.printf("%d < %d", a, b);
    } else {
      System.out.println("Числа равны");
    }
  }
}
