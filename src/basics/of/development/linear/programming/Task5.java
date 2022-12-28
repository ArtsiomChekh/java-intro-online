package basics.of.development.linear.programming;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
   данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите количество секунд:");
      int s = scanner.nextInt();
      scanner.close();

      if (s > 0) {
        int hours = s / 60;
        int seconds = s % 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
      } else {
        throw new InputMismatchException();
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Введите натуральное число. Пример ввода: 24 | 4214");
    }
  }
}
