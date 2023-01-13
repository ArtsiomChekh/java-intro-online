package com.epam.training.basics_of_development.algorithmization.one_dimensional_array;

/*
  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
*/
public class Task5 {

  public static void main(String[] args) {

    try {
      int[] array = new int[10];

      // заполним массив и выполним наше условие
      for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 10);
        if (array[i] > i) {
          System.out.print(array[i] + " ");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
