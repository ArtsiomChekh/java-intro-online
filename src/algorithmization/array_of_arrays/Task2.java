package algorithmization.array_of_arrays;
/*
  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
*/

public class Task2 {

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

      // выполним условие задания
      for (int i = 0; i < matrix.length; i++) {
        System.out.printf("%4d", matrix[i][i]);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
