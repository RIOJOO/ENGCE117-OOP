class BankEnvironment {
    
    private double balance;
    
    private static int totalTransactionCount = 0;

    public BankEnvironment(double initialDeposit) {
        this.balance = initialDeposit;
        
        totalTransactionCount++;
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        totalTransactionCount++;
        System.out.println("Deposit successful.");
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds.");
            return false;
        }
    }
    
    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

class Main {
    public static void main(String[] args) {
        
        BankEnvironment accountA = new BankEnvironment(1000.0);
        
        accountA.deposit(500.0);
        
        accountA.withdraw(300.0);
        
        accountA.withdraw(2000.0);
        
        System.out.println("\n--- STATUS ---");
        System.out.println("Account Balance: " + accountA.getBalance());
        System.out.println("Total Transaction Count: " + BankEnvironment.getTotalTransactionCount());


        
        BankEnvironment accountB = new BankEnvironment(200.0);
        
        accountB.deposit(800.0);
        
        System.out.println("\n--- FINAL STATUS ---");
        System.out.println("Account A Balance: " + accountA.getBalance());
        System.out.println("Account B Balance: " + accountB.getBalance());
        System.out.println("Total Transaction Count (Static): " + BankEnvironment.getTotalTransactionCount()); // Expected: 5
    }
}