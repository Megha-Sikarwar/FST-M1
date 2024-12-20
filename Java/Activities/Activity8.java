package test.Java;

public class Activity8 {
	

	public static void main(String[] args) {
		CustomException act = new CustomException();
		try {
			act.exceptionTest("Mehtod is getting called with correct input");
			act.exceptionTest(null);
		}catch(CustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
