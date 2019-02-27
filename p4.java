import java.util.Scanner;

class lessbalException extends Exception {
	String s1;
	lessbalException(String s2) {
		s1=s2;
	}
	public String tostring() {
		return("Less Balance Exception "+s1);
	}
}

class TransacNA extends Exception {
	String s1;
	TransacNA(String s2) {
		s1=s2;
	}
	public String tostring() {
		return("Transaction Not allowed :"+s1);
	}
}

class Axisbank {
	String name,addr,phone,pan,aadhar;
	double balance;
	public Axisbank(String name,String addr,String phone,String pan,String aadhar,double balance) {
		this.name=name;
		this.addr=addr;
		this.phone=phone;
		this.pan=pan;
		this.aadhar=aadhar;
		this.balance=balance;
	}
	void deposit(double amt) {
		balance+=amt;
	}
	void withdraw(double amt) {
		try {
			if(amt>4500)
				throw new TransacNA("Exceeds per day limit (day limit is 4500)");
			if((amt)<1000)
				throw new lessbalException("Insufficient balance,minimum 1000 to be maintained)");
			else {
				balance-=amt;
			}
		}
		catch (lessbalException e) {
			System.out.println(e);
		}
		catch (TransacNA e) {
			System.out.println(e);
		}
	}
	public void display() {
		System.out.println("Name "+name+"Addr "+addr+"phone "+phone+"pan "+pan+"aadhar "+aadhar);
	}
	
	public void display1() {
		System.out.println("Available bal is "+balance);
	}
}

public class p4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int c=0;
		double amt=0;
		Axisbank a=new Axisbank("Mohan","Bang","1234","abcr432","7650988",2000);
		a.display();
		a.display1();
		do {
			System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
			c=scan.nextInt();
			switch(c) {
			case 1:System.out.println("Enter amopunt to deposit");
					amt=scan.nextDouble();
					a.deposit(amt);
					a.display1();
					break;
			case 2:System.out.println("Enter amount to withdraw");
					amt=scan.nextDouble();
					a.withdraw(amt);
					a.display1();
					break;
			default: System.out.println("Invalid option");		
			}
		}while(c!=3);
	}
}
