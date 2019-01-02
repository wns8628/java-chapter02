package chapter02;

public class Student extends Person {
	public Student() {
//		super(); 이게 실행됨 즉 먼저 부모생성자호출함 기본적으로 
		System.out.println("Student() called");
	}
}
