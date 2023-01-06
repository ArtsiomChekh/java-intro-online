package algorithmization.array_sorting;
/*
  Сортировка вставками. Дана последовательность чисел a1, a2, ... an. Требуется переставить
  числа в порядке возрастания. Делается это следующим образом. Пусть a1, a2, ... ai. -
  упорядоченная последовательность, т. е. a1<=a2...<=an. Берется следующее число ai+1 a
  и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
  Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
  Примечание. Место помещения очередного элемента в отсортированную часть производить
  с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

import java.util.Arrays;

public class Task5 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{2, 3, 1, 12, 51, 35, 12, 21, 7, 10};

      for (int i = 1; i < array.length; i++) {
        int j = i - 1;
        int element = array[i];

        // находим место, где выбранный элемент должен встать
        int locationOfElement = binarySearch(array, element, 0, j);

        while (j >= locationOfElement) {
          array[j + 1] = array[j];
          j--;
        }
        array[j + 1] = element;

      }

      System.out.println(Arrays.toString(array));

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static int binarySearch(int[] anyArray, int selectedElement, int min, int max) {
    while (min <= max) {
      int mid = min + (max - min) / 2;
      if (selectedElement == anyArray[mid]) {
        return mid + 1;
      } else if (selectedElement > anyArray[mid]) {
        min = mid + 1;
      } else {
        max = mid - 1;
      }
    }

    return min;
  }

}
