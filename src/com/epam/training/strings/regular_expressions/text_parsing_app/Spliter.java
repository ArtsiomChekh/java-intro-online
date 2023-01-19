package com.epam.training.strings.regular_expressions.text_parsing_app;

public class Spliter {

  public String[] splitWords(String string) {
    return string.split(" ");
  }

  public String[] splitParagraph(String string) {
    return string.split("\n");
  }

  public String[] splitSentence(String string) {
    return string.split("[.!?]\\s*");
  }

}
