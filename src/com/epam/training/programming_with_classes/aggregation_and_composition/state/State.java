package com.epam.training.programming_with_classes.aggregation_and_composition.state;
/*
   Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры.
*/

import java.util.ArrayList;

public class State {

  private String stateName;
  private String capital;

  private double square;

  private ArrayList<Region> regions;


  public State(String stateName, String capital, double square, ArrayList<Region> regions) {
    this.stateName = stateName;
    this.capital = capital;
    this.square = square;
    this.regions = regions;

  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public double getSquare() {
    return square;
  }

  public void setSquare(double square) {
    this.square = square;
  }

  public ArrayList<Region> getRegions() {
    return regions;
  }


  public void printCapital() {
    System.out.println(capital);
  }

  public void printCountOfRegions() {
    System.out.println(regions.size());
  }

  public void printStateSquare() {
    System.out.println(square);
  }

  public void printRegionalCenters() {
    System.out.println(regions.toString());
  }


}
