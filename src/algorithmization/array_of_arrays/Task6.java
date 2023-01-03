package algorithmization.array_of_arrays;
/*
  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

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

      for (int i = 0; i < n; i++) {
        if (i <= (n / 2) - 1) {
          for (int j = i; j < n - i; j++) {
            matrix[i][j] = 1;
          }
        } else if (i > n / 2) {
          for (int j = matrix[i].length - 1 - i; j < i + 1; j++) {
            matrix[i][j] = 1;
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
