package com.epam.training.programming_with_classes.aggregation_and_composition.text;
/*
  1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
  консоль текст, заголовок текста.
 */

public class Text {

  private String title;
  private String text;
  Sentence sentence;

  public Text(String title, String text) {
    this.title = title;
    this.text = text;
  }

  public Text(Word word) {
    title = word.getValue();
  }

  public Text(Sentence sentence) {
    text = sentence.getSentenceValue();
  }

  public void addMoreText(Word word) {
    text += " " + word.getValue();
  }

  public void addMoreText(Sentence sentence) {
    text += " " + sentence.getSentenceValue();
  }

  public static void printTest(Text text) {
    System.out.println(text.getTitle() + "\n" + text.getText());
  }

  public static void printTextTitle(Text title) {
    System.out.println(title.getTitle());
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
