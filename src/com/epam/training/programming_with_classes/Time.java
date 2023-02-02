package com.epam.training.programming_with_classes;
/*
  6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
  недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
  заданное количество часов, минут и секунд.
*/


public class Time {

  public static void main(String[] args) {

    Time time = new Time(-1, 1, -12);
    System.out.println(time.toString());

    Time time2 = new Time(10, 10, 12);
    System.out.println(time2.toString());

    time2.changeTime(-2, 2, 2);
    System.out.println(time2.toString());

  }

  private int hours;
  private int minutes;
  private int seconds;

  public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    if (this.hours > 24 || this.hours < 0) {
      this.hours = 0;
    }

    this.minutes = minutes;
    if (this.minutes > 60 || this.minutes < 0) {
      this.minutes = 0;
    }

    this.seconds = seconds;
    if (this.seconds > 60 || this.seconds < 0) {
      this.seconds = 0;
    }
  }

  public void changeTime(int hours, int minutes, int seconds) {
    this.hours = hours;
    if (this.hours > 24 || this.hours < 0) {
      this.hours = 0;
    }

    this.minutes = minutes;
    if (this.minutes > 60 || this.minutes < 0) {
      this.minutes = 0;
    }

    this.seconds = seconds;
    if (this.seconds > 60 || this.seconds < 0) {
      this.seconds = 0;
    }
  }

  public String toString() {
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }


}
