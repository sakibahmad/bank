import java.util.Scanner;
public class Deposit  implements Runnable {
	String s1; 
	int atmId;
	String bankName, location;
	double b,c,b1,deposit,c1=0,c2;
	public synchronized void start(){
		start();
	}
	Thread t1=new Thread(new Runnable(){
		
	
	public   void run(){

		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the amount to deposit ");
		 double amnt =s1.nextDouble();
		 
		 
		 deposit=deposit+amnt;
		 System.out.println("credit amount balance "+deposit);
		 

		
		}});
	


public static void main(String[] args) {
	// object of bankAtam class
	Deposit obj = new Deposit();
	Thread t1=new Thread(obj);
	
	t1.start();
	
Withdraw obj1=new Withdraw(" insufficient balance ");
	Thread t2=new Thread(obj1);
	t2.start();
}



public void run() {
	// TODO Auto-generated method stub
	
}
}