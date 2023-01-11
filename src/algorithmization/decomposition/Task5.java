package algorithmization.decomposition;
/*
  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
  которое меньше максимального элемента массива, но больше всех других элементов).
*/

public class Task5 {

  public static void main(String[] args) {

    try {

      int[] array = new int[]{2, 4, 4, 12, 51, 62, 72, 13, 123, 12};

      // найдем для начала maxTemp число в массиве и замомним его,
      // затем найдем numberBefore число в массиве, но чтобы оно было меньше нашего maxTemp
      int maxTemp = 0;
      int numberBefore = 0;

      for (int element : array) {
        if (element > maxTemp) {
          maxTemp = element;
        }
      }

      for (int element : array) {
        if (element > numberBefore && element < maxTemp) {
          numberBefore = element;
        }
      }
      System.out.println("Искомое число:" + numberBefore);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
