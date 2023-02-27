package com.epam.training.programming_with_classes.aggregation_and_composition.account;

public class AccountManagement {

  public int accountSearch(Client client, int id) {
    int result = 0;
    for (Account account : client.getAccounts()) {
      if (account.getAccountNumber() == id) {
        result = id;
      } else {
        System.out.printf("Такого счета не существует!");
      }
    }
    return result;
  }

  public Account[] accountSort(Client client) {
    Account[] accounts = client.getAccounts();
    for (int i = 0; i < accounts.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < accounts.length; j++) {
        if (accounts[j].getAccountAmount() > accounts[i].getAccountAmount()) {
          index = j;
        }
      }
      Account largerAmount = accounts[index];
      accounts[index] = accounts[i];
      accounts[i] = largerAmount;
    }
    return accounts;
  }

  public int amountOnAccounts(Client client) {
    int result = 0;
    for (Account account : client.getAccounts()) {
      result += account.getAccountAmount();
    }
    return result;
  }

  public int positiveAmountOnAccounts(Client client) {
    int result = 0;
    for (Account account : client.getAccounts()) {
      if (account.getAccountAmount() > 0) {
        result += account.getAccountAmount();
      }
    }
    return result;
  }

  public int negativeAmountOnAccounts(Client client) {
    int result = 0;
    for (Account account : client.getAccounts()) {
      if (account.getAccountAmount() < 0) {
        result += account.getAccountAmount();
      }
    }
    return result;
  }


}
