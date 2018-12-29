package customer;

import chapter02.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		
		//protected는 다른패키지접근x
//		c.name = "둘리";
		
		//private는 외부접근x 
		//c.age=10;
		
		c.setAge(10);
	}

}
