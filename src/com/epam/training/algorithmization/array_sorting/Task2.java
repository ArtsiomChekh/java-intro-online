package com.epam.training.algorithmization.array_sorting;

import java.util.Arrays;

/*
  Даны две последовательности a1<=a2...<=an; b1<=<b2...<=bn. Образовать из них новую последовательность
  чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

*/
public class Task2 {

  public static void main(String[] args) {

    try {
      int[] firstArray = new int[]{2, 4, 4, 12, 51, 62, 272, 400, 2000, 10000};

      int[] secondArray = new int[]{1, 4, 9, 20, 201, 2021};

      int n = 0;
      int[] result = new int[firstArray.length + secondArray.length];

      for (int i = 0; i < result.length; i++) {
        if (i < firstArray.length) {
          result[i] = firstArray[i];
        } else {
          result[i] = secondArray[i - firstArray.length];
        }
      }

      Arrays.sort(result);

      System.out.println("Результат: " + Arrays.toString(result));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
