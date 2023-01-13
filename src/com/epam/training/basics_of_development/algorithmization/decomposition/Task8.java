package com.epam.training.basics_of_development.algorithmization.decomposition;
/*
  Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
  Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
  массива с номерами от k до m.
*/

public class Task8 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{2, 4, 4, 12, 51, 62, 72, 13, 123, 12, 23, 214, 1, 2, 3, 4, 12, 1};

      sumOfThree(array);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void sumOfThree(int[] array) {
    for (int k = 0; k < array.length - 2; k += 3) {
      int sum = 0;
      for (int m = 0; m < 3; m++) {
        sum += array[k + m];
      }
      System.out.println("Cумма трех элементов равана: " + sum);
    }
  }
}


