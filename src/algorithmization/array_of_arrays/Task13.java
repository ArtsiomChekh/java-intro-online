package algorithmization.array_of_arrays;

/*
   Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.
*/
public class Task13 {

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
      for (int i = 0; i < matrix[0].length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          for (int k = 0; k < matrix.length; k++) {
            int temp;
            if (matrix[j][i] < matrix[k][i]) {
              temp = matrix[j][i];
              matrix[j][i] = matrix[k][i];
              matrix[k][i] = temp;
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
      for (int i = 0; i < matrix[0].length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          for (int k = 0; k < matrix.length; k++) {
            int temp;
            if (matrix[j][i] > matrix[k][i]) {
              temp = matrix[j][i];
              matrix[j][i] = matrix[k][i];
              matrix[k][i] = temp;
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
