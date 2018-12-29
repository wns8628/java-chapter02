package chapter02;

public class ArrayUtil {
	
	// int 배열을 double 배열로 변환
	static double [] intToDouble( int[] source ) {
		
	 double[] doubletrans = new double[source.length];
	 
	 for(int i =0; i<source.length; i++) {
		 doubletrans[i] = (double)source[i];
	 }
	 
  	 return doubletrans;
	}
	
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source ) {

		 int[] inttrans = new int[source.length];
		 
		 for(int i =0; i<source.length; i++) {
			 inttrans[i] = (int)source[i];
		 }
		 
	  	 return inttrans;
	}
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ) {
		
		int[] sumarray = new int[s1.length+s2.length];
		
		System.arraycopy(s1, 0, sumarray, 0, s1.length);
		System.arraycopy(s2, 0, sumarray, s1.length, s2.length);		
		
		return sumarray;
	}

}
