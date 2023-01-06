package algorithmization.array_sorting;
/*
  Сортировка обменами. Дана последовательность чисел  a1<=a2...<=an. Требуется переставить числа в
  порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то
  делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
  в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

import java.util.Arrays;

public class Task4 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{2, 4, 4, 12, 51, 62, 272, 400, 2000, 10000};

      // сортировка обменами
      for (int i = 0; i < array.length; i++) {
        int temp;
        for (int j = 0; j < array.length; j++) {
          if (array[i] > array[j]) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }

      System.out.println(Arrays.toString(array));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
