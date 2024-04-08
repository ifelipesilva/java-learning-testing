package account;

public class BankAccount {
  
  private String number;
  private String owner;
  private double balance;


  // Getters & Setters
  public BankAccount() {
    balance = 0.0;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNumber() {
    return this.number;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getOwner() {
    return this.owner;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }




  // deposit
  void deposit(double amount) {
    if(amount > 0) {
      balance += amount;
      System.out.println("Deposited " + amount + " to " + number);
      System.out.println("Current balance: " + balance);
    } else {
      System.out.println("Invalid amount");
    }
  }


  // withdraw
  void withdraw(double amount) {
    if(amount > 0 && amount <= balance){
      balance -= amount;
      System.out.println("Withdrew " + amount + " from " + number);
      System.out.println("Current balance: " + balance);
    } else {
      System.out.println("Invalid amount");
    }
  }
 
}
