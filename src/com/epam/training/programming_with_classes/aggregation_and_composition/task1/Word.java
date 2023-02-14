package com.epam.training.programming_with_classes.aggregation_and_composition.task1;

public class Word {

  private String value;

  public Word(String value) {
    this.value = value;
  }

  public Word() {
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
