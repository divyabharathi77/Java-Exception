package encapsulation;

public class Bank {
	
	private int accountno=123456;
	private int pin=1234;
	private double balance=10000;
	
	public void withdrawal(int accno, int pinno, int balanceamount)
	{
		if(accno==accountno && pinno==pin)
		{
			System.out.println("valid credentials");
			if(balanceamount<=balance)
			{   double remaingbalance;
			    remaingbalance=balance-balanceamount;
				System.out.println("reamining balance is"+remaingbalance);
			}
			else
				System.out.println("enter valid amount which is less than balance");
			
		}
		else 
		{
			System.out.println("invalid credentials");
		}
		
	}
	 
	public void updatedpin(int accno,int oldpinno,int newpin)
	{
		if(accno==accountno && oldpinno==pin)
		{
			pin=newpin;
			
		}
	}
}
	/*public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	}
	*/


