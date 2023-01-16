package com.epam.training.strings.string_as_object;
/*
  С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
*/

public class Task4 {

  public static void main(String[] args) {

    try {

      String string = "информатика"; //  -> торт

      System.out.println("слово " + string + " превратилось в -> " + converterWord(string));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String converterWord(String string) {
    String result = "";

    result = result.concat(String.copyValueOf(string.toCharArray(), string.indexOf('т'), 1));
    result = result.concat(String.copyValueOf(string.toCharArray(), string.indexOf('о'), 1));
    result = result.concat(String.copyValueOf(string.toCharArray(), string.indexOf('р'), 1));
    result = result.concat(String.copyValueOf(string.toCharArray(), string.indexOf('т'), 1));

    return result;
  }

}
