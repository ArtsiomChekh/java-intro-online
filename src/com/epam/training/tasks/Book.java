package com.epam.training.tasks;

  public class Book {

    private String author;
    private String title;
    private int year;
    private BookType type;

    public Book(String author, String title, int year, BookType type) {
      this.author = author;
      this.title = title;
      this.year = year;
      this.type = type;
    }

    public String getAuthor() {
      return author;
    }
    public String getTitle() {
      return title;
    }
    public int getYear() {
      return year;
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

    public void setYear(int year) {
      this.year = year;
    }

    public void setType(BookType type) {
      this.type = type;
    }

}
