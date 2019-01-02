package exception;
//import java.io.IOException;

public class MyClass {

	public void dangerMethod() throws MyException {
		System.out.println("normal state1");
		
		boolean isDanger = true;
		
		if(isDanger){
			//예외 상황 발생시
			throw new MyException("예외발생"); 
		}
		
		System.out.println("normal state2");
	}
}
