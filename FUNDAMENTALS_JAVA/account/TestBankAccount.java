package account;

public class TestBankAccount {

  public static void main(String[] args) {
    BankAccount account1 = new BankAccount();
    account1.setNumber("1234");
    account1.setOwner("John");
 
    
    account1.deposit(500);
    account1.withdraw(200);
    account1.withdraw(1500);
  }
}
