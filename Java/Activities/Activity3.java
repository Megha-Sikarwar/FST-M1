package test.Java;

public class Activity3 {
	public static void main (String [] args) {
		double age = 1000000000;
		double earch, mercury, venus, mars, jupiter, saturn, uranus, neptune;
		
		System.out.println("You are " + String.format("%.2f", age/31557600) + " Earth-years old");
		System.out.println("You are " + String.format("%.2f", age/0.240846) + " mercury-years old");
		System.out.println("You are " + String.format("%.2f", age/0.61519726) + " venus-years old");
		System.out.println("You are " + String.format("%.2f", age/1.8808158) + " mars-years old");
		System.out.println("You are " + String.format("%.2f", age/11.862615) + " jupiter-years old");
		System.out.println("You are " + String.format("%.2f", age/29.447498) + " saturn-years old");
		System.out.println("You are " + String.format("%.2f", age/84.016846) + " uranus-years old");
		System.out.println("You are " + String.format("%.2f", age/164.79132) + " neptune-years old");
		
	}

}
