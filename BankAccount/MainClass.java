package book;

public class MainClass {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.accountNumber = 123456;
        b.balance = 50000;

        b.displayBalance();
    }
}
