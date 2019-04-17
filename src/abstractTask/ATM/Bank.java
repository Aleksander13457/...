package abstractTask.ATM;

abstract class Bank {
    abstract protected void inserCard();

    abstract protected void pin();

    abstract protected void moneyToPayOut();

    private void infoAboutMoneyToPayOut() {
        System.out.println("W trakcie realizacji");
    }

    private void checkBalanse() {
        System.out.println("Sprawdzanie dostępności środków");
    }

    private void agreeToPayOut() {
        System.out.println("Wypłata środków w trakcie realizacji");
    }

    abstract protected void money();

    abstract protected void thanks();

    public void run() {
        inserCard();
        pin();
        moneyToPayOut();
        infoAboutMoneyToPayOut();
        checkBalanse();
        agreeToPayOut();
        money();
        thanks();
    }
}

class ATM extends Bank {

    @Override
    protected void inserCard() {
        System.out.println("Wprowadź kartę");
    }

    @Override
    protected void pin() {
        System.out.println("Podaj PIN");
    }

    @Override
    protected void moneyToPayOut() {
        System.out.println("Podaj kwotę do wypłaty");
    }

    @Override
    protected void money() {
        System.out.println("Srodki wypłacone");
    }

    @Override
    protected void thanks() {
        System.out.println("Dziękujemy");
    }
}

class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }

}