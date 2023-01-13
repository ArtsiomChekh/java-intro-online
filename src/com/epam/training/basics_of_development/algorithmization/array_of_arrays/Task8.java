package com.epam.training.basics_of_development.algorithmization.array_of_arrays;
/*
  В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
  на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
  пользователь с клавиатуры.
*/

import java.util.Scanner;

public class Task8 {

  public static void main(String[] args) {

    try {
      // создадим и заполним произвольно матрицу
      int[][] matrix = {
          {2, 4, 8, 7, 1},
          {4, 6, 3, 1, 1},
          {4, 2, 2, 2, 2},
          {3, 4, 4, 1, 4},
          {1, 4, 7, 2, 1}
      };

      // выведем на экран
      for (int[] row : matrix) {
        for (int element : row) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

      Scanner scanner = new Scanner(System.in);

      System.out.println("Выберите первый столбец, который хотите поменять (0-4):");
      int x = scanner.nextInt();

      System.out.println(
          "Выберите второй столбец, на который хотите поменять первый столбец (0-4):");
      int y = scanner.nextInt();

      scanner.close();

      int temp;

      for (int i = 0; i < matrix.length; i++) {
        temp = matrix[i][x];
        matrix[i][x] = matrix[i][y];
        matrix[i][y] = temp;
      }
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
