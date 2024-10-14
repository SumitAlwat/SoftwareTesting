package coreJavaLearning;

import java.util.Scanner;

public class P005_UserInput {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the integer value for a");
		 int a = scan.nextInt();
		 
		 System.out.println("Enter the integer value for b");
		 int b = scan.nextInt();
		 
		 int c=a+b;
		 System.out.println("Sum of given integer value is " +c);
		 scan.close();

		 System.out.println("Type here : ");
		 String s = scan.next();
		 System.out.println(s);
	}

}
