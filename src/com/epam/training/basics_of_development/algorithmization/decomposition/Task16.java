package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
  Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
  декомпозицию.
*/

import java.util.Scanner;

public class Task16 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();
      scanner.close();

      int sum = sumOfOddNumbers(n);
      System.out.println("Сумма = " + sum);

      int evenDigitsCount = evenDigitsCount(sum);

      System.out.println("Число чётных цифр в сумме = " + evenDigitsCount);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static int sumOfOddNumbers(int n) {
    int minNumber = (int) Math.pow(10, n - 1);
    int sumOfOdd = 0;

    for (int number = minNumber; number < minNumber * 10; number++) {
      int temp = number;
      int numberLength = numberLength(number);

      while (temp != 0) {
        if ((temp % 10) % 2 != 0) {
          numberLength--;
        }
        temp /= 10;
      }

      if (numberLength == 0) {
        sumOfOdd += number;
      }
    }
    return sumOfOdd;
  }

  private static int numberLength(int number) {
    int numberLength = 0;

    while (number != 0) {
      numberLength++;
      number /= 10;
    }
    return numberLength;
  }

  private static int evenDigitsCount(int number) {
    int evenDigitsCount = 0;

    int numberLength = numberLength(number);

    for (int i = 1; i <= numberLength; i++) {
      int digit = (int) (number / Math.pow(10, i - 1)) % 10;

      if (digit % 2 == 0) {
        evenDigitsCount++;
      }
    }

    return evenDigitsCount;
  }

}
