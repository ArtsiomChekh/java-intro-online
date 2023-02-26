package com.epam.training.programming_with_classes.aggregation_and_composition.state;

public class City {

  private String cityName;

  public City(String cityName) {
    this.cityName = cityName;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
}
