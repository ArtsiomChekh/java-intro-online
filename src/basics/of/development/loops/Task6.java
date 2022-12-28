package basics.of.development.loops;

/*
  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
*/
public class Task6 {

  public static void main(String[] args) {

    try {
      for (int i = 32; i <= 126; i++) {
        System.out.println((char) i + " " + i);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
