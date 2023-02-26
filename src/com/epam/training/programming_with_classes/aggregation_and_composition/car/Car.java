package com.epam.training.programming_with_classes.aggregation_and_composition.car;
/*
  2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
  менять колесо, вывести на консоль марку автомобиля.
*/

import java.util.ArrayList;

public class Car {

  private String carBrand;
  private Engine engine;
  private ArrayList<Wheel> wheel;

  public Car(String carBrand, Engine engine, ArrayList<Wheel> wheel) {
    this.carBrand = carBrand;
    this.engine = engine;
    this.wheel = wheel;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(
      Engine engine) {
    this.engine = engine;
  }

  public ArrayList<Wheel> getWheel() {
    return wheel;
  }

  public void setWheel(
      ArrayList<Wheel> wheel) {
    this.wheel = wheel;
  }

  public void drive() {
    System.out.println("GO");
  }

  public void replaceWheel() {
    System.out.println("Wheel replaced");
  }

  public void printCarBrand() {
    System.out.println("Car breand: " + getCarBrand());
  }


}
