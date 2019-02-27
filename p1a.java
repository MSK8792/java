class Bank
{
	String name,address,phone,pan,aadhar;
	public Bank()
	{}
	public Bank(String name,String address,String phone,String pan,String aadhar)
	{
		this.name = name;
		this.address= address;
		this.phone=phone;
		this.pan=pan;
		this.aadhar=aadhar;
	}
	void calcInt()
	{}
	void displayDetails()
	{
		System.out.print("Name :"+name+"\n"+"Address :"+address+"\n"+"Phone :"+phone+"\n"+"Pan :"+pan+"\n"+"Aadhar :"+aadhar);
	}
}

class SBAccount extends Bank
{
	String accno;
	double accbal,interest;
	public SBAccount(String name,String address,String phone,String pan,String aadhar,String no,double bal)
	{
		super(name,address,phone,pan,aadhar);
		accno=no;
		accbal=bal;
	}
	void calcInt()
	{
		interest=accbal*0.4;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.print("Account type: Savings\n"+"Account no :"+accno+"\n"+"Interest :"+interest+"\n");
	}	
}

class loanAccount extends Bank
{
	String accno;
	double loanamt,interest;
	public loanAccount(String name,String address,String phone,String pan,String aadhar,String no,double loan)
	{
		super(name,address,phone,pan,aadhar);
		accno=no;
		loanamt=loan;
	}
	void calcInt()
	{
		interest=loanamt*0.1;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.print("Account type: Loan\n"+"Account no :"+accno+"\n"+"Interest :"+interest+"\n");
	}
}

public class p1a
{
	public static void main(String args[])
	{
		Bank bankAcc=new Bank();
		bankAcc=new SBAccount("mohan nmit","bangalore","12345","a5dr7","166598","89465",15000);
		bankAcc.calcInt();
		bankAcc.displayDetails();
		System.out.println("\n");
		bankAcc=new loanAccount("msk","delhi","178566","hh66g65","18694","14789",30000);
		bankAcc.calcInt();
		bankAcc.displayDetails();
		System.out.println("\n");
		
	}
}


