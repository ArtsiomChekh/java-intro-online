package com.epam.training.programming_with_classes.aggregation_and_composition.account;
/*
  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
  счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
  всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

public class Account {

  private String bankName;
  private int accountNumber;
  private int accountAmount;

  private boolean isActive;

  public Account(String bankName, int accountNumber, int accountAmount, boolean isActive) {
    this.bankName = bankName;
    this.accountNumber = accountNumber;
    this.accountAmount = accountAmount;
    this.isActive = isActive;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountAmount() {
    return accountAmount;
  }

  public void setAccountAmount(int accountAmount) {
    this.accountAmount = accountAmount;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  @Override
  public String toString() {
    return "Account{" +
        "bankName='" + bankName + '\'' +
        ", accountNumber=" + accountNumber +
        ", accountAmount=" + accountAmount +
        ", isActive=" + isActive +
        '}';
  }
}
