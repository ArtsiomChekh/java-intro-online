package com.epam.training.strings.string_as_object;
/*
  Проверить, является ли заданное слово палиндромом
*/

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите слово: ");
      String word = scanner.nextLine();
      scanner.close();

      System.out.println(
          word + " слово палиндром? (с помошью первого варианта) \n" + isPalindromeV1(word));
      System.out.println(
          word + " слово палиндром? (с помощью второго варианта) \n" + isPalindromeV2(word));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static boolean isPalindromeV1(String word) {

    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
        return true;
      }
    }
    return false;
  }

  public static boolean isPalindromeV2(String word) {
    boolean palindrome = true;
    StringBuilder builder = new StringBuilder(word);

    String data = builder.reverse().toString();

    if (word.equalsIgnoreCase(data)) {
      return true;
    }

    return false;
  }


}
