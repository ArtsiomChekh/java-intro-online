package com.epam.training.programming_with_classes.aggregation_and_composition.task2;

public class Wheel {

  private int size;
  private String wheelBrand;

  public Wheel(int size, String wheelBrand) {
    this.size = size;
    this.wheelBrand = wheelBrand;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getWheelBrand() {
    return wheelBrand;
  }

  public void setWheelBrand(String wheelBrand) {
    this.wheelBrand = wheelBrand;
  }
}
