package test.Java;

public class Activity12 {

	public static void main(String[] args) {
		Addable ad1 = (a, b) -> (a + b);
		Addable ad2 = (int a , int b) -> {
			return (a + b);
		};
		System.out.println("Lambda with body :" + ad2.add(5, 10));
		System.out.println("Lambda without body :" + ad1.add(5, 8));
	}

}