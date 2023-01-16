package com.epam.training.strings.string_as_object;
/*
  В строке вставить после каждого символа 'a' символ 'b'.
*/

public class Task2 {

  public static void main(String[] args) {

    try {

      String text = "Nice to meet you. 2023 was running. I am glad to see you";
      System.out.println(text);

      System.out.println("Строка после изменений: \n" + addBToA(text));


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String addBToA(String string) {
    StringBuilder resultText = new StringBuilder();

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == 'a') {
        resultText.append(string.charAt(i));
        resultText.append("b");
      } else {
        resultText.append(string.charAt(i));
      }
    }

    return resultText.toString();
  }
}


