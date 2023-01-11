package algorithmization.decomposition;

/*
  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
  из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/
public class Task4 {

  public static void main(String[] args) {

    int[][] arrayPoints = new int[][]{
        {2, 4},
        {4, 2},
        {-2, 3},
        {-1, 0},
        {5, -1},
        {1, 2},
        {2, -1},
        {1, 4}};

    System.out.println(distanceTwoPoints(arrayPoints));

  }

  // Формула вычисления расстояния между двумя точками A(xa, ya) и B(xb, yb) на плоскости:
  // AB = √(xb - xa)2 + (yb - ya)2
  public static double distanceTwoPoints(int[][] arrayPoints) {

    double maxDistance = 0;
    double maxTempDistance = 0;
    // находим дистанции между каждой точкой и находим наибольшую дистанцию
    for (int i = 0; i < arrayPoints.length - 1; i++) {
      for (int j = 0; j < arrayPoints.length - 1; j++) {
        maxTempDistance = Math.sqrt(Math.pow((arrayPoints[j][0] - arrayPoints[i][0]), 2) +
            Math.pow((arrayPoints[j][1] - arrayPoints[i][1]), 2));
        if (maxTempDistance > maxDistance) {
          maxDistance = maxTempDistance;
        }
      }
    }
    return maxDistance;
  }
}