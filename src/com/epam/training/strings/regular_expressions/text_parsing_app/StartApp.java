package com.epam.training.strings.regular_expressions.text_parsing_app;
/*
  Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
  операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
  отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
  алфавиту.
*/

import java.util.Scanner;

public class StartApp {

  public static void main(String[] args) {

    Sort sort = new Sort();
    PrintText printText = new PrintText();
    Scanner scanner = new Scanner(System.in);

    String text = "Why wasn't I ready for that news? I don't know, but I wasn't. And part of me "
        + "seemed to die when I heard it. But Jenny only did what she had to do. Because I'm an idiot. "
        + "A lot of people say that they married an idiot, but they don't know what it's like to marry "
        + "a real one. I cried that night, but it didn't help.\n"
        + "   I'm just going to work hard, I told myself. It's all I can do.\n"
        + "   And I did. And at the end of that year we had seventy-five thousand dollars. The end.";

    System.out.println(text);

    while (true) {

      System.out.println();
      System.out.println("Что делаем с текстом?");
      System.out.println("1 - отсортировать абзацы по количеству предложений");
      System.out.println("2 - в каждом предложении отсортировать слова по длине");
      System.out.println(
          "3 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту");
      System.out.println("4 - выход");

      System.out.println("Введите номер команды: ");
      int command = scanner.nextInt();

      switch (command) {
        case 1: {
          printText.print(sort.sortByNumberOfSentence(text));
          break;
        }
        case 2: {
          printText.print(sort.sortByWordLength(text));
          break;
        }
        case 3: {
          System.out.println("Введите символ: ");
          String str = scanner.next();
          printText.print(sort.sortByLexemeCount(text, str.charAt(0)));
          break;
        }
        case 4: {
          return;
        }
      }
    }
  }

}
