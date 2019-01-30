package encapsulation;

public class ATM {
	public static void main(String[] args)
	{
		Bank check=new Bank();
		
		
		check.updatedpin(123456, 1234, 4444);
		check.withdrawal(123456,4444,5000);
	}

}
