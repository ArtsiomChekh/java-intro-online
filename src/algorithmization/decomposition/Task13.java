package algorithmization.decomposition;
/*
  Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
  Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
  решения задачи использовать декомпозицию.
*/

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task13 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа n (n>2):");
      int n = scanner.nextInt();
      if (n < 2) {
        throw new InputMismatchException("Введите число больше 2");
      }

      scanner.close();

      int[] array = new int[n * 2];
      // заполним массив числами
      for (int i = n, j = 0; i <= n * 2; i++) {
        array[j] = i;
        j++;
      }

      // находим и выводим близнецы
      int temp = array[0];
      for (int i = 0; i < array.length; i++) {
        temp = array[i];
        for (int j = 0; j < array.length; j++) {
          if (array[j] - 2 == temp) {
            System.out.println(temp + " " + array[j]);
          }
        }
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
