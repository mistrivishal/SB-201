package com.masai;

import java.util.Scanner;

public class EvenSum2dArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the row number and column i.e. N,M respectively: ");
		System.out.println("Enter row no. (N): ");
		int N = scan.nextInt();
		System.out.println("Enter column no. (M): ");
		int M = scan.nextInt();
		
		int[][] arr = new int[N][M];
		
		//for assigning the value to the array at specific index;
		int el = 1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j] = el++;
			}
		}
		
		//finding the sum of even number in the each column;
		for(int i=0;i<M;i++) {
			int sum = 0;
			for(int j=0;j<N;j++) {
				if(arr[j][i]%2 == 0) {
					sum+=arr[j][i];
				}
			}
			System.out.println("Sum of even elements present in the col.No."+ (i+1) +": "+ sum);
		}
	}
}
