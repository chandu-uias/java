//package bank;
import java.util.*;
interface Bank{
	boolean credentialsCheck(String username, String password);
	void credit(double amount);
	void debit(double amount) throws InsufficientFundsException;
	double displayBalance();
	void exit();
	}
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}

}
class BankManagementSystem implements Bank{
	String username;
	String password;
	double balance;
	public BankManagementSystem(String username,String password,double balance)
	{
		this.username=username;
		this.password=password;
		this.balance=balance;
	}
	public boolean credentialsCheck(String username, String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
		return true;
		else
		return false;
	}
	public void credit(double amount){
		balance+=amount;
		System.out.println("Current Balnace After credit:"+balance);
	
	
	}
	public void debit(double amount) throws InsufficientFundsException{
		if(amount>balance)
		{
			throw new InsufficientFundsException("Insufficient balance: Available balance:"+balance);
		}
	balance-=amount;
		System.out.println("Current Balnace After Debit:"+balance);
	}
	public double displayBalance(){
	
		System.out.println("Current Balnace:"+balance);
		return balance;
	}
	public void exit(){
	System.out.println("Exiting the Bank Management System. Thank you!");
	 System.exit(0);
	}
}
public class bank_exp{
	public static void main(String args[])
	{
	 BankManagementSystem bank=new BankManagementSystem("chandu","honey",10000);
	 Scanner sc=new Scanner(System.in);
	 while(true)
	 {
	 	System.out.println("\n choose an operation:");
	 	System.out.println("1:credentials check:");
	 	System.out.println("2: credit");
	 	System.out.println("3:debit:");
	 	System.out.println("4:Display Balance:");
	 	System.out.println("5:exit:");
	 	int choice=sc.nextInt();
	 	
	 	switch(choice)
	 	{
	 		case 1:
	 		System.out.print("Enter username:");
	 		String username=sc.next();
	 		System.out.print("Enter password:");
	 		String password=sc.next();
	 		if(bank.credentialsCheck(username,password))
	 		{
	 			System.out.println("Credientials are correct:");
	 		}
	 		else{
	 			System.out.println("Mismatch username or Mismatch password:");
	 		}
	 		break;
	 		case 2:
	 		System.out.print("Enter amount to u want to credit:");
	 		double amount=sc.nextDouble();
	 		bank.credit(amount);
	 		break;
	 		case 3:
	 		System.out.print("Enter amount to u want to debit:");
	 		double amount1=sc.nextDouble();
	 		try{
	 		
	 			bank.debit(amount1);
	 		}
	 		catch(InsufficientFundsException e)
	 		{
	 			System.out.println("Error: " + e.getMessage());
	 		}
	 		break;
	 		case 4:
		 		bank.displayBalance();
		 		break;
	 		case 5:
	 			bank.exit();
	 		break;
	 		default:
	 			System.out.println("Invalid choice :please enter a vaild operation");
	 			
	 		
	 	}
	 
	 }
	 
	 
	 
	 
	}
}
/*java bank_exp

 choose an operation:
1:credentials check:
2: credit
3:debit:
4:Display Balance:
5:exit:
2
Enter amount to u want to credit:2
Current Balnace After credit:10002.0

 choose an operation:
1:credentials check:
2: credit
3:debit:
4:Display Balance:
5:exit:
3
Enter amount to u want to debit:15000
Error: Insufficient balance: Available balance:10002.0

 choose an operation:
1:credentials check:
2: credit
3:debit:
4:Display Balance:
5:exit:
^Ccse-lab@CSE-LAB:~/Documents/JAVA$ javac bank_exp.java
cse-lab@CSE-LAB:~/Documents/JAVA$ java bank_exp

 choose an operation:
1:credentials check:
2: credit
3:debit:
4:Display Balance:
5:exit:
5
/
