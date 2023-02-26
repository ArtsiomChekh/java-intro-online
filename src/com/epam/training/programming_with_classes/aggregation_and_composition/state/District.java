package com.epam.training.programming_with_classes.aggregation_and_composition.state;

import java.util.ArrayList;

public class District {

  private String districtName;
  private ArrayList<City> cities;

  public District(String districtName, ArrayList<City> cities) {
    this.districtName = districtName;
    this.cities = cities;
  }

  public ArrayList<City> getCities() {
    return cities;
  }

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

}
