package basics_of_development.loops;
/*
  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
  заданному е. Общий член ряда имеет вид:  a_n = (1 / 2^n) + (1 / 3^n);
*/
public class Task5 {

  public static void main(String[] args) {

    try {
      double e = 0.1;
      int n = 0;
      double temp = 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
      double sum = 0;

      for (n = 1; temp >= e; n++) {
        temp = 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
        sum = sum + temp;
      }

      System.out.printf("Сумма членов ряда: %.2f", sum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
