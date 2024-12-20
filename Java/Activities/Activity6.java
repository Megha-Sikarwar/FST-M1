package test.Java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) {
		Plane plane = new Plane();
		List <String> passengerName = new ArrayList<String>();
		Date LastTimeLanded = new Date();
		Date LastTimeTookOf = new Date();
		passengerName.add("Megha");
		passengerName.add("Lucy");
		passengerName.add("Well");
		passengerName.add("Chris");
		passengerName.add("vishnu");
		
		
		plane.setMaxPassengers(5);
		//Need to ask
		plane.setLastTimeLanded(LastTimeLanded);
		plane.setLastTimeTookOf(LastTimeTookOf);
		plane.setPassengers(passengerName);
		
		System.out.println("Number of Passenger ---- " + plane.getMaxPassengers());
		System.out.println("Plane landed at ---- " + plane.getLastTimeLanded());
		System.out.println("Plane took off at ---- " + plane.getLastTimeTookOf());
		System.out.println("Name of Passenger ---- " + plane.getPassengers());
		
	}

}
