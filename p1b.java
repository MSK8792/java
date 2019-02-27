
import java.util.Scanner;
class Bank
{
    String name;
    String addr;
    int phone;
    String pan;
    String adhaar;
   
    public Bank()
    {}
   
    public Bank(String name,String addr,int phone,String pan,String adhaar)
    {
    this.name = name;
    this.addr = addr;
    this.phone = phone;
    this.pan = pan;
    this.adhaar = adhaar;
    }
   
    void calcInt()
    {}
   
    void displayDetails()
    {
     System.out.println(" Name:"+name+" Address:"+addr+" PHone:"+phone+" Pan:"+pan+" Adhaar NO:"+adhaar);
     }
}
class SBAcc extends Bank
{
    String accNum;
    double accBal;
    double interest;
    public SBAcc(String name,String addr,int phone,String pan,String adhaar,String num1,double num2)
    {
    super(name,addr,phone,pan,adhaar);
    accNum = num1;
    accBal = num2;
    }
    void calcInt()
    {
    interest = accBal * 0.04;
    }
   
    void displayDetails()
    {
     super.displayDetails();
     System.out.println(" Account type:SB Account \nAccount No:"+accNum+" \nInterest:"+interest+" \nfor amount:"+accBal);
     }
}


class LoanAcc extends Bank
{
    String accNum;
    double loanAmt;
    double interest;
    public LoanAcc(String name,String addr,int phone,String pan,String adhaar,String num1,double loan)
    {
    super(name,addr,phone,pan,adhaar);
    accNum = num1;
    loanAmt = loan;
    }
    void calcInt()
    {
    interest = loanAmt * 0.10;
    }
   
    void displayDetails()
    {
     super.displayDetails();
     System.out.println(" Account type:SB Account \nAccount No:"+accNum+" \nInterest:"+interest+" \nfor amount:"+loanAmt);
     }
}

public class p1b
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        String name =s.next();
       
        System.out.println("\nEnter address:");
        String addr =s.next();
       
        System.out.println("\nEnter phone:");
        int phone =s.nextInt();
       
        System.out.println("\nEnter pan:");
        String pan=s.next();
        
        System.out.println("Enter aadhaar:");
        String adhaar=s.next();
     
        Bank b = new Bank(name,addr,phone,pan,adhaar);
        System.out.println("Enter the type of account:SB/Loan");
        String s1 = s.next();
       
        if("SB".equals(s1) || "sb".equals(s1))
        {
             System.out.println("Enter the account number and account balance");
             String accNum =s.next();
             
             double accBal = s.nextDouble();
             SBAcc sb = new SBAcc(name,addr,phone,pan,adhaar,accNum,accBal);
             sb.calcInt();
             sb.displayDetails();
        }
        else if ("Loan".equals(s1) || "loan".equals(s1))
        {
             System.out.println("Enter the account number and loan amount");
             String accNum =s.next();
             
             double loanAmt = s.nextDouble();
             LoanAcc la = new LoanAcc(name,addr,phone,pan,adhaar,accNum,loanAmt);
             la.calcInt();
             la.displayDetails();
        }
        else
        {
             System.out.println("Enter correct type of account\n");
        }
    }
}



    

