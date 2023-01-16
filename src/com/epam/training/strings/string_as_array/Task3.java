package com.epam.training.strings.string_as_array;
/*
   В строке найти количество цифр.
*/

public class Task3 {

  public static void main(String[] args) {

    try {

      String stringWithDigits = "Nice to meet you. 2023 was running";

      System.out.println("Количетво цифр в строке: " + numberOfDigits(stringWithDigits));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int numberOfDigits(String string) {
    int count = 0;
    char[] chars = new char[string.length()];

    for (int i = 0; i < chars.length; i++) {
      chars[i] = string.charAt(i);
      if (Character.isDigit(chars[i])) {
        count++;
      }
    }
    return count;
  }

}
