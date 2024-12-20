package test.Java;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	public static void main(String args[]) {
		Set <Integer> hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		System.out.println("Current HasSet is - " + hs);
		
		//-----------------
		System.out.println("Size of HasSet is - " + hs.size());
		
		//-----------------
		System.out.println("Remove 1st element from set - " + hs.remove(1));
		
		//-----------------
		if (hs.remove(10)) {
			System.out.println("Element is present in set and deleted successfully");
		} else {
			System.out.println("Element is not present in set");
		}
		
		//-----------------
		if (hs.contains(5)) {
			System.out.println("Element is present in set!!");
		} else {
			System.out.println("Element is not present in set!!");
		}
		
		//-----------------
		System.out.println("Updated HasSet is - " + hs);
	}

}
