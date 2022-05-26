package com.masai;

import java.util.Arrays;

public class PrimeNumArray {
	public boolean isPrime(int num) {
	    int c = 0;
	    for(int i=2; i<num; i++){
	        if(num%i == 0){
	            c++;
	        }
	    }
	    if(c!=0){
	      return false; 
	    }
	    else{
	        return true;
	    }
	}
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int n = 0;
		int[] prime = new int[(n+1)];
		for(int i=0;i<inputArray.length;i++) {
			if(isPrime(inputArray[i])) {
				prime[n] = inputArray[i];
				n++;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {
		PrimeNumArray prime = new PrimeNumArray();
		
		int[] arr = {10,12,5,50,11,14,15};
		
		int[] primeArr = prime.findAndReturnPrimeNumbers(arr);
		
		if(primeArr.length!=0) {
			System.out.println("Prime numbers in input array: " + Arrays.toString(primeArr));
		}else {
			System.out.println("Prime number not found in the supplied Array");
		}
	}
}
