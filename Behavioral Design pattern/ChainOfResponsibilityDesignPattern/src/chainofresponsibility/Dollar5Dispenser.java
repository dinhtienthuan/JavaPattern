package chainofresponsibility;

public class Dollar5Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 5) {
            int number = currency.getAmount() / 5;
            int remainder = currency.getAmount() % 5;
            System.out.println("Despensing " + number + "$5 note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

}
