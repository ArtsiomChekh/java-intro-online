package com.epam.training.programming_with_classes.airline;
/*
  10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
  и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
  методами. Задать критерии выбора данных и вывести эти данные на консоль.
  Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
  Найти и вывести:
  a) список рейсов для заданного пункта назначения;
  b) список рейсов для заданного дня недели;
  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

  private String destination;
  private int flightNumber;
  private AircraftType aircraftType;
  private String departureTime;
  private DaysOfWeek daysOfWeek;


  public Airline(String destination, int flightNumber, AircraftType aircraftType,
      String departureTime, DaysOfWeek daysOfWeek) {
    this.destination = destination;
    this.flightNumber = flightNumber;
    this.aircraftType = aircraftType;
    this.departureTime = departureTime;
    this.daysOfWeek = daysOfWeek;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public int getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public AircraftType getAircraftType() {
    return aircraftType;
  }

  public void setAircraftType(AircraftType aircraftType) {
    this.aircraftType = aircraftType;
  }

  public Date getDepartureTime() {
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    try {
      return formatter.parse(this.departureTime);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public void setDepartureTime(String departureTime) {
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    try {
      Date time = formatter.parse(departureTime);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  public DaysOfWeek getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  @Override
  public String toString() {
    return "Airline(" +
        "destination:" + destination +
        ", flightNumber:" + flightNumber +
        ", aircraftType:" + aircraftType +
        ", departureTime:" + departureTime +
        ", daysOfWeek:" + daysOfWeek +
        ')';
  }

}
