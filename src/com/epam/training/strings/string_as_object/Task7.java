package com.epam.training.strings.string_as_object;
/*
  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
  def", то должно быть выведено "abcdef".
*/

import java.util.Scanner;

public class Task7 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите слово: ");
      String word = scanner.nextLine();
      scanner.close();

      System.out.println("Результат: " + correctLine(word));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String correctLine(String string) {
    String tempString = "";
    StringBuilder result = new StringBuilder();

    tempString = string.replaceAll("\\s+", "");

    for (int i = 0, j = 1; i < tempString.length(); i++) {
      if (result.toString().contains(tempString.substring(i, i + j))) {
        continue;
      } else {
        result.append(tempString.charAt(i));
      }
    }

    return result.toString();
  }

}
