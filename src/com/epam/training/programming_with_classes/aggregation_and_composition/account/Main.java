package com.epam.training.programming_with_classes.aggregation_and_composition.account;

import java.util.Arrays;

/*
  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
  счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
  всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/
public class Main {

  public static void main(String[] args) {

    Account account1 = new Account("PriorBank", 123, 1000, true);
    Account account2 = new Account("MTBank", 223, -300, true);
    Account account3 = new Account("AlfaBank", 129, 2340, true);

    Account[] accounts = {account1, account2, account3};

    Client client = new Client("Andrei Bax", accounts);
    AccountManagement accountManagement = new AccountManagement();

    System.out.println("Поиск счета: " + accountManagement.accountSearch(client, 123));
    System.out.println("Сортировка: " + Arrays.toString(accountManagement.accountSort(client)));
    System.out.println("Общая сумма по счетам: " + accountManagement.amountOnAccounts(client));
    System.out.println(
        "Общая сумма по положительным счетам: " + accountManagement.positiveAmountOnAccounts(
            client));
    System.out.println(
        "Общая сумма по отрицательным счетам: " + accountManagement.negativeAmountOnAccounts(
            client));

  }

}
