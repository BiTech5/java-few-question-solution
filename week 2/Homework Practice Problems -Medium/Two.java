// Bank Account System Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.

class BankAccount{
	String accountHolderName;
	int accountnumber;
	double balance;

	public BankAccount(String accountHolderName,int accountnumber,double balance){
		this.accountHolderName=accountHolderName;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	public void withdraw(double amount){
		if(amount>balance){
			System.out.println("Insufficient balance");
		}
		else if(amount>0){
			balance-=amount;
			System.out.println("Successfully withdraw Rs."+amount);
			System.out.println("Your new balance is Rs."+balance);
		}else{
			System.out.println("Error");
		}
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Successfully deposit Rs."+amount);
                        System.out.println("Your new balance is Rs."+balance);
		}else{
			System.out.println("Error");
		}
	}
}
public class Two{
	public static void main(String[] args){
		BankAccount acc1=new BankAccount("Bikram",322332,400.3);
		acc1.deposit(200);
		acc1.withdraw(100);
	}
}
