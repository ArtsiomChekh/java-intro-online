package com.epam.training.tasks.library;

  public class Book {

    private int id;
    private String author;
    private String title;
    private BookType type;


    private String descriptionBook;

    public Book(int id, String author, String title, BookType type, String descriptionBook) {
      this.id = id;
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
    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return id + " | " + author + " | " + title + " | " + type.getType() + " | " + descriptionBook;
    }


  }
