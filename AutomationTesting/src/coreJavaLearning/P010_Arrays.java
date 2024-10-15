package coreJavaLearning;

import java.util.Scanner;

public class P010_Arrays {

	public static void main(String[] args) {
 	   int i[] = {0,1,2,3,4,5,6,7,8,9};
	   System.out.println(i[0]);
	   System.out.println(i[1]);
	   System.out.println(i[2]);
	   System.out.println(i[3]);
	   System.out.println(i[4]);
	   
	   for(int index=0;index<i.length;index++) {
			System.out.println(i[index]);
	}
			
			int sum=0;
			for(int index=0;index<i.length;index++) {
				sum = sum+i[index];
			}
			System.out.println("sum of array ele : "+sum);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size of array : ");
			int size = sc.nextInt();
			int a[] = new int[size];
			for(int index=0;index<a.length;index++) {
				System.out.print("enter number at a["+index+"] : ");
				a[index] = sc.nextInt();
			}			
			sc.close();
			for(int index=0;index<a.length;index++) {
				System.out.println(a[index]);
		}
}

}
