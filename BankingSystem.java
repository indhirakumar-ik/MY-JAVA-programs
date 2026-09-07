package indhirakumar;

import java.util.Scanner;

abstract class bank{
	abstract void card(String a);
	abstract void AccountName(String name);
	abstract void AccountNumber(int number);
	abstract void PinNumber(int pin);
	abstract void money(int money);
	
}
 
class myAccount extends bank{

	@Override
	void card(String card) {
		if(card.equals("y")||card.equals("Y")) {
			System.out.println("Successfully insert your card");
		}else {
			System.out.println("please insert your card");
		}
	}

	@Override
	void AccountName(String name) {
		System.out.println("Your account name is :"+name);
	}

	@Override
	void AccountNumber(int number) {
		System.out.println("your Account number is :"+number);
	}

	@Override
	void PinNumber(int pin) {
		if(pin==9125) {
			System.out.println("pin is correct");
		}else {
			System.out.println("wrong pin");
		}
		
	}
	
	void money(int money) {
		if(money<=2000) {
			System.out.println("amount is ready please wait");
		}else {
			System.out.println("in sufficient balance");
		}
	}
	
}


public class BankingSystem{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		myAccount account=new myAccount();
		char next;
		do{System.out.println("Enter your debit card \'y/Y'");
		String card=scan.next();
		account.card(card);
		account.AccountName("Indhirakumar");
		account.AccountNumber(637446244);
		System.out.println("enter your pin");
		int pin=scan.nextInt();
		account.PinNumber(pin);
		System.out.println("Enter your money");
		int money=scan.nextInt();
		account.money(money);
		System.out.println("continue or not y/n");
		next=scan.next().charAt(0);
		}while(next=='y'||next=='Y');
		
	}

}
