package com.epam.training.tasks.library;

import static com.epam.training.tasks.library.PasswordEncoder.encodePassword;
import static java.nio.file.StandardOpenOption.APPEND;

import com.epam.training.tasks.library.service.BooksView;
import com.epam.training.tasks.library.service.BooksViewImp;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAccount {

  private BooksView booksView;
  UserAccount (BooksView booksView){
    this.booksView = booksView;
  }
  public UserAccount() {

  };
  Scanner scanner = new Scanner(System.in);
  String fileName = "/Users/admin/IdeaProjects/java-intro-online/src/com/epam/training/tasks/library/data/accounts.txt";
  String fileNameCatalog = "/Users/admin/IdeaProjects/java-intro-online/src/com/epam/training/tasks/library/data/catalog.txt";


  public void homePage() {
    try {
      System.out.println("----------------------");
      System.out.println("1. Create user account");
      System.out.println("2. Login user account");
      System.out.println("----------------------");
      System.out.println("Enter choice: ");
      String choice = scanner.nextLine();
      if (choice.equals("1")) {
        createAccount();
      } else if (choice.equals("2")) {
        login();
      } else {
        System.out.println("Invalid choice!");
        homePage();
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void showBooksPage() {
    try {
      System.out.println("------------------------Book List--------------------------------");
      System.out.println("Author-----------Title-------------Type---------------Description");
      List<Book> bookList = new ArrayList<>();
      Path path = Paths.get(fileNameCatalog);
      InputStream inputStream = Files.newInputStream(path);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String temp = null;
      int id;
      String author;
      String title;
      String type;
      String description;
      while ((temp = bufferedReader.readLine()) != null) {
        String[] tempBooks = temp.split("\\|");
        id = Integer.parseInt(tempBooks[0].trim());
        author = tempBooks[1].trim();
        title = tempBooks[2].trim();
        type = tempBooks[3].trim();
        description = tempBooks[4].trim();
        bookList.add(new Book(id, author, title, BookType.valueOf(type.toUpperCase()), description));
      }

      booksView.viewBooks(bookList);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }


  public void login() {
    try {
      Path path = Paths.get(fileName);
      InputStream inputStream = Files.newInputStream(path);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      System.out.println("\n LOGIN \n");
      System.out.println("Enter username: ");
      String username = scanner.nextLine();
      System.out.println("Enter password: ");
      String password = scanner.nextLine();

      String temp = null;
      String user;
      String pass;
      boolean found = false;
      while ((temp = bufferedReader.readLine()) != null) {
        String[] account = temp.split(",");
        user = account[0];
        pass = account[1];
        if (user.equals(username) && pass.equals(encodePassword(password))) {
          found = true;
        }
      }
      if (found == true) {
        System.out.println("Access granted");
        showBooksPage();

      } else {
        System.out.println("Access denied! Invalid username and password");
      }
      bufferedReader.close();
      System.out.println("Press any key to continue...");
      String proc = scanner.nextLine();
      homePage();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void createAccount() {
    try {
      Path path = Paths.get(fileName);
      OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
      BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
      System.out.println("\n CREATE ACCOUNT \n");
      System.out.println("Enter username: ");
      String username = scanner.nextLine();
      System.out.println("Enter password: ");
      String password = scanner.nextLine();
      System.out.println("Enter email: ");
      String emailString = scanner.nextLine();
      Email email = new Email(emailString);
      bufferedWriter.write(username + "," + encodePassword(password) + "," + email.toString());
      bufferedWriter.newLine();
      System.out.println("Account has been successfully saved!");
      bufferedWriter.close();
      outputStream.close();

      System.out.println("Press any key to continue...");
      String proc = scanner.nextLine();
      homePage();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    BooksView booksView = new BooksViewImp();
    UserAccount userAccount = new UserAccount(booksView);
    userAccount.homePage();

  }

}
