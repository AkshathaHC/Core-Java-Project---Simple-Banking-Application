package bankproject;

import java.util.Scanner;

public class BankApplicationProject 
{
	String fname, lname,actype;
	int accNo, bal, amt;
	float principle=0, r=0, t=0,si;
	Scanner sc = new Scanner(System.in);
	
	void ExistingUser()
	{
		System.out.println("Enter your First Name");
		fname = sc.next();
		System.out.println("Enter your Last Name");
		lname = sc.next();
		System.out.println("Enter Account Number");
		accNo = sc.nextInt();
		System.out.println("Enter Account type");
		actype = sc.next();
		System.out.println("Enter Your Initial Balance");
		bal = sc.nextInt();
	}
	
	int deposit() 
	{
		System.out.print("Enter amount to deposit:");
		amt = sc.nextInt();
		if (amt < 0) 
		{
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal + amt;
		System.out.println("Your money has been deposited successfully");
		return 0;
	}

	int withdraw() 
	{
		System.out.println("Your Balance=" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = sc.nextInt();
		if (bal < amt) 
		{
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) 
		{
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		System.out.println("balance updated,Your account balance is "+bal);
		System.out.println("Please collect your money");
		return 0;
	}
	
	void display() 
	{
		System.out.println("Name:" + fname +" " + lname);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance:" + bal);

	}
	
	void simpleinterest()
	{
		System.out.print("Enter your principle amount:");
		principle = sc.nextFloat();
		System.out.print("Enter your rate:");
		r = sc.nextFloat();
		System.out.print("Enter your time:");
		t = sc.nextFloat();
		
		float si = (principle * t * r) / 100;
		 
		si  = (principle*r*t)/100;
		System.out.println("Simple interest is : " + si);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Bank of India Banking Application");
		System.out.println("");
		
		BankApplicationProject b1 = new BankApplicationProject();
		int menu;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("");
		System.out.println("1. Existing User");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Display Information");
		System.out.println("5. Calculate interest");
		System.out.println("6. Exit");
		System.out.println("");
		
		boolean quit = false;
		do 
		{
			System.out.print("Please enter your choice: ");
			menu = sc.nextInt();
			
			switch (menu) 
			{
				case 1:
					b1.ExistingUser();
					System.out.println("");
				break;
				
				case 2:
					b1.deposit();
					System.out.println("");
				break;

				case 3:
					b1.withdraw();
					System.out.println("");
				break;

				case 4:
					b1.display();
					System.out.println("");
				break;
				
				case 5:
					b1.simpleinterest();
					System.out.println("");
				break;
				
				case 6:
					quit = true;
					
					System.out.println("Thank you for using Bank of India Banking Application Visit Again");
				break;
			}
		}
		while (!quit);
	}
}
