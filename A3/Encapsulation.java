class BankAccount {
  private double balance; // Private variable

  public BankAccount(double initialBalance) {
      if (initialBalance > 0) {
          balance = initialBalance;
      } else {
          balance = 0; // Ensures balance can't be negative
      }
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
      }
  }

  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
      } else {
          System.err.println("Insufficient funds or invalid amount.");
      }
  }

  public double getBalance() {
      return balance;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
      BankAccount account = new BankAccount(100.0);
      account.deposit(50.0);
      account.withdraw(30.0);
      System.out.println("Current balance: " + account.getBalance());
      account.withdraw(200.0); // Attempt to withdraw more than available
  }
}
