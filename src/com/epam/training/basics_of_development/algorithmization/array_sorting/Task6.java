package com.epam.training.basics_of_development.algorithmization.array_sorting;
/*
   Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
   Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
   то продвигаются на один элемент вперед. Если ai >= ai+1, то производится перестановка и
   сдвигаются на один элемент назад.
   Составить алгоритм этой сортировки.
 */

import java.util.Arrays;

public class Task6 {

  public static void main(String[] args) {
    try {

      double[] array = {0, 3, 6, 12, -12, 5.2, 42, -6.2, 13, 1};
      System.out.println(Arrays.toString(array));
      shellSort(array);
      System.out.println(Arrays.toString(array));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void shellSort(double[] array) {
    int step = array.length / 2;
    while (step > 0) {
      for (int i = step; i < array.length; i++) {
        for (int j = i; j >= step && array[j] < array[j - step]; j -= step) {
          double temp = array[j];
          array[j] = array[j - step];
          array[j - step] = temp;
        }
      }
      step = step / 2;
    }
  }


}
