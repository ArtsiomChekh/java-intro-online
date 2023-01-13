package com.epam.training.algorithmization.array_of_arrays;
/*
  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
  которых число 5 встречается три и более раз.
*/

public class Task11 {

  public static void main(String[] args) {

    try {

      int[][] matrix = new int[10][20];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = (int) (Math.random() * (15 + 1));
          System.out.printf("%4d", matrix[i][j]);
        }
        System.out.println();
      }

      for (int i = 0; i < matrix.length; i++) {
        int countOfFive = 0;
        int numberOfLine = 0;
        for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] == 5) {
            countOfFive++;
          }
        }
        if (countOfFive >= 3) {
          numberOfLine = i;
          System.out.println("В строке номер " + (i + 1) + " число 5 встречается три и более раз");
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
