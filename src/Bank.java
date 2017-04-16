import java.util.Scanner;

/*
 * Generating BankATMException whenever 
 * withdrawal is done for balance less than 10000
 */
//creating class BankAtm

public class Bank  extends Exception implements Runnable {
	String s1; 
	int atmId;
	String bankName, location;
	double b,c,b1,deposit,c1,c2;
	public void run(){
		
	}
	
	Bank(String s){
		s1=s;
	}
	// method to return string in case exception occurs
	  public String toString (){
		return ("Bank exception WE ARE SORRY "+s1);
		
	}

	// defining wihdraw method
	public void withdraw() {
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the amount to withdraw ");
		 b=s2.nextDouble();
		
		// TRY and CATCH to deal with exception
		try {
			// logic condition if amount entered is greater than balance
			if (b1 <0||b1<b)
				throw new Bank ("your balance is " +b1 );
			
			 b1 = b1-b;
			
			
				if(b1>0)
				{
			// deduction of balance
			//b1 = b1-b;
			System.out.println("available balance " + b1);
			c=b1;
			}
				else
					System.out.println("insufficient balance");
		}
		// catching excepton
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	// deposit method
	public void deposit() {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the amount to deposit ");
		 b1=s1.nextDouble();
		 
		 
		 b1=b1+c;
		 System.out.println("credit amount balance "+b1);

	}

	public static void main(String[] args) {
		// object of bankAtam class
		Bank obj = new Bank(" insufficient balance " );
		Thread t1=new Thread(obj);
		t1.start();
		obj.deposit();
		obj.withdraw();
		
		Thread t2=new Thread(obj);
		t2.start();
		obj.deposit();
		obj.withdraw();
		obj.withdraw();

}

}
