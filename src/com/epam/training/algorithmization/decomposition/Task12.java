package com.epam.training.algorithmization.decomposition;
/*
  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
  являются числа, сумма цифр которых равна К и которые не большее N.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа k:");
      int k = scanner.nextInt();

      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();

      scanner.close();

      System.out.println(Arrays.toString(arrayCreator(k, n)));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int[] arrayCreator(int k, int n) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      int sum = 0;
      int j = i;
      while (j != 0) {
        sum += j % 10;
        j /= 10;
      }
      if (sum == k) {
        list.add(i);
      }
    }
    // переносим элементы в массив
    int[] array = new int[list.size()];
    for (int i = 0; i < array.length; i++) {
      array[i] = list.get(i);
    }
    return array;
  }


}


