package com.epam.training.programming_with_classes.aggregation_and_composition.account;

public class Client {

  private String clientName;
  private Account[] accounts;

  public Client(String clientName, Account[] accounts) {
    this.clientName = clientName;
    this.accounts = accounts;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public Account[] getAccounts() {
    return accounts;
  }

  public void setAccounts(
      Account[] accounts) {
    this.accounts = accounts;
  }
}
