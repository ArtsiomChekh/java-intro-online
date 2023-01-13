package com.epam.training.basics_of_development.loops;
/*
  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
  m и n вводятся с клавиатуры.
*/

import java.util.Scanner;

public class Task7 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для числа m:");
      int m = scanner.nextInt();

      System.out.println("Введите значение для числа n:");
      int n = scanner.nextInt();

      scanner.close();

      for (int i = m; i <= n; i++) {
        System.out.print(i + ": ");
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            System.out.print(j + ",");
          }
        }
        System.out.println();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
