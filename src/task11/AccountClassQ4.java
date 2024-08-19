package task11;

public class AccountClassQ4 {

	int balance;
	
	public AccountClassQ4()
	{
	}
	
	public AccountClassQ4(int balance)
	{
		this.balance=balance;
		System.out.println("Current account balance :" +balance);
	}
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("Balance after withdrawal  :" +balance);
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("Balance after deposit : "+balance);
	}

	public static void main(String[] args) {
	
       AccountClassQ4 objA=new AccountClassQ4(1000);
       objA.withdraw(100);
       objA.deposit(500);
       
	}

}
