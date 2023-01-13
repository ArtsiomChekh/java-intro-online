package com.epam.training.algorithmization.array_of_arrays;
/*
  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
  столбец содержит максимальную сумму.
*/

public class Task9 {

  public static void main(String[] args) {

    try {
      // создадим и заполним неотрицательными числами матрицу
      int[][] matrix = {
          {2, 24, 8, 7, 10},
          {4, 64, 3, 1, 13},
          {4, 21, 2, 2, 24},
          {3, 32, 4, 1, 41},
          {1, 41, 7, 2, 11}
      };

      // выведем на экран
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      int maxSumColumn = 0;
      int numberOfMaxSumColumn = 0;

      for (int i = 0; i < matrix[0].length; i++) {
        int sumColumn = 0;
        for (int j = 0; j < matrix.length; j++) {
          sumColumn = sumColumn + matrix[j][i];
        }
        System.out.println("Сумма элементов в столбце " + (i + 1) + " = " + sumColumn);
        if (sumColumn > maxSumColumn) {
          maxSumColumn = sumColumn;
          numberOfMaxSumColumn = i + 1;
        }
      }

      System.out.println(
          "Столбец " + numberOfMaxSumColumn + " содержит максимальную сумму элементов = "
              + maxSumColumn);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
