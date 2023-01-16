package com.epam.training.strings.string_as_object;
/*
  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
*/

public class Task1 {

  public static void main(String[] args) {

    try {

      String stringWithSpace = " Nice to  meet   you.     I am glad to see you ";
      System.out.println(stringWithSpace);

      System.out.println(
          "Максимальное количество пробелов подряд: " + maxSpaceCount(stringWithSpace));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int maxSpaceCount(String string) {
    int maxSpace = 0;
    int tempSpace = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        tempSpace++;
        if (tempSpace > maxSpace) {
          maxSpace = tempSpace;
        }
      } else {
        tempSpace = 0;
      }
    }

    return maxSpace;
  }

}
