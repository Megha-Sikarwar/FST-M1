package test.Java;

public class CustomException extends Exception{
	private String message = null ;
	
	public CustomException() {
	}
	
	public CustomException(String messgae) {
		this.message = messgae;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	public void exceptionTest(String msg) throws CustomException {
		if(msg == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(msg);
        }
	}
}
