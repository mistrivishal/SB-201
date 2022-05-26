package com.masai;

public class ComandLineArgFactorial {
	public static int findFactorial(int num) {
		int fact = 1;
	    
	    for(int i=1;i<=num;i++){
	        fact = fact*i;
	    }
	    return fact;
	}
	
	public static void main(String[] args) {
		int factorial;
		if(args.length == 1) {
			factorial = ComandLineArgFactorial.findFactorial(Integer.parseInt(args[0]));
//			System.out.println("a");
			System.out.println(factorial);
		}else if(args.length == 2){
			int absDiff = Math.abs(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));

//			System.out.println(absDiff);
			factorial = ComandLineArgFactorial.findFactorial(absDiff);
//			System.out.println("b");
			System.out.println(factorial);
			
		}else {
			System.out.println("Error");
		}
	}
}
