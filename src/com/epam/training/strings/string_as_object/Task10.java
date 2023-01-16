package com.epam.training.strings.string_as_object;
/*
  Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
  знаком. Определить количество предложений в строке X.
*/

import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите предложения, используя ('!' '?' '.'): ");
      String text = scanner.nextLine();
      scanner.close();

      System.out.println("Количество предложений в введеной строке: " + counterSentence(text));


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int counterSentence(String string) {
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '!' || string.charAt(i) == '?' || string.charAt(i) == '.') {
        count++;
      }
    }

    return count;
  }

}
