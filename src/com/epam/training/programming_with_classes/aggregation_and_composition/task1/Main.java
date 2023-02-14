package com.epam.training.programming_with_classes.aggregation_and_composition.task1;

/*
  1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
  консоль текст, заголовок текста.
*/
public class Main {

  public static void main(String[] args) {
    Word title = new Word("Prince of Persia");

    Word word1 = new Word("Hello");
    Word word2 = new Word("my");
    Word word3 = new Word("dear");
    Word word4 = new Word("friends");

    Sentence sentence = new Sentence();
    sentence.addWord(word1);
    sentence.addWord(word2);
    sentence.addWord(word3);
    sentence.addWord(word4);

    Text text = new Text(title.getValue(), sentence.getSentenceValue());

    Text.printTest(text);

    Text.printTextTitle(text);


  }

}
