package coreJavaLearning;

import java.util.Scanner;

public class P006_ConditionalStatements {

	public static void main(String[] args) {
		Scanner CondOperator = new Scanner(System.in);
		
		System.out.println("enter the value of a");
		int a = CondOperator.nextInt();
		System.out.println("enter the value of b");
		int b = CondOperator.nextInt();
		
//		1. Simple if :
		
		if(a>b){
		System.out.println("a is greater than b");
		}
		
//		2. if else :
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
//		3. nested if :
		
		System.out.println("enter your age :");
		int age = CondOperator.nextInt();
		
		if (age>18) {
			if (age<60) {
				System.out.println("You are eligible for the job");
			}
			else {
				System.out.println("You are not eligible for the job");
			}
		}
		else {
			System.out.println("You are not eligible for the job");
		}
		
//		4. nested if :
		
		System.out.println("Enter the marks of subject from 0 to 100");
		int M = CondOperator.nextInt();
		
		if (M<35) {
			System.out.println("fail");
		}
		else if (M>=35 && M<=60) {
			System.out.println("E grade");
		}
		else if (M>=61 && M<=70) {
			System.out.println("D grade");
		}
		else if (M>=71 && M<=80) {
			System.out.println("C grade");
		}
		else if (M>=81 && M<=90) {
			System.out.println("B grade");
		}
		else if (M>=91 && M<=100) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Invalid input");
		}
		
//		5. Switch :
		
		System.out.println("1.english\n2.hindi\n3.gujarati");
		int c = CondOperator.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected guj");
			break;
		default:
			System.out.println("invalid input");
		}

		CondOperator.close();
	}
}
