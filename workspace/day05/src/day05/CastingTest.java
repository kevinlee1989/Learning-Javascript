package day05;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String은 클래스이기때문에 기본자료형끼리 변환하듯이 변환할수없다.
//		parseInt() : Integer클래스에 만들어져있다.
		System.out.println(Integer.parseInt("20"));
		int i = Integer.parseInt("20");
		System.out.println(i);
		
//		int > String
//		toString()
		String s = Integer.toString(20);
		System.out.println(s);
		
		//String > double
		// parseDouble() : Double 클래스에 만들어져있다
		double b = Double.parseDouble("3.14");
		System.out.println(b);
		
		// double > String
		// toString() : Double 클래스에 만들어져있다
		s = Double.toString(3.14);
		System.out.println(s);
		
		// auto 지원
	}

}
