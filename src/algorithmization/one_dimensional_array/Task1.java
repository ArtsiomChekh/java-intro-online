package algorithmization.one_dimensional_array;
/*
  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    try {
      int[] array = new int[10];
      int sum = 0;

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа K:");
      int k = scanner.nextInt();
      scanner.close();

      //заполним массив и проверим на кратность
      for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 100);
        if (array[i] % k == 0) {
          sum += array[i];
        }
      }

      System.out.println("Ответ: " + sum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
