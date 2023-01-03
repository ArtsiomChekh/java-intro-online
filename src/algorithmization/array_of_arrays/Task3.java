package algorithmization.array_of_arrays;
/*
  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

import java.util.Scanner;

public class Task3 {

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
      for (int[] ints : matrix) {
        for (int anInt : ints) {
          System.out.printf("%4d", anInt);
        }
        System.out.println();
      }

      System.out.println();

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа k (строка матрицы):");
      int k = scanner.nextInt();

      System.out.println("Введите значение для числа p (столбец матрицы):");
      int p = scanner.nextInt();

      scanner.close();

      for (int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[k][i] + " ");
      }

      System.out.println("\n" + "______________");

      for (int i = 0; i < matrix[0].length; i++) {
        System.out.println(matrix[i][p] + " ");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
