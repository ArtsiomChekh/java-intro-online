package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
  Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
  возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
  использовать декомпозицию.
*/

import java.util.Scanner;

public class Task14 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа k:");
      int k = scanner.nextInt();
      scanner.close();

      System.out.println("Все числа Армстронга на отрезке от 1 до " + k + ":");
      for (int i = 1; i < k; i++) {
        if (isArmstrongNumber(i)) {
          System.out.print(i + " ");
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static boolean isArmstrongNumber(int number) {
    int tempNumber, sum = 0;
    int originNumber = number;
    int n = Integer.toString(number).length();
    while (number != 0) {
      tempNumber = number % 10;
      sum += Math.pow(tempNumber, n);
      number /= 10;
    }
    return originNumber == sum;
  }

}
