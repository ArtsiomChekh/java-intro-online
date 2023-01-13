package com.epam.training.basics_of_development.loops;
/*
  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task8 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите значение для первого числа:");
      String firstNumber = scanner.nextLine();

      System.out.println("Введите значение для второго числа:");
      String secondNumber = scanner.nextLine();

      scanner.close();
// Использую Set, чтобы избежать повторений
      Set<Character> list = new HashSet<>();
// Прохожу двумя циклами по всем цифрам и сравниваю их
      for (int i = 0; i < firstNumber.length(); i++) {
        for (int j = 0; j < secondNumber.length(); j++) {
          if (firstNumber.charAt(i) == secondNumber.charAt(j)) {
            list.add(firstNumber.charAt(i));
          }
        }
      }
      for (Character cha : list) {
        System.out.print(cha + " ");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

