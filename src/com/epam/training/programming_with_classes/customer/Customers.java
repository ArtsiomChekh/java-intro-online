package com.epam.training.programming_with_classes.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Customers {

  private Customer[] customers;

  public Customers(Customer[] customers) {
    this.customers = customers;
  }

  public static void printCustomersInAlphabeticalOrder(Customer[] customers) {
    Arrays.sort(customers, Comparator.comparing(Customer::getSurname)
        .thenComparing(Customer::getName)
        .thenComparing(Customer::getMiddleName));

    for (Customer customer : customers) {
      System.out.println(customer.toString());
    }
  }

  public static void printCustomersInInterval(Customer[] customers, int start, int end) {

    List<Customer> customerList = new ArrayList<>();
    for (Customer customer : customers) {
      if (customer.getCardNumber() >= start &&
          customer.getCardNumber() <= end) {
        customerList.add(customer);
      }
    }

    for (Customer customer : customerList) {
      System.out.println(customer.toString());
    }
  }


}
