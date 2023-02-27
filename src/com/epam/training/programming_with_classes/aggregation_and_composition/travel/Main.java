package com.epam.training.programming_with_classes.aggregation_and_composition.travel;

import static com.epam.training.programming_with_classes.aggregation_and_composition.travel.VacationType.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Vacation vacation1 = new Vacation(SHOPPING, "Car", "Seafood", 10, 4000);
    Vacation vacation2 = new Vacation(REST, "Airplane", "Spicy food", 20, 3000);
    Vacation vacation3 = new Vacation(CRUISE, "Сruise ship", "Healthy food", 30, 8000);

    ArrayList<Vacation> vacations = new ArrayList<>();
    vacations.add(vacation1);
    vacations.add(vacation2);
    vacations.add(vacation3);

    VacationManagement vacationManagement = new VacationManagement(vacations);

    vacationManagement.getVacationByTransportType("car");
    vacationManagement.getVacationByType("rest");
    vacationManagement.getVacationByNutrition("seafood");
    vacationManagement.getVacationByVacationDays(30);

    System.out.println("Сортировка:");
    vacationManagement.sortVacationsByCost();
    vacationManagement.printAllVacations();

  }

}
