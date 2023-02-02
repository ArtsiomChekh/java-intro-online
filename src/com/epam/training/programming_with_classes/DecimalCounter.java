package com.epam.training.programming_with_classes;

/*
  5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

*/

public class DecimalCounter {

  public static void main(String[] args) {

    DecimalCounter decimalCounter1 = new DecimalCounter(0, -5, 10);
    decimalCounter1.increase();
    decimalCounter1.increase();
    System.out.println("Текущее значение счтчика: " + decimalCounter1.getCurrentValue());

    DecimalCounter decimalCounter2 = new DecimalCounter();
    decimalCounter2.decrease();
    decimalCounter2.decrease();
    System.out.println("Текущее значение счтчика: " + decimalCounter2.getCurrentValue());

  }

  private int currentValue;
  private final int maxLimit;
  private final int minLimit;

  // конструктор по умолчанию
  public DecimalCounter() {
    this.currentValue = 0;
    this.minLimit = -10;
    this.maxLimit = 10;
  }

  // произвольный конструктор
  public DecimalCounter(int currentValue, int minLimit, int maxLimit) {
    this.currentValue = currentValue;
    this.minLimit = minLimit;
    this.maxLimit = maxLimit;
  }

  // получение состояния
  public int getCurrentValue() {
    return currentValue;
  }

  // метод увеличения значения
  public void increase() {
    this.currentValue++;

    // проверка границ
    if (this.currentValue > this.maxLimit) {
      this.currentValue = this.maxLimit;
      System.out.println("Значение выходит за вернхнюю границу диапозона");
    }
  }

  // метод уменьшения значения
  public void decrease() {
    this.currentValue--;

    if (this.currentValue < this.minLimit) {
      this.currentValue = this.minLimit;
      System.out.println("Значение выходит за нижнюю границу диапозона");
    }
  }

}
