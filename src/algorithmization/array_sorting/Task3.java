package algorithmization.array_sorting;
/*
  Сортировка выбором. Дана последовательность чисел
  a1<=a2...<=an. Требуется переставить элементы так,
  чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
  элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго,
  эта процедура повторяется. Написать алгоритм сортировки выбором.
*/

import java.util.Arrays;

public class Task3 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{2, 4, 4, 12, 51, 62, 272, 400, 2000, 10000};

      // сортировка выбором
      for (int i = 0; i < array.length - 1; i++) {
        int index = i;
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] > array[index]) {
            index = j;
          }
        }
        int largestNumber = array[index];
        array[index] = array[i];
        array[i] = largestNumber;
      }

      System.out.println(Arrays.toString(array));

      int[] secondArray = new int[]{2, 4, 4, 12, 51, 62, 272, 400, 2000, 10000};

      // сортировка выбором (способ 2)
      for (int i = 0; i < secondArray.length; i++) {
        int temp;
        for (int j = 0; j < secondArray.length; j++) {
          if (secondArray[i] > secondArray[j]) {
            temp = secondArray[i];
            secondArray[i] = secondArray[j];
            secondArray[j] = temp;
          }
        }
      }

      System.out.println(Arrays.toString(secondArray));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
