package com.epam.training.strings.string_as_object;
/*
  Из заданной строки получить новую, повторив каждый символ дважды.
*/

import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите слово: ");
      String word = scanner.nextLine();
      scanner.close();

      System.out.println("Результат: " + doubleCharacter(word));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String doubleCharacter(String string) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < string.length(); i++) {
      result.append(string.charAt(i)).append(string.charAt(i));
    }

    return result.toString();
  }

}
