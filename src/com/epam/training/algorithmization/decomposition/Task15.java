package com.epam.training.algorithmization.decomposition;
/*
   Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
   последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
*/

import java.util.Scanner;

public class Task15 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();
      scanner.close();

      long maxNumberIn = (long) Math.pow(10, n) - 1;

      System.out.printf(
          "Все натуральные %d-значные числа, в которых соблюдаеться строгая последовательность:",
          n);

      for (long i = maxNumberIn / 10; i <= maxNumberIn; i++) {
        if (isStrictOrder(i)) {
          System.out.print(i + " ");
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static boolean isStrictOrder(long number) {
    long tempNumber;
    boolean strictOrder = false;
    int n = Long.toString(number).length();
    long[] array = new long[n];
    int j = 0;

    while (number != 0) {
      tempNumber = number % 10;
      array[j++] = tempNumber;
      number /= 10;
    }
    return isAscendingSort(array) || isDescendingSort(array);
  }

  public static boolean isAscendingSort(long[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isDescendingSort(long[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] < array[i + 1]) {
        return false;
      }
    }
    return true;
  }

}
