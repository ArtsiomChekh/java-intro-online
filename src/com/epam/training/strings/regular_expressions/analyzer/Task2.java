package com.epam.training.strings.regular_expressions.analyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Дана строка, содержащая следующий текст (xml-документ):
<notes>
 <note id = "1">
 <to>Вася</to>
 <from>Света</from>
 <heading>Напоминание</heading>
 <body>Позвони мне завтра!</body>
 </note>
 <note id = "2">
 <to>Петя</to>
 <from>Маша</from>
 <heading>Важное напоминание</heading>
 <body/>
 </note>
</notes>
  Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
  тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
  нельзя.
 */
public class Task2 {

  public static void main(String[] args) {

    try {

      String text = "<notes>\n"
          + " <note id = \"1\">\n"
          + " <to>Вася</to>\n"
          + " <from>Света</from>\n"
          + " <heading>Напоминание</heading>\n"
          + " <body>Позвони мне завтра!</body>\n"
          + " </note>\n"
          + " <note id = \"2\">\n"
          + " <to>Петя</to>\n"
          + " <from>Маша</from>\n"
          + " <heading>Важное напоминание</heading>\n"
          + " <body/>\n"
          + " </note>\n"
          + "</notes>";

      Pattern pattern = Pattern.compile("(<[a-z]+>|<[a-z]+.id.+>)|(</[a-z]+>)|([А-Я].+[а-я]!?)|(<[a-z]+/)");
      Matcher matcher = pattern.matcher(text);

      while (matcher.find()) {
        if (matcher.group(1) != null) {
          System.out.println(matcher.group(1) + " - открывающий тег");
        } else {
          if (matcher.group(2) != null) {
            System.out.println(matcher.group(2) + " - закрывающий тег");
          } else {
            if (matcher.group(3) != null) {
              System.out.println(matcher.group(3) + " - содержимое тега");
            } else {
              if (matcher.group(4) != null) {
                System.out.println(matcher.group(4) + " - тег без тела");
              }
            }
          }
        }
      }
    } catch (IllegalStateException e) {
      e.printStackTrace();
    }
  }

}


