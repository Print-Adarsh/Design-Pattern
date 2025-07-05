package org.example.Dp.Adapter;

public class YBAPIAdapter implements BankAPI{
    YesBankAPI YesBankAPI=new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        return false;
    }
}
