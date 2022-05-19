package com.masai;

public class StaticNonStatic {
	//Static variables are those variables which are store in RAM / context area by time time of execution;
	//we can directly access by the class name and doesn’t need any object to be created;
	//Non-Static variables those variables store in HardDisk/Heap area while the initialization process;
	//we can not directly access non static variables, It requires object to be created;
	
	
	int nonStaic;
	
	static int iamStatic;
	
	public static void main(String[] args) {
		
//		we can access static variables directly by class name or by object or direct;
		
		StaticNonStatic.iamStatic = 50;
		
		System.out.println(iamStatic);
		
//		we have have to create object for the NonStatic variables;
		
		StaticNonStatic x1 = new StaticNonStatic();
		
		x1.nonStaic = 20;
		
		System.out.println(x1.nonStaic);
		
		
	}
}
