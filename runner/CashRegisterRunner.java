package runner;

import controller.CashRegister;
import org.w3c.dom.ls.LSOutput;

public class CashRegisterRunner {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.receivedPayment(50);

        double change = register.giveChange();
        System.out.println(change);
        System.out.println("Expected: 11.25");
    }
}
