package com.epam.training.strings.string_as_array;
/*
   В строке найти количество чисел
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

  public static void main(String[] args) {

    try {

      String stringWithNumbers = "Solve the following exercise. 2 plus 25 and then subtract 12";

      System.out.println("Количество чисел в строке: " + countOfNumbers(stringWithNumbers));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int countOfNumbers(String string) {
    int count = 0;

    Pattern pattern = Pattern.compile("(\\d+)");
    Matcher matcher = pattern.matcher(string);

    while (matcher.find()) {
      count++;
    }

    return count;
  }

}
