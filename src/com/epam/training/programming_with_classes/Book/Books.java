package com.epam.training.programming_with_classes.Book;
/*
  Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
  Найти и вывести:
  a) список книг заданного автора;
  b) список книг, выпущенных заданным издательством;
  c) список книг, выпущенных после заданного года.
 */

public class Books {

  private Book[] books;

  public Books(Book[] books) {
    this.books = books;
  }

  // список книг заданного автора;
  public Book[] searchByAuthor(Book[] books, String author) {

    int numBooks = 0;

    for (Book book : books) {
      if (book.getAuthors().equalsIgnoreCase(author)) {
        numBooks++;
      }
    }

    Book[] booksByAuthor = new Book[numBooks];

    for (int i = 0, j = 0; i < books.length; i++) {
      if (books[i].getAuthors().equalsIgnoreCase(author)) {
        booksByAuthor[j] = books[i];
        j++;
      }
    }

    return booksByAuthor;
  }

  // список книг, выпущенных заданным издательством;
  public Book[] searchByPublishing(Book[] books, String publishing) {

    int numBooks = 0;

    for (Book book : books) {
      if (book.getPublishing().equalsIgnoreCase(publishing)) {
        numBooks++;
      }
    }

    Book[] booksByPublishing = new Book[numBooks];

    for (int i = 0, j = 0; i < books.length; i++) {
      if (books[i].getPublishing().equals(publishing)) {
        booksByPublishing[j] = books[i];
        j++;
      }
    }

    return booksByPublishing;
  }

  // список книг, выпущенных после заданного года.
  public Book[] searchBooksAfterYear(Book[] books, int year) {

    int numBooks = 0;

    for (Book book : books) {
      if (book.getPublicationDate() > year) {
        numBooks++;
      }
    }

    Book[] booksAfterYear = new Book[numBooks];

    for (int i = 0, j = 0; i < books.length; i++) {
      if (books[i].getPublicationDate() > year) {
        booksAfterYear[j] = books[i];
        j++;
      }
    }

    return booksAfterYear;
  }


}
