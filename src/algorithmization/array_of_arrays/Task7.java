package algorithmization.array_of_arrays;
/*
  Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin ((I^2 - J^2) / N)
  и подсчитать количество положительных элементов в ней
*/

import java.util.Scanner;

public class Task7 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа N:");
      int n = scanner.nextInt();
      scanner.close();

      double[][] matrix = new double[n][n];
      int count = 0;

      // выполним инициализацию матрицы, выведем её на экран и посчитаем количество пололожительных елементов
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = Math.sin(((Math.pow(i, 2) - Math.pow(j, 2)) / n));
          System.out.printf("%6.2f", matrix[i][j]);
          if (matrix[i][j] > 0) {
            count++;
          }
        }
        System.out.println();
      }

      System.out.println("\n Количество положительных елементов: " + count);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
