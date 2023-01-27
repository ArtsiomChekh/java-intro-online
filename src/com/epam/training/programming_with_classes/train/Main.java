package com.epam.training.programming_with_classes.train;
/*
  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
  назначения должны быть упорядочены по времени отправления.
*/

import com.epam.training.programming_with_classes.train.Train.comparatorByDestination;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in)) {

      Train[] trains = new Train[5];

      trains[0] = new Train("Minsk", 222, "00:30");
      trains[1] = new Train("Paris", 224, "03:00");
      trains[2] = new Train("Praga", 221, "12:30");
      trains[3] = new Train("Munhen", 220, "10:15");
      trains[4] = new Train("Krakov", 225, "18:30");

      while (true) {

        System.out.println("Список команд: \n 1. Отсортировать поезда по номеру поезда "
            + "\n 2. Вывести информацию по введенному номеру поезда "
            + "\n 3. Отсортировать поезда по пункту назначения "
            + "\n 4. Выход");

        int command = scanner.nextInt();

        switch (command) {

          case 1:
            Arrays.sort(trains, new Train.comparatorByNumber());
            for (Train train : trains) {
              train.print();
            }
            break;

          case 2:
            System.out.println("Введите номер поезда:");
            int number = scannerNumber.nextInt();

            for (Train train : trains) {
              if (train.getNumberOfTrain() == number) {
                train.print();
              }
              if (train.getNumberOfTrain() != number) {
                System.out.println("Этого номера нет в списке");
                break;
              }
            }

            break;

          case 3:
            Arrays.sort(trains, new comparatorByDestination());
            for (Train train : trains) {
              train.print();
            }
            break;

          case 4:
            return;
        }
      }

    }

  }

}
