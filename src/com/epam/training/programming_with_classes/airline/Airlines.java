package com.epam.training.programming_with_classes.airline;
/*
  Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
  методами.
  a) список рейсов для заданного пункта назначения;
  b) список рейсов для заданного дня недели;
  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import com.epam.training.programming_with_classes.book.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airlines {

  private Airline[] airlines;

  public Airlines(Airline[] airlines) {
    this.airlines = airlines;
  }

  // список рейсов для заданного пункта назначения;
  public Airline[] selectionByDestination(Airline[] airlines, String destination) {

    int numAirlines = 0;

    for (Airline airline : airlines) {
      if (airline.getDestination().equalsIgnoreCase(destination)) {
        numAirlines++;
      }
    }

    Airline[] airlinesByDestination = new Airline[numAirlines];

    for (int i = 0, j = 0; i < airlines.length; i++) {
      if (airlines[i].getDestination().equalsIgnoreCase(destination)) {
        airlinesByDestination[j] = airlines[i];
        j++;
      }
    }

    return airlinesByDestination;
  }

  //список рейсов для заданного дня недели;
  public Airline[] selectionByDaysOfWeek(Airline[] airlines, DaysOfWeek daysOfWeek) {

    int numAirlines = 0;

    for (Airline airline : airlines) {
      if (airline.getDaysOfWeek().equals(daysOfWeek)) {
        numAirlines++;
      }
    }

    Airline[] airlinesByDaysOfWeek = new Airline[numAirlines];

    for (int i = 0, j = 0; i < airlines.length; i++) {
      if (airlines[i].getDaysOfWeek().equals(daysOfWeek)) {
        airlinesByDaysOfWeek[j] = airlines[i];
        j++;
      }
    }

    return airlinesByDaysOfWeek;
  }

  //список рейсов для заданного дня недели, время вылета для которых больше заданного.
  public Airline[] selectionByDaysAndTime(Airline[] airlines, DaysOfWeek daysOfWeek,
      String departureTime) {

    int numAirlines = 0;
    Date time;
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    try {
      time = formatter.parse(departureTime);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }

    for (Airline airline : airlines) {
      if (airline.getDaysOfWeek().equals(daysOfWeek) &&
          airline.getDepartureTime().compareTo(time) > 0) {
        numAirlines++;
      }
    }

    Airline[] airlinesByDaysAndTime = new Airline[numAirlines];

    for (int i = 0, j = 0; i < airlines.length; i++) {
      if (airlines[i].getDaysOfWeek().equals(daysOfWeek) &&
          airlines[i].getDepartureTime().compareTo(time) > 0) {
        airlinesByDaysAndTime[j] = airlines[i];
        j++;
      }
    }

    return airlinesByDaysAndTime;
  }
}
