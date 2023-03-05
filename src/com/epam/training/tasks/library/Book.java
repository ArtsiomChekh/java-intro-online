package com.epam.training.tasks.library;

  public class Book {

    private String author;
    private String title;
    private BookType type;


    private String descriptionBook;

    public Book(String author, String title, BookType type, String descriptionBook) {
      this.author = author;

     this.title = title;

      this.type = type;

      this.descriptionBook = descriptionBook;
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

    public String getDescriptionBook() {
      return descriptionBook;
    }

    public void setDescriptionBook(String descriptionBook) {
      this.descriptionBook = descriptionBook;
    }

    @Override
    public String toString() {
      return  author + " | " + title + " | " + type.getType() + " | " + descriptionBook;
    }
  }
