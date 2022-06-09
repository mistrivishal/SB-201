package com.masai.Q3;

public class FinalKeyWord {
	
//	The final keyword is used to finalize the variable, method, class
//	by which they become as constant that are never be changed  for fixing the context
	
//	Example:-
	
//	1.Variable:-
	final int x = 10;
//	2. Method:-
	final void method1() {
		System.out.println("This final mehtod can't be changed");
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyWord f1 = new FinalKeyWord();
		
//		f1.x = 40;// it will give compile time error
		System.out.println(f1.x);
		
	}
}

class m1 extends FinalKeyWord{
//	@Override
//	final void method1() {// we can not override and changed the method1
//		System.out.println("This final method can't be changed");
		
//	}
}
