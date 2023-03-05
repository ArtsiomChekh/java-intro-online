package com.epam.training.tasks.library.service;

import com.epam.training.tasks.library.Book;
import com.epam.training.tasks.library.UserAccount;
import java.util.List;
import java.util.Scanner;

public class BooksViewImp implements BooksView {

  Scanner scanner = new Scanner(System.in);
  UserAccount userAccount = new UserAccount();

  @Override
  public void viewBooks(List<Book> books) {
    try {
      int pageCount = books.size() / 10;
      if (books.size() % 10 != 0) {
        pageCount++;
      }
      int index = 0;
      int currentPage = 1;
      while (true) {
        for (int i = index; i < Integer.min(books.size(), index + 10); i++) {
          System.out.println(books.get(i));
        }
        System.out.println("Page: " + currentPage + "/" +  pageCount);
        System.out.println("1 - next page, 2 - previous page, 3 - exit");
        int choice = choicePosition(1, 3);
        if (choice == 1) {
          currentPage++;
          if(currentPage > pageCount){
            currentPage--;
          }
          index += 10;
          if (index >= books.size()) {
            index -= 10;
          }
        } else if (choice == 2) {
          currentPage--;
          if(currentPage < 1){
            currentPage++;
          }
          index = Integer.max(0, index - 10);
        } else {
          return;
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  public int choicePosition(int min, int max) {
    int res = scanner.nextInt();
    if (res < min || res > max) {
      System.out.println("Invalid input: try again");
      return choicePosition(min, max);
    } else {
      return res;
    }
  }

}
