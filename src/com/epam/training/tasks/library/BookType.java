package com.epam.training.tasks.library;

public enum BookType {

  PAPER("Paper"), EBOOK("Ebook");

private final String type;
   BookType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
