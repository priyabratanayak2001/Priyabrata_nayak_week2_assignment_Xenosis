public class BankAccount {
    
    private double balance;

    
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: ₹" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(10000.00);

        account.displayBalance(); 

        account.deposit(5000.00);  
        account.displayBalance(); 

        account.withdraw(2000.00); 
        account.displayBalance(); 

        account.withdraw(15000.00);
        account.displayBalance();  
    }
}
