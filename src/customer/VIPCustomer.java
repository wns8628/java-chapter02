package customer;

import chapter02.Customer;

public class VIPCustomer extends Customer{
	public void showInfo() {
		
		//protected는 같은패키지뿐만아니라 자식에서도 접근이가능
		System.out.println(name);  

		//System.out.println(age);
		System.out.println(getAge());
	}
	
}
