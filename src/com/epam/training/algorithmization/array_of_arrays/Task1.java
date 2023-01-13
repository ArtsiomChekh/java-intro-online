package com.epam.training.algorithmization.array_of_arrays;
/*
  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/

public class Task1 {

  public static void main(String[] args) {

    try {
      // создадим и заполним произвольно матрицу
      int[][] matrix = {
          {2, 4, 8, 7, 1},
          {4, 66, 123, 12, 1},
          {24, 32, 12, 12, 23},
          {23, 42, 24, 1, 4},
          {1, 4, 7, 2, 1}
      };

      // выведем на экран
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      System.out.println();

      // выполним условие задания
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j += 2) {
          if (matrix[0][j] > matrix[matrix.length - 1][j]) {
            System.out.printf("%4d", matrix[i][j]);
          }
        }
        System.out.println();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
