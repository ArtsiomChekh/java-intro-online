package com.epam.training.programming_with_classes.book;
/*
  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
  метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
  Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
  Найти и вывести:
  a) список книг заданного автора;
  b) список книг, выпущенных заданным издательством;
  c) список книг, выпущенных после заданного года.
*/

public class Book {

  private int id;
  private String title;
  private String authors;
  private String publishing;
  private int publicationDate;
  private int pageCount;
  private int price;
  private String typeOfCover;

  public Book(int id, String title, String authors, String publishing, int publicationDate,
      int pageCount, int price, String typeOfCover) {
    this.id = id;
    this.title = title;
    this.authors = authors;
    this.publishing = publishing;
    this.publicationDate = publicationDate;
    this.pageCount = pageCount;
    this.price = price;
    this.typeOfCover = typeOfCover;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public String getPublishing() {
    return publishing;
  }

  public void setPublishing(String publishing) {
    this.publishing = publishing;
  }

  public int getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(int publicationDate) {
    this.publicationDate = publicationDate;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getTypeOfCover() {
    return typeOfCover;
  }

  public void setTypeOfCover(String typeOfCover) {
    this.typeOfCover = typeOfCover;
  }

  @Override
  public String toString() {
    return "Book: " + id + "|" + title + "|" + authors + "|" + publishing + "|" + publicationDate
        + "|" + pageCount + "|" + price + "|" + typeOfCover;
  }
}
