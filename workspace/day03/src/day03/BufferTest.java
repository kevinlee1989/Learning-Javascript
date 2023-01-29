package day03;

import java.util.Scanner;

public class BufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name1;
		String name2;
		
		System.out.println("나이 : ");
		name1 = sc.nextLine();
		System.out.println("너이 : ");
		name2 = sc.nextLine();
		
		System.out.printf("나 : %s , 너 : %s ", name1 , name2);
	}

}
