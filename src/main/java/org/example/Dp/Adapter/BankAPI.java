package org.example.Dp.Adapter;

public interface BankAPI {
    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc,
                      String toAcc,
                      double amount);
}
