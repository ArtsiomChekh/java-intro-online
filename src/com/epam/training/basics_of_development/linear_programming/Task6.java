package com.epam.training.basics_of_development.linear_programming;

/* Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
   принадлежит закрашенной области, и false — в противном случае:
                                            Y
                                {0,0,0,0,0,0|0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0|0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0|0,0,0,0,0,0,0,0},
                                {0,0,0,0,X,X|X,X,0,0,0,0,0,0},
                                {0,0,0,0,X,X|X,X,0,0,0,0,0,0},
                                {0,0,0,0,X,X|X,X,0,0,0,0,0,0},
                                {0_0_0_0_X_X|X_X_0_0_0_0_0_0},X
                                {0,0,X,X,X,X|X,X,X,X,0,0,0,0},
                                {0,0,X,X,X,X|X,X,X,X,0,0,0,0},
                                {0,0,X,X,X,X|X,X,X,X,0,0,0,0},
                                {0,0,0,0,0,0|0,0,0,0,0,0,0,0}
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значениe для x:");
      int x = scanner.nextInt();

      System.out.println("Введите значениe для y:");
      int y = scanner.nextInt();

      scanner.close();

      if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
        System.out.print("true");
      } else {
        System.out.print("false");
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: x >= -6 && x <= 8 | y >= -4 && y <= 7");
    }
  }
}

