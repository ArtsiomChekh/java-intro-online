package com.epam.training.basics_of_development.algorithmization.array_of_arrays;
/*
  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {

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

      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      int maxElement = 0;
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] > maxElement) {
            maxElement = matrix[i][j];
          }
        }
      }

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] % 2 != 0) {
            matrix[i][j] = maxElement;
          }
        }
      }

      System.out.println("Итоговая матрица:");
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

