package com.epam.training.programming_with_classes.aggregation_and_composition.task1;

public class Sentence {

  private String sentenceValue = "";
  Word word;

  public Sentence() {
  }

  public Sentence(String sentenceValue) {
    this.sentenceValue = sentenceValue;
  }

  public void addWord(Word word) {
    sentenceValue += " " + word.getValue();
  }

  public String getSentenceValue() {
    return sentenceValue;
  }

  public void setSentenceValue(String sentenceValue) {
    this.sentenceValue = sentenceValue;
  }
}
