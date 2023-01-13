package com.epam.training.algorithmization.array_of_arrays;
/*
  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n (n - четное):");
      int n = scanner.nextInt();
      scanner.close();

      // выбросим исключение в случае ввода нечетного числа
      if (n % 2 != 0) {
        throw new InputMismatchException();
      }

      int[][] matrix = new int[n][n];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (i % 2 == 0) {
            matrix[i][j] = j + 1;
          } else {
            matrix[i][j] = n - j;
          }
        }
      }

      // выведем на экран результат
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Введите четное число в следующий раз");
    }
  }
}
