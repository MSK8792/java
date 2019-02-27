import java.util.Scanner;

abstract class Vehicle
{
    String fuelStatus;
    
    public Vehicle(String status)
    {
        this.fuelStatus = status;
    }
    
    public void display() {
        System.out.println("Present_Status: "+ fuelStatus);
    }
     abstract void topspeed();
}

class Bike extends Vehicle
{
    String vehicleType;
    String topSpeed;
    
    public Bike(String status)
    {
        super(status);
        vehicleType = "Bike";
    }
    
    public void topspeed()
    {
        topSpeed = "100";
    }
    
    public void display()
    {
        System.out.println("Class: "+ vehicleType);
        super.display();
        System.out.println("Top speed: "+topSpeed);
    }
}

class Car extends Vehicle
{
    String vehicleType;
    String topSpeed;
    
    public Car(String status)
    {
        super(status);
        vehicleType = "Car";
    }
    
    public void topspeed()
    {
        topSpeed = "150";
    }
    
    public void display()
    {
        System.out.println("Vehicle type is\t "+ vehicleType);
        super.display();
        System.out.println("Top speed is: \t"+topSpeed);
    }
}


public class p2{
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("BIKE\n");
        System.out.println("Status_is:\n");
        Vehicle obj = new Bike(in.next());
        obj.topspeed();
        obj.display();
        System.out.println("Car\n");
        System.out.println("Status:\n");
        obj = new Car(in.next());
        obj.topspeed();
        obj.display();
    }
}


