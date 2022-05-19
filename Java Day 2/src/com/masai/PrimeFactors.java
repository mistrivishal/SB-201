package com.masai;

public class PrimeFactors {
	 public static void primeFactors(int n)
	    {
	    	if(n > 100 || n <= 2) {
	    		System.out.println("Invalid number");
	    	}
	    	else {
				int	divisor = 1;
			
				while(divisor<=n){
				    if(n % divisor == 0){
				       System.out.println(divisor);
				    }
				      divisor++;    
				  }
	    	}
	    }
	 
	    public static void main(String[] args)
	    {
	        int n = 120;
	        primeFactors(n);
	    }
}
