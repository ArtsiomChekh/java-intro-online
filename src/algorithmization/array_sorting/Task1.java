package algorithmization.array_sorting;
/*
  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
  один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
  дополнительный массив.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    try {

      int[] firstArray = new int[]{2, 4, 4, 12, 51, 35, 12, 21, 2, 10};

      int[] secondArray = new int[]{1, 1, 1, 2, 2, 2};

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа k(k - натуральное, от 1 до 10):");
      int k = scanner.nextInt();
      scanner.close();

      int n = 0;
      int[] result = new int[firstArray.length + secondArray.length];

      for (int i = 0; i < result.length; i++) {
        if (i >= k && n < secondArray.length) {
          result[i] = secondArray[i - k];
          n++;
        } else {
          result[i] = firstArray[i - n];
        }
      }

      System.out.println("Результат: " + Arrays.toString(result));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
