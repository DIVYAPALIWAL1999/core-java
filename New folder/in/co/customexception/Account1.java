package in.co.customexception;

import in.co.customexception.InsufficientFundException;

public class Account1 {
//	 private static final Exception e = null;
//	private int amount =1000;
     private int balance =3000;
//     public int amount() {
//     	return amount;
     
     public int balance() {
     	return balance;
     }
     public  void withdraw(int amount, int balance)throws Exception {
     	if(amount > balance) {
     		
			throw new Exception();
     	}
     	balance = balance - amount;
     	}
//     private static void InsufficientFundException() {
//		// TODO Auto-generated method stub
		
	private  void InsufficientFundException() {
		// TODO Auto-generated method stub
		
	}
	
	public static void deposit(int amount) throws Exception {
     if(amount<=7000) {
     	
		throw new InsufficientFundException();
}
}
}