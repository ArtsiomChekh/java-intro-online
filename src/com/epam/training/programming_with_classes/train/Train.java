package com.epam.training.programming_with_classes.train;
/*
  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
  назначения должны быть упорядочены по времени отправления.
*/

import java.util.Comparator;

public class Train {

  private String nameOfDestination;
  private int numberOfTrain;
  private String departureTime;

  public Train(String nameOfDestination, int numberOfTrain, String departureTime) {
    this.nameOfDestination = nameOfDestination;
    this.numberOfTrain = numberOfTrain;
    this.departureTime = departureTime;
  }

  public int getNumberOfTrain() {
    return numberOfTrain;
  }

  public static class comparatorByNumber implements Comparator<Train> {

    @Override
    public int compare(Train first, Train second) {
      return first.getNumberOfTrain() - second.getNumberOfTrain();
    }
  }

  public static class comparatorByDestination implements Comparator<Train> {

    @Override
    public int compare(Train first, Train second) {
      if (first.nameOfDestination == second.nameOfDestination) {
        return first.departureTime.compareTo(second.departureTime);
      }
      return first.nameOfDestination.compareTo(second.nameOfDestination);
    }
  }

  public static class comparatorByDepartureTime implements Comparator<Train> {

    @Override
    public int compare(Train first, Train second) {
      return first.departureTime.compareTo(second.departureTime);
    }
  }

  public void print() {
    System.out.println(numberOfTrain + " -> " + nameOfDestination + " : " + departureTime);
  }


}
