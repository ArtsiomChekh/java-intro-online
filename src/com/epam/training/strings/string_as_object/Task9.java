package com.epam.training.strings.string_as_object;
/*
  Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
  Учитывать только английские буквы.
*/

import java.util.Scanner;

public class Task9 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите строку: ");
      String text = scanner.nextLine();
      scanner.close();

      System.out.println("Количество строчных букв: " + numberOfLowerCase(text));
      System.out.println("Количество прописных букв: " + numberOfUppercase(text));


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int numberOfUppercase (String string) {
    int count = 0;
    string.replaceAll("\\p{Punct}|\\s", "");

    for (int i = 0; i < string.length(); i++) {
      if (Character.isUpperCase(string.charAt(i))) {
        count++;
      }
    }

    return count;
  }

  public static int numberOfLowerCase (String string) {
    int count = 0;
    string.replaceAll("\\p{Punct}|\\s", "");

    for (int i = 0; i < string.length(); i++) {
      if (Character.isLowerCase(string.charAt(i))) {
        count++;
      }
    }

    return count;
  }

}
