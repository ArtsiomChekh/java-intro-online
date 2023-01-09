package algorithmization.array_sorting;
/*
  Даны дроби p1/q1, p2/q2,...pn/qn (pi и qi - натуральные). Составить программу, которая приводит
  эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

*/

import java.util.Arrays;

public class Task8 {

  public static void main(String[] args) {

    try {
      int[] numerators = {1, 20, 63, 81, 8, 22, 10, 2};
      int[] denominators = {2, 4, 6, 2, 10, 12, 16, 8};

      int lcm = denominators[0];
      int gcd = denominators[0];

      //найдем наибольший общий делитель
      //испольщую нод, найдем нок
      for (int i = 1; i < denominators.length; i++) {
        gcd = findGCD(denominators[i], lcm);
        lcm = (lcm * denominators[i]) / gcd;
      }

      System.out.println("НОК: " + lcm);

      Arrays.sort(numerators);

      for (int i = 0; i < numerators.length; i++) {
        System.out.print(numerators[i] + "/" + lcm + " ");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int findGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a % b);
  }
}


