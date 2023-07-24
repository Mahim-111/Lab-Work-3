package controller;

public class CashRegister {
    public  double taka, recAmount;
    public CashRegister() {
        taka = 0;
        recAmount =0;
    }
    public void recordPurchase(double amount) {
        recAmount = recAmount + amount;
    }
    public void receivedPayment(double amount) {
        taka = amount;
    }
    public double giveChange(){
        return taka - recAmount;
    }
}
