package com.masai.Q3;

public abstract class ExplainAbstractClass {
	
	
//	Abstract class:-
//	A class which is declared with abstract keyword is known as an abstract class.
//	i.e. Abstract methods don’t have the body, they just have method signature or method with body;
//	It needs to be extended and its method implemented. It cannot be instantiated.
//
//	Rules for abstract class:-
//	An abstract class must be declared with an abstract keyword.
//	It can have abstract and non-abstract methods.
//	It can have constructors and static methods also.
	
	
//	**With abstract class we can achieve the (0 to 100%) Abstraction;
	
//	Example:-
	public static void main(String[] args) {
		AbstractClass e1 = new AbsExtends();
		
		e1.method1(); //here over ride method will be call;
	}
	
	
}

abstract class AbstractClass{
	
	abstract void method1();
	
}

class AbsExtends extends AbstractClass{

	@Override
	void method1() {
		System.out.println("This method is implementation of Abstract class _'AbstractClass'_ by the its child class _'AbsExtends'_");
	}
}