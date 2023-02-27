package com.epam.training.programming_with_classes.aggregation_and_composition.travel;

/*
 Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/
public class Vacation {

  private VacationType vacationType;
  private String transportType;
  private String nutrition;
  private int vacationDays;
  private int voucherCost;

  public Vacation(VacationType vacationType, String transportType, String nutrition,
      int vacationDays, int voucherCost) {
    this.vacationType = vacationType;
    this.transportType = transportType;
    this.nutrition = nutrition;
    this.vacationDays = vacationDays;
    this.voucherCost = voucherCost;
  }

  public VacationType getVacationType() {
    return vacationType;
  }

  public void setVacationType(
      VacationType vacationType) {
    this.vacationType = vacationType;
  }

  public String getTransportType() {
    return transportType;
  }

  public void setTransportType(String transportType) {
    this.transportType = transportType;
  }

  public String getNutrition() {
    return nutrition;
  }

  public void setNutrition(String nutrition) {
    this.nutrition = nutrition;
  }

  public int getVacationDays() {
    return vacationDays;
  }

  public void setVacationDays(int vacationDays) {
    this.vacationDays = vacationDays;
  }

  public int getVoucherCost() {
    return voucherCost;
  }

  public void setVoucherCost(int voucherCost) {
    this.voucherCost = voucherCost;
  }

  @Override
  public String toString() {
    return "Vacation(" +
        "vacationType: " + vacationType +
        ", transportType: " + transportType +
        ", nutrition: " + nutrition +
        ", vacationDays: " + vacationDays +
        ", voucherCost: " + voucherCost +
        ")";
  }

}
