package com.epam.training.algorithmization.decomposition;
/*
   Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
   действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

import java.util.Scanner;

public class Task17 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа:");
      int number = scanner.nextInt();
      scanner.close();

      int count = 0;
      while (number > 0) {
        ++count;
        number -= getSumOfDigits(number);
      }

      System.out.println("Нужно произвести " + count + " действий.");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int getSumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

}
