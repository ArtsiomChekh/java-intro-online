package com.epam.training.tasks;

import static com.epam.training.tasks.PasswordEncoder.encodePassword;
import static java.nio.file.StandardOpenOption.APPEND;

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
import java.util.Scanner;

public class UserAccount {

  Scanner scanner = new Scanner(System.in);
  String fileName = "/Users/admin/Documents/accounts.txt";

  private boolean isAdmin = false;

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

  public void showBooksPage(boolean isAdmin) {
    try {
      System.out.println("Book List");


    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }


  void login() {
    try {
      Path path = Paths.get(fileName); // !
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
        String [] account = temp.split(",");
        user = account[0];
        pass = account[1];
        if(user.equals(username) && pass.equals(encodePassword(password))) {
          found = true;
        }
      }
      if(found == true) {
        System.out.println("Access granted");

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

  void createAccount() {
    try {
      Path path = Paths.get(fileName); // !
      OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
      BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
      System.out.println("\n CREATE ACCOUNT \n");
      System.out.println("Enter username: ");
      String username = scanner.nextLine();
      System.out.println("Enter password: ");
      String password = scanner.nextLine();
      bufferedWriter.write(username + "," + encodePassword(password));
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
    UserAccount userAccount = new UserAccount();
    userAccount.homePage();

  }

}
