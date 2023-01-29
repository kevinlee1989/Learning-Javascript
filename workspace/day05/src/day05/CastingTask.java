package day05;

import java.util.Scanner;

public class CastingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 국어점수와 영어점수를 문자열로 입력받고, 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 국어 :: ");
		int kor = Integer.parseInt(sc.next());
		System.out.println(" 영어 :: ");
		int eng = Integer.parseInt(sc.next());
		
		double average = (kor + eng) / 2.0;
		System.out.println(average);
		System.out.println("평균 : " + (kor + eng) / 2);
		
		
		
		
		
		
		
		
		
		
		char target = 'A';
		target = (char)((int)target + 32); // 65 + 32;
		// target 에는 항상 대문자만 들어있다
		// 이때 target에 들어있는 대문자를 소문자로 바꾸어 출력하시오
		// hint) 아스키코드와 형변환
		System.out.println(target);
		
	}
}
