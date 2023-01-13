package com.epam.training.basics_of_development.algorithmization.one_dimensional_array;
/*
  Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
  являются простыми числами.
*/

public class Task6 {

  public static void main(String[] args) {

    try {
      double[] array = {0, 3, 6, 12, -12, 5.2, 42, -6.2, 13, 1};

      double sum = 0;

      for (int i = 0; i < array.length; i++) {
        if (isPrime(i)) {
          sum += array[i];
        }
      }

      System.out.println("Cумма чисел: " + sum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  // алгоритм нахождения простого числа
  public static boolean isPrime(int n) {
    if (n == 2 || n == 3) {
      return true;
    }

    if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
      return false;
    }

    for (int i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }
}
