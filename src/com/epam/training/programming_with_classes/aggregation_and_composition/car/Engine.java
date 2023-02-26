package com.epam.training.programming_with_classes.aggregation_and_composition.car;

public class Engine {

  private EngineType engineType;
  private double engineSize;

  public Engine(EngineType engineType, double engineSize) {
    this.engineType = engineType;
    this.engineSize = engineSize;
  }

  public EngineType getEngineType() {
    return engineType;
  }

  public void setEngineType(
      EngineType engineType) {
    this.engineType = engineType;
  }

  public double getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(double engineSize) {
    this.engineSize = engineSize;
  }
}
