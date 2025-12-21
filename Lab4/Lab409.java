import java.util.Scanner;

class ImmutableAccount {
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = Math.max(0.0, balance);
    }

    public ImmutableAccount(ImmutableAccount other) {
        this(other.accountId, other.balance);
    }

    public String getAccountId() { return accountId; }
    public double getBalance() { return balance; }

    public ImmutableAccount deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }
        return new ImmutableAccount(this.accountId, this.balance + amount);
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawn amount.");
            return this;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return this;
        }
        return new ImmutableAccount(this.accountId, this.balance - amount);
    }

    public void displayInfo() {
        System.out.printf("ID: %s, Balance: %.1f\n", accountId, balance);
    }
}

public class Lab409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String id = sc.next();
        double initial = sc.nextDouble();
        double dep = sc.nextDouble();
        double with = sc.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initial);
        
        ImmutableAccount acc3 = acc1.deposit(dep).withdraw(with);

        acc1.displayInfo();
        acc3.displayInfo();
        
        sc.close();
    }
}