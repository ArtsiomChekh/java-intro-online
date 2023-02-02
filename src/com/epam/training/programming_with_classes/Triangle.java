package com.epam.training.programming_with_classes;
/*
  7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
  площади, периметра и точки пересечения медиан.
*/

public class Triangle {

  public static void main(String[] args) {
    Triangle triangle = new Triangle(10, 22, 22);
    System.out.println(triangle.toString());

    System.out.println("Периметр: " + triangle.perimeterOfTriangle());

    System.out.println("Площадь: " + triangle.getAreaOfTriangle());

    triangle.medianPoint();
  }

  private int sideA;
  private int sideB;
  private int sideC;


  public Triangle(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  // равносторонний
  public Triangle(int sideA) {
    this.sideA = sideA;
    this.sideB = sideA;
    this.sideC = sideA;
  }

  public int perimeterOfTriangle() {

    return this.sideA + this.sideB + this.sideC;
  }

  public int getAreaOfTriangle() {
    //  полупериметр
    int p = perimeterOfTriangle() / 2;
    //  формула Герона
    return (int) Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
  }

  private void medianPoint() {
    int medianAB = (int) Math.sqrt(
        2 * Math.pow(this.sideA, 2) + 2 * Math.pow(this.sideB, 2) - Math.pow(this.sideC, 2)) / 2;
    int medianBC = (int) Math.sqrt(
        2 * Math.pow(this.sideB, 2) + 2 * Math.pow(this.sideC, 2) - Math.pow(this.sideA, 2)) / 2;
    int medianAC = (int) Math.sqrt(
        2 * Math.pow(this.sideA, 2) + 2 * Math.pow(this.sideC, 2) - Math.pow(this.sideB, 2)) / 2;

    System.out.printf("Медиана AB = %d \nМедиана BC = %d \nМедиана AC = %d", medianAB, medianBC,
        medianAC);
  }

  @Override
  public String toString() {
    return String.format("Треугольник со сторонами: A = %d, B = %d, C = %d", sideA, sideB, sideB);
  }
}
