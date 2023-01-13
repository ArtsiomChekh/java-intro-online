package com.epam.training.basics_of_development.algorithmization.one_dimensional_array;
/*
  Даны действительные числa a1, a2,....an. Найти max(a1 + a2n, a2 + a2n-1, ..., аn + an+1)
*/

public class Task7 {

  public static void main(String[] args) {

    try {
      double[] array = {0, 3, 6, 12, -12, 5.2, 42, -6.2, 13, 1};

      // найдем максимальное число из чисел [a1+a10,a2+a9,a3+a8,a4+a7,a5+a6]
      double maxSum = array[0] + array[array.length - 1];

      for (int i = 1; i < array.length / 2; i++) {
        if ((array[i] + array[array.length - 1 - i]) > maxSum) {
          maxSum = array[i] + array[array.length - 1 - i];
        }
      }

      System.out.println("Ответ: " + maxSum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
