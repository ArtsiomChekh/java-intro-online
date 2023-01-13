package com.epam.training.basics_of_development.algorithmization.one_dimensional_array;
/*
  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
*/

import java.util.Arrays;


public class Task4 {

  public static void main(String[] args) {

    try {
      //заполняем массив действительными числами
      double[] array = {0, 3, 6, 12, -12, 5.2, 42, -6.2, 13, 1};

      double minNumber = 0;
      double maxNumber = 0;
      int minNumberIndex = 0;
      int maxNumberIndex = 0;
      double temp;

      for (int i = 0; i < array.length; i++) {
        if (array[i] > maxNumber) {
          maxNumber = array[i];
          maxNumberIndex = i;
        }
      }
      for (int i = 0; i < array.length; i++) {
        if (array[i] < minNumber) {
          minNumber = array[i];
          minNumberIndex = i;
        }
      }

      temp = array[maxNumberIndex];
      array[maxNumberIndex] = array[minNumberIndex];
      array[minNumberIndex] = temp;

      System.out.println("Массив после замены: " + Arrays.toString(array));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
