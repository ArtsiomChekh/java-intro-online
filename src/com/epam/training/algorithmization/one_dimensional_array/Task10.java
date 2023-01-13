package com.epam.training.algorithmization.one_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

/*
  Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
  элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/
public class Task10 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();
      scanner.close();

      int[] array = new int[n];

      // заполним массив рандомными целыми числами
      for (int i = 0; i < array.length; i++) {
        array[i] = ((int) (Math.random() * 35) - 10);
      }

      System.out.println(Arrays.toString(array));

      // заполним каждый второй элемент массива нулями
      for (int i = 1; i < array.length; i += 2) {
        array[i] = 0;
      }

      System.out.println(Arrays.toString(array));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
