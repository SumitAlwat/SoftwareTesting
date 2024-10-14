package coreJavaLearning;


public class P007_Loops {

	public static void main(String[] args) {
		
//		1. For loop :
		
		for(int a = 1 ;a <= 10 ;a++) {
			System.out.println("a = " +a);
		}
		
//		2.while loop :
		
		int b=1;
		while(b <= 20) {
			System.out.println("b = " +b);
			b++;
		}
			
//		3.do while loop :
			
		int j = 100;
		do {
			System.out.println("j = " +j);
			j--;
		}
		while(j>0);
		
		
	}
}
