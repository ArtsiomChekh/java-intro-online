package algorithmization.decomposition;
/*
  Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
  являются цифры числа N.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа N:");
      int n = scanner.nextInt();
      scanner.close();

      System.out.printf("Массив из числа %d: %s", n, Arrays.toString(arrayCreator(n)));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int[] arrayCreator(int n) {

    int arraySize = Integer.toString(n).length();
    int[] array = new int[arraySize];

    while (n != 0) {
      array[--arraySize] = n % 10;
      n /= 10;
    }
    return array;
  }
}
