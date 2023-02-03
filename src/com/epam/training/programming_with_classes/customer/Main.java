package com.epam.training.programming_with_classes.customer;

public class Main {

  public static void main(String[] args) {

    Customer[] customers = new Customer[]{
        new Customer(1, "Vaslov", "Petr", "Ivanovich", "London", 1223, 123214),
        new Customer(2, "German", "Dmitry", "Vitalievich", "Tokio", 1123, 424214),
        new Customer(3, "Puska", "Andrei", "Grigorievich", "Minsk", 4442, 122112)};

    for (Customer customer : customers) {
      System.out.println(customer.toString());
    }

    System.out.println("***");

    // список покупателей в алфавитном порядке;
    Customers.printCustomersInAlphabeticalOrder(customers);

    System.out.println("***");

    //  список покупателей, у которых номер кредитной карточки находится в заданном интервале
    Customers.printCustomersInInterval(customers, 1100, 1250);
  }

}
