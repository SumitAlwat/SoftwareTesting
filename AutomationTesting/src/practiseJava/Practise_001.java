package practiseJava;

import java.util.Scanner;

public class Practise_001 {
	public static void main(String[] args) {
	
		Scanner marks = new Scanner(System.in);
		
		System.out.println("Enter the marks of sub1 b/w 0 to 100");
		int sub1 = marks.nextInt();
		
		System.out.println("Enter the marks of sub2 b/w 0 to 100");
		int sub2 = marks.nextInt();
		
		System.out.println("Enter the marks of sub3 b/w 0 to 100");
		int sub3 = marks.nextInt();
		
		System.out.println("Enter the marks of sub4 b/w 0 to 100");
		int sub4 = marks.nextInt();
		
		System.out.println("Enter the marks of sub5 b/w 0 to 100");
		int sub5 = marks.nextInt();
		
		float Per = (float) (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("The percentage is " +Per+"%");
		
		marks.close();
	}
}
