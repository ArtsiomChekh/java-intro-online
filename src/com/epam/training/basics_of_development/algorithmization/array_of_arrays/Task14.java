package com.epam.training.basics_of_development.algorithmization.array_of_arrays;
/*
  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
  единиц равно номеру столбца.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task14 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа m:");
      int m = scanner.nextInt();

      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();

      scanner.close();

      if (n > m) {
        throw new InputMismatchException();
      }

      int[][] matrix = new int[m][n];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = 0;
          if (i < matrix[i].length && i <= j) {
            for (int k = i; k >= 0; k--) {
              matrix[k][j] = 1;
            }
          }
        }
      }

      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("m должно быть больше или равно n");
    }
  }

}
