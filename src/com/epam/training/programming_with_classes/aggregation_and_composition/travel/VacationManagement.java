package com.epam.training.programming_with_classes.aggregation_and_composition.travel;

import com.epam.training.programming_with_classes.aggregation_and_composition.account.Account;
import com.epam.training.programming_with_classes.aggregation_and_composition.account.Client;
import java.util.ArrayList;
import java.util.Comparator;

public class VacationManagement {

  private ArrayList<Vacation> vacations = new ArrayList<>();

  public VacationManagement(ArrayList<Vacation> vacations) {
    this.vacations = vacations;
  }

  public void getVacationByType(String vacationType) {

    for (Vacation vacation : vacations) {
      if (vacationType.equalsIgnoreCase(vacation.getVacationType().toString())) {
        System.out.println(vacation.toString());
      }
    }
  }

  public void getVacationByTransportType(String transportType) {

    for (Vacation vacation : vacations) {
      if (transportType.equalsIgnoreCase(vacation.getTransportType())) {
        System.out.println(vacation.toString());
      }
    }
  }

  public void getVacationByNutrition(String nutrition) {

    for (Vacation vacation : vacations) {
      if (nutrition.equalsIgnoreCase(vacation.getNutrition())) {
        System.out.println(vacation.toString());
      }
    }
  }

  public void getVacationByVacationDays(int vacationDays) {

    for (Vacation vacation : vacations) {
      if (vacationDays == vacation.getVacationDays()) {
        System.out.println(vacation.toString());
      }
    }
  }

  public void sortVacationsByCost() {
    vacations.sort(Comparator.comparing(Vacation::getVoucherCost));
  }

  public void printAllVacations() {
    vacations.forEach(System.out::println);
  }


}
