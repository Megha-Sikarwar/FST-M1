package test.Java;

public class Activity2 {
	public static void main(String [] args) {
		int[] array = {10,77,10,54,-11,10};
		int total = 0;
		for(int i=0;i <6;i++) {
			if(array[i]==10) {
				total = array[i] + total;
			}
		}
			System.out.println("Total = " + total);
	
	}

}
