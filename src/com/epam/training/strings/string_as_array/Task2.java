package com.epam.training.strings.string_as_array;
/*
   Замените в строке все вхождения 'word' на 'letter'
*/

public class Task2 {

  public static void main(String[] args) {
    try {

      String text = "He sent a word to Mrs. Falconer. We must be seen to keep the spirit of the law as well as the word";
      System.out.println(text);

      String correctText = text.replaceAll("word", "letter");
      System.out.println(correctText);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
