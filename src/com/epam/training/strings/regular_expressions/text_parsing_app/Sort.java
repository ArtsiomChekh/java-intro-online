package com.epam.training.strings.regular_expressions.text_parsing_app;

import com.epam.training.strings.regular_expressions.text_parsing_app.PrintText;
import com.epam.training.strings.regular_expressions.text_parsing_app.Spliter;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {

  Spliter spliter = new Spliter();
  PrintText printText = new PrintText();

  public String[] sortByLexemeCount(String text, char symbol) {
    String[] sentences = spliter.splitSentence(text);
    String[] sentencesSorted = new String[sentences.length];
    // делим по порядку каждое предложение на слова
    for (int i = 0; i < sentences.length; i++) {
      String[] words = spliter.splitWords(sentences[i]);
      String[] wordsSorted = new String[words.length];
    // делаем сортировку по количеству вхождений заданного символа, а в случае равенства – по алфавиту.
      for (int j = 0; j < words.length; j++) {
        String temp = "";
        for (int k = 0; k < words.length; k++) {
          if (numberOfEntries(words[j], symbol) > numberOfEntries(words[k], symbol)) {
            swap(words, j, k);
          } else if (numberOfEntries(words[j], symbol) == numberOfEntries(words[k], symbol)) {
            compareStringsAlphabet(words, k, j);
          }
        }
      }
      // возращаем уже отсортированное предложение
      sentencesSorted[i] = Arrays.toString(words);
    }

    return sentencesSorted;
  }

  // счетчик входа заданного симовла. Работаем через substring, чтобы игнорировать регистр
  public int numberOfEntries(String word, char symbol) {
    int count = 0;

    for (int i = 0, j = 1; i < word.length(); i++) {
      if (word.substring(i, i + j).equalsIgnoreCase(String.valueOf(symbol))) {
        count++;
      }
    }

    return count;
  }
  // сортировка по длине слов с использованием Comparator. Можно сделать через циклы
  public String[] sortByWordLength(String text) {
    String[] sentences = spliter.splitSentence(text);
    String[] sentencesSorted = new String[sentences.length];

    for (int i = 0; i < sentences.length; i++) {
      String[] words = spliter.splitWords(sentences[i]);
      Arrays.sort(words, Comparator.comparingInt(String::length));
      sentencesSorted[i] = Arrays.toString(words);

    }

    return sentencesSorted;
  }
  // сортировка по количеству предложений в абзаце с использованием счетчика количества предложений
  public String[] sortByNumberOfSentence(String text) {
    String[] paragraphs = spliter.splitParagraph(text);

    for (int i = 0; i < paragraphs.length; i++) {
      String temp = "";
      for (int j = 0; j < paragraphs.length; j++) {
        // условие сортировки
        if (counterSentence(paragraphs[i]) < counterSentence(paragraphs[j])) {
          temp = paragraphs[i];
          paragraphs[i] = paragraphs[j];
          paragraphs[j] = temp;
        }
      }
    }

    return paragraphs;
  }
  // счетчик количества предложений
  public int counterSentence(String string) {
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == '!' || string.charAt(i) == '?' || string.charAt(i) == '.') {
        count++;
      }
    }

    return count;
  }

  private static void swap(String[] array, int i, int j) {
    String temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  // расставляет элементы по алфавиту
  public void compareStringsAlphabet(String[] array, int i, int j) {
    int comparedResult = array[i].compareTo(array[j]);

    if (comparedResult > 0) {
      swap(array, i, j);
    }
  }


}
