import java.util.Scanner;

/*
 * Generating BankATMException whenever 
 * withdrawal is done for balance less than 10000
 */
//creating class BankAtm

public class Withdraw extends Exception implements Runnable {
	String s1;
	int atmId;
	String bankName, location;
	double b, c, b1, deposit,withdrw, c1, c2;

	public synchronized void run() {

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


	

	
	Withdraw(String s) {
		s1 = s;
	}

	// method to return string in case exception occurs
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}
}
// defining wihdraw method

// catching excepton
