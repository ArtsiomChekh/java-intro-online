package com.epam.training.programming_with_classes.student;
/*
  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
  номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Main {

  public static void main(String[] args) {

    Student[] students = new Student[10];

    students[0] = new Student("Petrov", "I.A.", 1);
    students[1] = new Student("Ivanov", "A.A.", 3);
    students[2] = new Student("Cherkasov", "V.K.", 1);
    students[3] = new Student("Dimako", "M.K.", 1);
    students[4] = new Student("Topoly", "C.F.", 3);
    students[5] = new Student("Nikitin", "G.A.", 2);
    students[6] = new Student("Nikolad", "L.C.", 3);
    students[7] = new Student("Bugaha", "M.A.", 2);
    students[8] = new Student("Germanovich", "N.C.", 2);
    students[9] = new Student("Didisha", "I.R.", 3);

    System.out.println("Все список студентов: ");
    for (int i = 0; i < students.length; i++) {
      students[i].print();
    }
    System.out.println("Лучшие студентов с оценками 10 и 9: ");
    for (int i = 0; i < students.length; i++) {
      Student.printTheBestStudent(students[i]);
    }


  }


}


