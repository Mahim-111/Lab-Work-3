package runner;

import Constant.Constant;
import controller.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {

        BankAccount bankAccount3;
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount(100);
        bankAccount3 = new BankAccount(300);

        bankAccount1.deposit(200);
        boolean success = bankAccount2.withdraw(200);
        boolean success1 = bankAccount3.withdraw(50);

        double balance = bankAccount2.getBalance();
        System.out.println(balance);

        System.out.println("Balance before Interest :" + bankAccount1.getBalance());
        double interestRate = 5; // 5 percent interest
        double interestAmount = bankAccount1.getInterest(interestRate);
        bankAccount1.deposit(interestAmount);
        System.out.println("Balance after Interest :" + bankAccount1.getBalance());

        bankAccount1.transferTo(bankAccount2, 50);
        System.out.println(bankAccount1.getBalance() + " " + bankAccount2.getBalance());

        double interestMoney = bankAccount2.getInterest(5);
        System.out.println(interestMoney);
    }
}
