package com.epam.training.strings.string_as_array;
/*
  Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
  Крайние пробелы в строке удалить.
*/

public class Task5 {

  public static void main(String[] args) {

    try {

      String stringWithDigits = " Nice to meet   you.   I am glad to see you ";
      System.out.println(stringWithDigits);

      System.out.println("Строка после корректировок: \n" + correctingString(stringWithDigits));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String correctingString(String string) {
    return string.replaceAll("\\s+", " ").trim();
  }

}
