package com.epam.training.programming_with_classes;
/*
  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
  наибольшее значение из этих двух переменных.
*/

public class Test1 {

  private int firstVar = 100;
  private int secondVar = 75;

  public static void main(String[] args) {

  }

  public void printVariable(int firstVar, int secondVar) {
    System.out.println(firstVar + " " + secondVar);
  }

  public int changeFirstVar(int firstVar, int newVar) {
    firstVar = newVar;
    return firstVar;
  }

  public int changeSecondVar(int secondVar, int newVar) {
    secondVar = newVar;
    return secondVar;
  }

  public int sumOfValue(int firstVar, int secondVar) {
    return firstVar + secondVar;
  }

  public int maxValue(int firstVar, int secondVar) {
    return Math.max(firstVar, secondVar);
  }

}
