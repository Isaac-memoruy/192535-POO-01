package clase;

public class BankAccount {

    private String accountNumber;
    private double balance;


    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
       
    }

    public BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
        
    }

    
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void showBalance() {
        System.out.println("El balance de la cuenta " + this.accountNumber + " es: " + this.balance);
    }
}
