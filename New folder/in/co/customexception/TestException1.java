package in.co.customexception;

import in.co.customexception.Account1;

public class TestException1 {
	public static void main(String[] args) throws Exception{
		Account1 a = new Account1();

		System.out.println("current balance: " +a.balance());
		System.out.println("withdrawing 200");
		a.withdraw(500, 0);
		System.out.println("current balance: " +a.balance());
		a.withdraw(1500, 0);
	}
	}



