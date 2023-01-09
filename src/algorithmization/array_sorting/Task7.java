package algorithmization.array_sorting;

import java.util.Arrays;

/*
  Пусть даны две неубывающие последовательности действительных чисел a1<=a2...<=an и b1<=b2...<=bn.
  Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2...<=bn
  в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/
public class Task7 {

  public static void main(String[] args) {

    try {

      int[] firstArray = new int[]{2, 4, 4, 12, 51, 62};

      int[] secondArray = new int[]{1, 4, 9, 20, 201, 272, 400, 2000, 10000};

      int[] result = new int[firstArray.length + secondArray.length];

      int indexOfFirst = 0;
      int indexOfSecond = 0;

      for (int index = 0; index < result.length; ) {

        if (indexOfFirst < firstArray.length && indexOfSecond < secondArray.length) {
          if (firstArray[indexOfFirst] < secondArray[indexOfSecond]) {

            result[index] = firstArray[indexOfFirst];
            indexOfFirst++;

          } else {
            result[index] = secondArray[indexOfSecond];
            System.out.println(
                "Число " + secondArray[indexOfSecond] + " нужно вставить по идексу " + index);
            indexOfSecond++;
          }
        } else if (indexOfFirst < firstArray.length) {
          result[index] = firstArray[indexOfFirst];
          indexOfFirst++;
        } else {
          result[index] = secondArray[indexOfSecond];
          System.out.println(
              "Число " + secondArray[indexOfSecond] + " нужно вставить в конец первого масива");
          indexOfSecond++;
        }

        index++;
      }

      System.out.println(Arrays.toString(result));


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}


