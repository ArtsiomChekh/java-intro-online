package com.epam.training.basics_of_development.algorithmization.array_of_arrays;

/*
  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/
public class Task12 {

  public static void main(String[] args) {

    try {
      // создадим и выведем на экран неотсортированную матрицу
      int[][] matrix = new int[5][5];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = (int) (Math.random() * (30 + 1)) - 15;
          System.out.printf("%4d", matrix[i][j]);
        }
        System.out.println();
      }

      // сортировка по возрастанию
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          for (int k = 0; k < matrix[j].length; k++) {
            int temp;
            if (matrix[i][j] < matrix[i][k]) {
              temp = matrix[i][j];
              matrix[i][j] = matrix[i][k];
              matrix[i][k] = temp;
            }
          }
        }
      }

      System.out.println("Отсортированная по возрастанию матрица:");
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      // сортировка по убыванию
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          for (int k = 0; k < matrix[j].length; k++) {
            int temp;
            if (matrix[i][j] > matrix[i][k]) {
              temp = matrix[i][j];
              matrix[i][j] = matrix[i][k];
              matrix[i][k] = temp;
            }
          }
        }
      }

      System.out.println("Отсортированная по убыванию матрица:");
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
