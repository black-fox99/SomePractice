package lesson5;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double  balance = 100;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Balans do popolneniya: " + balance);
        System.out.println("Balans popolnyaetsya na: " + summaPopolneniya);
        balance +=summaPopolneniya;
        System.out.println("Balans posle popolneniya: " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatiya) {
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Balans umenshaetsya na: " + summaSnyatiya);
        balance -=summaSnyatiya;
        System.out.println("Balans posle snyatiya: " + balance);
        System.out.println();

    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.popolnenieScheta(50.2);
        MyAccount.snyatieSoScheta(43.5);
    }
}
