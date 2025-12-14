public class BankAccount {

    private double balance; 

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {

            this.balance = 0.0;
        }
        System.out.println("New BankAccount created with initial balance: " + this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful.");
        } else {

            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return; 
        }

        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        double initialBalance = 1000.0;
        double depositAmount = 500.0;
        double withdrawalAmount = 200.0;

        BankAccount account = new BankAccount(initialBalance); // Initial: 1000.0

        account.deposit(depositAmount); 

        account.withdraw(withdrawalAmount); 

        double finalBalance = account.getBalance();
        System.out.printf("Final Balance: %.1f\n", finalBalance); 
    }
}