package test.Java;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String [] args) {
		Map<Integer, String> colour = new HashMap<Integer, String>();
		colour.put(1, "black");
		colour.put(2, "White");
		colour.put(3, "Green");
		colour.put(4, "Red");
		colour.put(5, "Blue");
		
		//-----------------
		System.out.println("Original Map - " + colour);
		
		//-----------------
		System.out.println("Size of map is - " + colour.size());

		//-----------------
		System.out.println("Colour removed from Map is - " + colour.remove(4));
		
		//-----------------
		if(colour.containsValue("Green")) {
			System.out.println("Colour is available in Map");
		}else {
			System.out.println("Colour is not available in Map");
		}

		//-----------------
		System.out.println("Map after deletion - " + colour);

		
	}
}
