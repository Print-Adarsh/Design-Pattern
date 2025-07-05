package org.example.Dp.Adapter;

public class ICICIapiAdapter implements BankAPI {
    ICICIBankAPI icicibankapi=new ICICIBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

//    @Override
//    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
//        return false;
//    }

//   @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        icicibankapi.makePayment(toAcc,fromAcc, (int) amount);
        return false;
    }

//    @Override
//    public boolean sendMoney(String fromAcc, String toAcc,int  amount) {
//        //System.out.println("ICICI API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
//        icicibankapi.makePayment(to,from,amount);
//        return false;
//    }
}
