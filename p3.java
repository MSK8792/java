import java.util.Scanner;
interface TourPlan
{
	public abstract void ChennaitoHyd(String mode, double fare);
	public abstract void HydtoIndore(String mode, double fare);
	public abstract void IndoretoDelhi(String mode, double fare);
}
class TravelAgent implements TourPlan
{
	double totalFare=0.0;
	public void ChennaitoHyd(String mode,double fare)
	{
		System.out.println("Travel from Chennai to Hydrabad by "+mode+"Travel fare is "+fare);
		totalFare+=fare;
	}
	public void HydtoIndore(String mode, double fare)
	{
		System.out.println("Travel from Hydrabad to Indore by "+mode+"Travel fare is "+fare);
		totalFare+=fare;
	}
	public void IndoretoDelhi(String mode, double fare)
	{
		System.out.println("Travel from Indore to Delhi by "+mode+"Travel fare is "+fare);
		totalFare+=fare;
		System.out.println("Totalfare is = "+totalFare);
	}
	
}
class p3
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		TravelAgent obj=new TravelAgent();
		System.out.println("Enter the mode of transport for Chennai to Hydrabad");
		String m1=ob.next();
		System.out.println("Enter the fare");
		double f1=ob.nextDouble();
		
		obj.ChennaitoHyd(m1, f1);
		
		System.out.println("Enter the mode of transport for Hydrabad to Indore");
		String m2=ob.next();
		System.out.println("Enter the fare");
		double f2=ob.nextDouble();
		obj.HydtoIndore(m2, f2);
		
		System.out.println("Enter the mode of transport for Indore to Delhi");
		String m3=ob.next();
		System.out.println("Enter the fare");
		double f3=ob.nextDouble();
		obj.IndoretoDelhi(m3, f3);
		
	}
}
