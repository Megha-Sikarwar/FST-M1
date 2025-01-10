package test.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//---- Activity 13-----
public class Activity13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Integer> arrayList = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("Enter only Inte value in below list");
		while(scanner.hasNextInt()) {
			arrayList.add(scanner.nextInt());
		}
		for(int i : arrayList) {
			System.out.println("Value in list are : " + i);
		}
		
		Integer val[] = arrayList.toArray(new Integer [0]);
		int index = indexGen.nextInt(val.length);
		System.out.println("Random Index generated :" + index);
		System.out.println("Value at that Random Index :" + val[index]);
	}

}
