package com.epam.training.programming_with_classes.aggregation_and_composition.car;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Engine engine = new Engine(EngineType.HYBRID, 2.2);
    ArrayList<Wheel> wheels = new ArrayList<>(4);
    Car car = new Car("Toyota", engine, wheels);

    car.drive();
    car.replaceWheel();
    car.printCarBrand();

  }

}
