package test.Java;

public class Activity4 {
	public static void main(String [] args) {
		int [] insertSort = {4,3,2,10,12,1,5,6};
		for(int i=1; i<insertSort.length; i++) {
			int temp=insertSort[i];
			int j=i-1;
				while( j >=0 && insertSort [j] > temp ) {
					insertSort[j+1]=insertSort[j];
					j--;
				}	
				insertSort[j+1] = temp;
		}
		System.out.println("Result after insertion sort....");
		for (int k=0; k<insertSort.length;k++) {
			 System.out.print("[" + insertSort[k] + "]");
		}
	}
}
