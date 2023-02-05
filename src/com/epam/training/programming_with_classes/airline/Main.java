package com.epam.training.programming_with_classes.airline;

import com.epam.training.programming_with_classes.book.Book;
import com.epam.training.programming_with_classes.book.Books;
import java.util.Scanner;

public class Main {

  static Airline[] airlines = new Airline[]{
      new Airline("Istanbul", 101, AircraftType.PROPELLER, "10:30", DaysOfWeek.FRIDAY),
      new Airline("Budapest", 112, AircraftType.JET, "11:30", DaysOfWeek.FRIDAY),
      new Airline("Berlin", 103, AircraftType.ROTORCRAFT, "9:30", DaysOfWeek.FRIDAY),
  };

  public static void main(String[] args) {

    Airlines airlinesArray = new Airlines(airlines);

    try (Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in)) {

      while (true) {

        System.out.println("Добро пожаловать в метапоисковик авиабилетов! Выберите действие:\n"
            + "1) Список рейсов для заданного пункта назначения;\n"
            + "2) Список рейсов для заданного дня недели;\n"
            + "3) Список рейсов для заданного дня недели, время вылета для которых больше заданного;\n"
            + "4) Выход");

        System.out.println("Введите номер команды: ");
        String command = scanner.nextLine();

        switch (command) {

          case "1":
            System.out.println("Введите пункт назначения: ");
            String destination = scannerNumber.nextLine();

            for (Airline airlinesByDestination : airlinesArray.selectionByDestination(airlines,
                destination)) {
              System.out.println(airlinesByDestination.toString());
            }
            break;

          case "2":
            System.out.println(
                "Введите день недели(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY): ");
            DaysOfWeek daysOfWeek = DaysOfWeek.valueOf(scannerNumber.nextLine());

            for (Airline airlinesByDaysOfWeek : airlinesArray.selectionByDaysOfWeek(airlines,
                daysOfWeek)) {
              System.out.println(airlinesByDaysOfWeek.toString());
            }
            break;

          case "3":

            System.out.println(
                "Введите день недели(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY): ");
            DaysOfWeek day = DaysOfWeek.valueOf(scannerNumber.nextLine());
            System.out.println("Введите время вылета(например: 10:00): ");
            String time = scannerNumber.nextLine();

            for (Airline airlinesByDaysAndTime : airlinesArray.selectionByDaysAndTime(airlines, day,
                time)) {
              System.out.println(airlinesByDaysAndTime.toString());
            }
            break;

          case "4":
            System.out.println("Всего доброго!");
            return;

        }

      }
    }
  }


}
