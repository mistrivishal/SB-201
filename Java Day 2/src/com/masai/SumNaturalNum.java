package com.masai;

public class SumNaturalNum {
	public static void sumOfNaturalNum(int n)
    {	
    	int sum = 0;
    	for(int i=1;i<=n;i++) {
    		sum += i;
    	}
    	System.out.println(sum);
    }
 
    public static void main(String[] args)
    {
        int n = 20;
        sumOfNaturalNum(n);
    }
}
