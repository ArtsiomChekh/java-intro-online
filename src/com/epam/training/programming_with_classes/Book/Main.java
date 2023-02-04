package com.epam.training.programming_with_classes.Book;

import java.util.Scanner;

public class Main {

  public static Book[] books = new Book[]{
      new Book(1, "Anna Karenina", "Leo Tolstoy", "Penguin Classics", 1878, 864, 25, "HardCover"),
      new Book(2, "To Kill a Mockingbird", "Harper Lee", "Happer Perennial", 1960, 336, 10,
          "Softcover"),
      new Book(3, "Where the Sidewalk Ends", "Shel Silverstein", "Edge", 1974, 176, 2,
          "HardCover")
  };


  public static void main(String[] args) {

    Books booksArray = new Books(books);

    try (Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in)) {

      while (true) {

        System.out.println("Добро пожаловать в нашу библиотеку! Выберите действие:\n"
            + "1) Список книг заданного автора;\n"
            + "2) Список книг, выпущенных заданным издательством;\n"
            + "3) Список книг, выпущенных после заданного года;\n"
            + "4) Выход");

        System.out.println("Введите номер команды: ");
        String command = scanner.nextLine();

        switch (command) {

          case "1":
            System.out.println("Введите автора: ");
            String author = scannerNumber.nextLine();

            for (Book booksByAuthor : booksArray.searchByAuthor(books, author)) {
              System.out.println(booksByAuthor.toString());
            }
            break;

          case "2":

            System.out.println("Введите издательство: ");
            String publishing = scannerNumber.nextLine();

            for (Book booksByPublishing : booksArray.searchByPublishing(books, publishing)) {
              System.out.println(booksByPublishing.toString());
            }
            break;

          case "3":

            System.out.println("Введите год: ");
            int year = scannerNumber.nextInt();

            for (Book booksAfterYear : booksArray.searchBooksAfterYear(books, year)) {
              System.out.println(booksAfterYear.toString());
            }
            break;

          case "4":
            System.out.println("Всего доброго!");
            return;

        }

      }
    }
  }

}
