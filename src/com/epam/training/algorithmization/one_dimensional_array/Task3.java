package com.epam.training.algorithmization.one_dimensional_array;
/*
  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
  положительных и нулевых элементов.
*/
import java.util.Random;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа N:");
      int n = scanner.nextInt();
      scanner.close();

      Random random = new Random();

      int[] array = new int[n];

      int negative = 0;
      int positive = 0;
      int zero = 0;

      // заполняем массив рандомными числами
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(-(n / 2), n / 2);
        if (array[i] > 0) {
          positive++;
        } else if (array[i] < 0) {
          negative++;
        } else {
          zero++;
        }
      }

      System.out.println("Количество отрицательных: " + negative + "\n"
          + "Количество положительных: " + positive + "\n"
          + "Количество нулей: " + zero);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
