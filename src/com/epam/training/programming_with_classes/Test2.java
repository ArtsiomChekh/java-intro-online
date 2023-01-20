package com.epam.training.programming_with_classes;
/*
  Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
  конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
  класса.
*/

public class Test2 {

  private int yearOfCreation;
  private String nameOfCompany;

  public Test2(int yearOfCreation, String nameOfCompany) {
    this.yearOfCreation = yearOfCreation;
    this.nameOfCompany = nameOfCompany;
  }

  private Test2() {
    this.yearOfCreation = 0;
    this.nameOfCompany = null;
  }


  public int getYearOfCreation() {
    return yearOfCreation;
  }

  public void setYearOfCreation(int yearOfCreation) {
    this.yearOfCreation = yearOfCreation;
  }

  public String getNameOfCompany() {
    return nameOfCompany;
  }

  public void setNameOfCompany(String nameOfCompany) {
    this.nameOfCompany = nameOfCompany;
  }
}
