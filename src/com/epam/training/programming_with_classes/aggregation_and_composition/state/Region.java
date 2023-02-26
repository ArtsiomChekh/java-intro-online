package com.epam.training.programming_with_classes.aggregation_and_composition.state;

import java.util.ArrayList;

public class Region {

  private String regionName;
  private ArrayList<District> districts;

  public Region(String regionName, ArrayList<District> districts) {
    this.regionName = regionName;
    this.districts = districts;
  }

  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public ArrayList<District> getDistricts() {
    return districts;
  }
}
