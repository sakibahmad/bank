import java.util.Scanner;

/*
 * Generating BankATMException whenever 
 * withdrawal is done for balance less than 10000
 */
//creating class BankAtm

public class SyncBank extends Exception implements Runnable {
	String s1; 
	int atmId;
	String bankName, location;
	double withdrw,c,deposit,c1,c2;
	public void run(){
		
	}
	public synchronized void start(){
		start();
		
	}
	
	SyncBank(String s){
		s1=s;
	}
	// method to return string in case exception occurs
	  public String toString (){
		return ("Bank exception WE ARE SORRY "+s1);
		
	}

	// defining wihdraw method
	public   void withdraw() {
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the amount to withdraw ");
		 withdrw=s2.nextDouble();
		
		// TRY and CATCH to deal with exception
		try {
			// logic condition if amount entered is greater than balance
			if (deposit <0)
				throw new Bank ("your balance is " +deposit );
			
			
			
			
				if(deposit>=withdrw)
				{
			// deduction of balance
			deposit = deposit-withdrw;
			System.out.println("available balance " + deposit);
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
	public synchronized void deposit() {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the amount to deposit ");
		 double amnt =s1.nextDouble();
		 
		 
		 deposit=deposit+amnt;
		 System.out.println("credit amount balance "+deposit);
		 

	}

	public static void main(String[] args) {
		// object of bankAtam class
		SyncBank obj = new SyncBank(" insufficient balance " );
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




