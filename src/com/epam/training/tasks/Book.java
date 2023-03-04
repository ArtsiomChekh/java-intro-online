package com.epam.training.tasks;

  public class Book {

    private String author;
    private String title;
    private BookType type;

    public Book(String author, String title, BookType type) {
      this.author = author;

     this.title = title;

      this.type = type;
    }

    public String getAuthor() {
      return author;
    }
    public String getTitle() {
      return title;
    }
    public BookType getType() {
      return type;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public void setType(BookType type) {
      this.type = type;
    }

    @Override
    public String toString() {
      return  author + " | " + title + " | " + type;
    }
  }
