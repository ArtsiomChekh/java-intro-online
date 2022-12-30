package algorithmization.one_dimensional_array;
/*
  Дана последовательность целых чисел a1,a2,...an. Образовать новую последовательность, выбросив из
  исходной те члены, которые равны min(a1,a2,...an)
*/

import java.util.Arrays;

public class Task8 {

  public static void main(String[] args) {

    try {
      int[] array = new int[10];
      int min = 0;

      // заполним массив рандомными целыми числами и найдем наименьшее число
      for (int i = 0; i < array.length; i++) {
        array[i] = ((int) (Math.random() * 35) - 10);
        if (array[i] < min) {
          min = array[i];
        }
      }

      System.out.println("Старая последовательность: " + Arrays.toString(array));

      int[] newArray = new int[array.length - 1];
      for (int i = 0, j = 0; i < array.length; i++) {
        if (array[i] != min) {
          newArray[j] = array[i];
          j++;
        }
      }

      System.out.println("Новая последовательность: " + Arrays.toString(newArray));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
