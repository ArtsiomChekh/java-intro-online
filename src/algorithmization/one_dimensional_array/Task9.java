package algorithmization.one_dimensional_array;
/*
  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
  Если таких чисел несколько, то определить наименьшее из них.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

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

      // создадим и заполним массив количеством повторений у елементов массива "array";
      int[] arrayOfCount = new int[array.length];

      for (int i = 0; i < array.length; i++) {
        for (int k : array) {
          if (array[i] == k) {
            arrayOfCount[i]++;
          }
        }
      }

      // найдем наиболее повторяющийся елемент. Если есть елемент с таким же количеством повторений,
      // то в определим наименьший из них
      int valueOfArrayElement = array[0];
      int maxFreqCount = arrayOfCount[0];

      for (int i = 0; i < arrayOfCount.length; i++) {
        if (arrayOfCount[i] > maxFreqCount) {
          maxFreqCount = arrayOfCount[i];
          valueOfArrayElement = array[i];
        }
        if ((maxFreqCount == arrayOfCount[i]) && (array[i] < valueOfArrayElement)) {
          valueOfArrayElement = array[i];
        }
      }

      System.out.println("Ответ: " + valueOfArrayElement);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
