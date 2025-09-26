import clase.BankAccount;

public class App {
    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount("12345", 500.0); 
        BankAccount account2 = new BankAccount("67890", 1000.0); 
        
      
        account1.deposit(200.0); 
        account1.withdraw(150.0); 
        account1.showBalance();   
        
        account2.deposit(500.0);  
        account2.withdraw(300.0); 
        account2.showBalance();   
    }
}

