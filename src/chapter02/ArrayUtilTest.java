package chapter02;

//핵심 : 유틸성메소드임 즉 객체만들필요없이 함수만 불러서 쭉쭉결과뽑아내는거임
public class ArrayUtilTest {
	public static void main(String[] args) {
		
		int[] a1 = {10,11,12,13};
		double[] d1 = ArrayUtil.intToDouble(a1);
		
		for(double d:d1) {
			System.out.print(d + " ");	
		}
		
		double[] d2 = {10.1 , 11.1 , 12.2 , 13.2};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		for(int a: a2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		int[] a3 = ArrayUtil.concat(a1, a2);
		for(int a:a3) {
			System.out.print(a + " ");
		}
		
	}
}
