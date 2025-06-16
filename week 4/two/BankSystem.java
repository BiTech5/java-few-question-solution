/*2. Bank Account Simulation

Instructions:

    Create a class BankAccount with:
        Fields: accountNumber, balance
        Methods: deposit(double amount), withdraw(double amount), and getBalance()
    Create a subclass SavingsAccount with:
        Field: interestRate
        Override withdraw() to prevent withdrawal if it causes the balance to fall below a threshold (e.g., 1000).
        Add a method addInterest() to update balance based on the interest rate.
    Make all fields private and use getters/setters.
    Demonstrate account creation, deposit, interest addition, and controlled withdrawal.
    File: BankSystem.java.
*/
class BankAccount{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("insufficient balance ");
        }
    }
    // getter
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    //setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: balance cannot fall below " + 1000);
        }
    }
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}
public class BankSystem {
    public static void main(String[] args){
        SavingsAccount account = new SavingsAccount("SA123456", 2000.0, 5.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        account.addInterest();
        account.withdraw(1000);
        account.withdraw(2000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
