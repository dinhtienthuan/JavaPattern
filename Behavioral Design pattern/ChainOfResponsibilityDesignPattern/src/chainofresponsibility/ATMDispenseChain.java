package chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain chain1;
    private static Scanner input;

    public ATMDispenseChain() {
        chain1 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();
        DispenseChain chain4 = new Dollar5Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenseer = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 5 != 0) {
                System.out.println("Amount should be in mutiple of 10s");
                return;
            }
            atmDispenseer.chain1.dispense(new Currency(amount));
        }
    }
}
