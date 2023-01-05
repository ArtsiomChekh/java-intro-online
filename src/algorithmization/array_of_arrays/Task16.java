package algorithmization.array_of_arrays;
/*
  Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная
  из чисел 1, 2, 3,...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой
  из двух больших диагоналей равны между собой. Построить такой квадрат.
  Пример магического квадрата порядка 3:
  6 1 8
  7 5 3
  2 9 4
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task16 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n(n - нечетное):");
      int n = scanner.nextInt();
      scanner.close();

      if (n % 2 == 0) {
        throw new InputMismatchException("Значение числа n должно быть нечетным");
      }

      int[][] magicSquare = new int[n][n];

      int i = n / 2;
      int j = n - 1;

      for (int k = 1; k <= n * n; ) {
        if (i == -1 && j == n) {
          j = n - 2;
          i = 0;
        } else {
          if (j == n) {
            j = 0;
          }
          if (i < 0) {
            i = n - 1;
          }
        }
        if (magicSquare[i][j] != 0) {
          j -= 2;
          i++;
          continue;
        } else {
          magicSquare[i][j] = k++;
          j++;
          i--;
        }
      }

      System.out.println("Итоговая матрица:");
      for (int[] line : magicSquare) {
        for (int element : line) {
          System.out.printf("%4d", element);
        }
        System.out.println();
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
