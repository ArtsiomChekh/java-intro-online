package com.epam.training.basics_of_development.algorithmization.array_of_arrays;
/*
  Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class Task10 {

  public static void main(String[] args) {

    try {
      // создадим и заполним произвольно матрицу
      int[][] matrix = {
          {2, -40, 81, 72, 11},
          {4, 66, 13, 12, -11},
          {4, 32, -12, 12, 23},
          {2, -42, 24, 111, 4},
          {1, 42, 722, 2, -1}
      };

      // выведем на экран
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      System.out.println("Положительные элементы главной диагонали: ");
      for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][i] > 0) {
          System.out.print(matrix[i][i] + " ");
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
