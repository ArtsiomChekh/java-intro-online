package com.epam.training.programming_with_classes.student;
/*
  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
  номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Student {

  private String lastname;
  private String initials;
  private int groupNumber;
  private final int[] grades;


  public Student(String lastname, String initials, int groupNumber) {
    this.lastname = lastname;
    this.initials = initials;
    this.groupNumber = groupNumber;
    grades = new int[5];
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getInitials() {
    return initials;
  }

  public void setInitials(String initials) {
    this.initials = initials;
  }

  public int getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(int groupNumber) {
    this.groupNumber = groupNumber;
  }

  public int[] getGrades() {
    return grades;
  }

  public void addGrade() {
    for (int i = 0; i < grades.length; i++) {
      grades[i] = (int) (Math.random() * 3 + 8);
    }
  }

  public boolean isGood() {
    for (int i = 0; i < grades.length; i++) {
      if (grades[i] != 9 && grades[i] != 10) {
        return false;
      }
    }
    return true;
  }

  public void print() {
    System.out.print(lastname + " " + initials + ",");
    System.out.print(" group: " + getGroupNumber() + ", grades: ");
    addGrade();
    for (int i = 0; i < getGrades().length; ++i) {
      System.out.print(grades[i] + " ");
    }
    System.out.print("\n");
  }

  public static void printTheBestStudent(Student student) {
    if (student.isGood()) {
      System.out.printf("%s, group: %d", student.getLastname(), student.getGroupNumber());
      System.out.print("\n");
    }

  }

}
