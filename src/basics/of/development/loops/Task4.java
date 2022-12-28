package basics.of.development.loops;
/*
  Составить программу нахождения произведения квадратов первых двухсот чисел.
*/

import java.math.BigInteger;

public class Task4 {

  public static void main(String[] args) {

    try {

      BigInteger multiplicationOfSquares = BigInteger.valueOf(1);

      for (int i = 1; i <= 200; i++) {
        multiplicationOfSquares = multiplicationOfSquares.multiply(
            BigInteger.valueOf((long) Math.pow(i, 2)));
      }

      System.out.print(multiplicationOfSquares);

    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
  }
}
