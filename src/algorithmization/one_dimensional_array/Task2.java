package algorithmization.one_dimensional_array;
/*
  Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
  числом. Подсчитать количество замен.
*/
import java.util.Random;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите значение для числа Z (от -50 до 50):");
      int z = scanner.nextInt();
      scanner.close();

      Random random = new Random();

      double[] array = new double[100];

      int count = 0;

      // заполняем массив рандомными числами
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextDouble(-50, 50);
        if (array[i] > z) {
          array[i] = z;
          count++;
        }
      }

      System.out.println("Количество замен: " + count);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
