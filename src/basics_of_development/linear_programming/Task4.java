package basics_of_development.linear_programming;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
   дробную и целую части числа и вывести полученное значение числа.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

  public static void main(String[] args) {

    try {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите действительное число в формате nnn.ddd:");
      String stringR = scanner.nextLine();
      scanner.close();

      Pattern pattern = Pattern.compile("^[0-9]\\w\\w[.][0-9]\\w\\w$");
      Matcher matcher = pattern.matcher(stringR);

      if (matcher.matches()) {
        double x = Double.parseDouble(stringR);
        double r = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("Значение числа R равно: " + r);
      } else {
        throw new InputMismatchException();
      }

    } catch (InputMismatchException e) {
      e.printStackTrace();
      System.out.println("Пример ввода: 222.123");
    }
  }
}
