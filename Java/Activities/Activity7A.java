package test.Java;

public class Activity7A implements BicycleOperations , BicycleParts{
	@Override
	public int applyBrake(int decrement) {
		return decrement = decrement-5;
	}

	@Override
	public int  speedUp(int increment) {
		return increment = increment+10;
	}
	
}
