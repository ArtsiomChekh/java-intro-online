package com.epam.training.strings.string_as_array;
/*
  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {

  public static void main(String[] args) {

    try {
      String[] camelCaseStringsArray = new String[]{"openMindAndCloseYourEyes", "beerCan",
          "handLuggage"};

      System.out.println("До преобразования: " + Arrays.toString(camelCaseStringsArray));

      System.out.println("После преобразования: " + Arrays.toString(
          transformerToSnakeCase(camelCaseStringsArray)));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String[] transformerToSnakeCase(String[] camelCase) {
    String[] snakeCaseStringsArray = new String[camelCase.length];

    for (int i = 0; i < camelCase.length; i++) {
      char[] stringToChars = camelCase[i].toCharArray();

      String snakeCaseString = "";

      for (int j = 0; j < stringToChars.length; j++) {
        if (Character.isUpperCase(stringToChars[j])) {
          snakeCaseString += "_";
          snakeCaseString += Character.toLowerCase(stringToChars[j]);
        } else {
          snakeCaseString += stringToChars[j];
        }
        snakeCaseStringsArray[i] = snakeCaseString;
      }

    }
    return snakeCaseStringsArray;
  }

}
