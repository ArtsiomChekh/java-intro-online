package algorithmization.decomposition;

/*
  Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
  натуральных чисел: НОК(A,B) = (A * B) / НОД(A, B)
*/
public class Task1 {

  public static void main(String[] args) {
    int a = 30;
    int b = 18;
    System.out.println("НОД равен: " + nodByEvklid(a, b));
    System.out.println("НОК равен: " + nok(a, b));

  }

  public static int nodByEvklid(int a, int b) {
    int c = 0;
    while (a != 0 && b != 0) {
      if (a > b) {
        a %= b;
      } else {
        b %= a;
      }
      c = a + b; //  Цикл завершается, когда хотя бы одна из переменных равна нулю.
    }
    return c;
  }

  public static int nok(int a, int b) {
    return (a * b) / (nodByEvklid(a, b));
  }

}
