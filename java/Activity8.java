package activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Activity8 acEight = new Activity8();
			acEight.exceptionTest("Print the exception");
			acEight.exceptionTest(null);
			acEight.exceptionTest("Won't Execute");
		}catch(customException mae) {
			System.out.println("Inside catch block: "+mae.getMessage());
		}finally {
		System.out.println("Finally the class has executed without exception");
		}
	}
	
	public void exceptionTest(String str) throws customException{
		if(str==null) {
			throw new customException("String value is null");
		}else {
			System.out.println(str);
		}
	}
}
