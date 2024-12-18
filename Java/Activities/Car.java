package test.Java;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car (String color,String transmission,int make,int tyres,int doors)
	{
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = tyres;
		this.doors = doors;		
	};
	void displayCharacteristics() {
		System.out.println("Car color is - " + this.color);
		System.out.println("car transmission is - " + this.transmission);
		System.out.println("make is- " + this.make + "\t");
		System.out.println("Car has " +this.tyres + " tyres");
		System.out.print("Car has " +this.doors + " doors");
		
	}
	void accelarate() {
		System.out.println("Car is moving forward.");
	}
	void brake() {
		System.out.println("Car has stopped.");
	}
}
