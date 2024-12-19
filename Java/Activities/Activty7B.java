package test.Java;

public class Activty7B {

	public static void main(String[] args) {
		Activity7A obj = new Activity7A();
		obj.applyBrake(100);
		obj.speedUp(200);
		System.out.println("Bicycle has gear---" + BicycleParts.gears);
		System.out.println("Bicycle has speed---" + BicycleParts.speed);
		System.out.println("Slow down Speed by---" + obj.applyBrake(100));
		System.out.println("Increase speed by ---" + obj.speedUp(200));
	}

}
