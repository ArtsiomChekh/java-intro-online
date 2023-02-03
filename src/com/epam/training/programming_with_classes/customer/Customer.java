package com.epam.training.programming_with_classes.customer;
/*
  8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
  и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
  Найти и вывести:
  a) список покупателей в алфавитном порядке;
  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

import java.util.Comparator;

public class Customer {

  private int id;
  private String name;
  private String surname;
  private String middleName;
  private String address;
  private int cardNumber;
  private int accountNumber;

  public Customer(int id, String name, String surname, String middleName, String address,
      int cardNumber, int accountNumber) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.middleName = middleName;
    this.address = address;
    this.cardNumber = cardNumber;
    this.accountNumber = accountNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", middleName='" + middleName + '\'' +
        ", address='" + address + '\'' +
        ", cardNumber='" + cardNumber + '\'' +
        ", accountNumber='" + accountNumber + '\'' +
        '}';
  }
}
