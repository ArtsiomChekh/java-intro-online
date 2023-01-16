package com.epam.training.strings.string_as_object;

import java.util.Scanner;

/*
  Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
  длинных слов может быть несколько, не обрабатывать.
*/
public class Task8 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите строку из слов, разделенную пробелами: ");
      String text = scanner.nextLine();
      scanner.close();

      String[] strings = text.split(" ");
      System.out.println("Результат: " + maxLengthWord(strings));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String maxLengthWord(String[] strings) {
    int maxLength = strings[0].length();
    int indexOfMaxLength = 0;

    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > maxLength) {
        maxLength = strings[i].length();
        indexOfMaxLength = i;
      }
    }

    for (int i = 0; i < strings.length; i++) {
      if (i != indexOfMaxLength && strings[indexOfMaxLength].length() == strings[i].length()) {
        return "Операция не обработана";
      }
    }

    return strings[indexOfMaxLength];
  }

}
