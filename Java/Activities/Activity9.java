package test.Java;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String ags []) {
		List<String> myList = new ArrayList<String>();
		myList.add("Lucy");
		myList.add("Chris");
		myList.add("Palm");
		myList.add("Ape");
		myList.add("James");
		for(String s : myList){
			System.out.println("List after removing 1st name - " + s);
		}
		//-------------------------
		System.out.println("Name at 3rd index is - " + myList.get(2));
		
		//-------------------------
		if(myList.contains("James")){
			System.out.println(myList.get(4) + " Name is availble in List");
		}
		
		//-------------------------
		System.out.println("Size of list is - " + myList.size());
		
		//-------------------------
		myList.remove(0);
		for(String s : myList){
			System.out.println("List after removing 1st name - " + s);
		}
	}
}
