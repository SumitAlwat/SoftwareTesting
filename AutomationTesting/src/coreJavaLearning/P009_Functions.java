package coreJavaLearning;


//without return type without parameter
//without return type with parameter
//with return type without parameter
//with return type with parameter

import java.util.Scanner;

	class ABC {
		public void call() {
			System.out.println("call without return type without parameter");
		}

		public void run(char i, int j) {
			System.out.println("run with para i = : " + i + " j = " + j);
		}

		public int show() {
			return 123;
		}

		public int sqaure(int num) {
			System.out.println("num get from main function is : " + num);
			return num * num;
		}

	}

	public class P009_Functions {
		public static void main(String[] args) {
			ABC a = new ABC();
			a.call();
			a.run('a', 12);
			int i = a.show();
			System.out.println(i);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter num : ");
			int num = sc.nextInt();
			int res = a.sqaure(num);
			System.out.println("squeare of " + num + " is : " + res);
			sc.close();
		}
}

