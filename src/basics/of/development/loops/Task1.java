package basics.of.development.loops;

/*
  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
  все числа от 1 до введенного пользователем числа.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите любое целое положительное число:");
      int n = scanner.nextInt();
      scanner.close();

      System.out.println(sumPreviousNumbers(n));

    } catch (InputMismatchException e) {
      e.printStackTrace();
    }
  }
  public static int sumPreviousNumbers(int i) {
    if (i == 1) {
      return 1;
    }
    return i + sumPreviousNumbers(i - 1);
  }
}
