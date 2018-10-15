package Oops_basics;
class Account
{
	int amount;
	String Name;	
	void deposit(int newamount)
	{
		amount  = amount + newamount;
	}
	void withdraw(int newamount)
	{
		amount = amount - newamount;
	}
	void displayName()
	{
		System.out.println(Name);
	}
	void diaplyAmount()
	{
		System.out.println(amount);
	}
}
public class BankSystem {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.Name  = "siva";
		a1.amount = 10000;	
		a1.deposit(30000);
		a1.displayName();
		a1.diaplyAmount();
	}
}
