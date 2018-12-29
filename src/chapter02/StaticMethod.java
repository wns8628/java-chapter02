package chapter02;

public class StaticMethod {
	private int n;  //인스턴스변수
	private static int m; //클래스 변수 
	
	//변수 접근 
	public void f1() {
		n = 10;
		//원칙적으로는 클래스이름(네임스페이스)로접근해야한다
		StaticMethod.m = 20; //이렇게  하지만 같은클래스인결우 생략가능 
		m =20;
	}
	
	//스새틱에서 접근
	public static void f2() {
//		n = 10; //말이안됨  왜? 객체가 언제생성될줄알고? 먼저 스태틱이올라가잔아
			    //그리고 이 n이 몇개인줄알고 ㅋㅋ
	}
	
	//메서드접근
	public void f3(){
		f1(); //당연되지 
		StaticMethod.f2(); //됨 객체니깐
	}
	
	public static void f4() {
//		f1(); //스태틱아니니깐 접근안되지
		f2(); //스태틱이니깐 같이먼저올라가서 접근되지
	}
	
	public static void main(String[] args) {
		f2();//스태틱바로접근됨
		f4();//바로접근됨 
	}
}
