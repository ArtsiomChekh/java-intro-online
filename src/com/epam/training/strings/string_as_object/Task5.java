package com.epam.training.strings.string_as_object;
/*
  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/

public class Task5 {

  public static void main(String[] args) {

    try {

      String text = "Nice to meet you. 2023 was running. I am glad to see you";
      System.out.println(text);
      System.out.println("Количество 'a': " + counterLetter(text));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int counterLetter(String string) {
    int count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == 'a') {
        count++;
      }
    }

    return count;
  }

}
