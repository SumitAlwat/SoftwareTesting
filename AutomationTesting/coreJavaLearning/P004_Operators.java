package coreJavaLearning;

//1.assignment => =,+=,-=,*=,/=
//2.arithmetic => +,-,*,/,%
//3.logical => &&(and),||(or),!(not)
//4.conditional => >,<,>=,<=,!=
//5.unary => ++,--

public class P004_Operators {
	public static void main(String[] args) {

		
//		Arithmetic Operators;
		int a = 5;
		int b = 10;
		int c = a+b;
		System.out.println("The addition of the given no. are " +c);
		
		int d = a-b;
		System.out.println("The substraction of the given no. are " +d);
		
		int e = a*b;
		System.out.println("The multiplication of the given no. are " +e);
		
		float f = (float)a/b;
		System.out.println("The divison of the given no. are " +f);
		

//      Assignment
		a += b; // a = a+b
		System.out.println(a);// 25
		a -= 12; // a = a-12
		System.out.println(a);
		a *= 3; // a = a*3
		System.out.println(a);
		a /= 3;// a = a/3
		System.out.println(a);

		
//      conditional
		int i = 9;
		int j = 10;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i != j);
		
		
//      unary
		int q = 13;
		q++; // q = q+1
		System.out.println(q);//14
		q--;
		System.out.println(q);//13
		int z = q++;
		System.out.println(z);
		System.out.println(q);		
	
	}

}
