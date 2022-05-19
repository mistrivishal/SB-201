package com.masai;

public class Demo {
// 	public static void main(String[] args) {
// 		System.out.println("Welcome to JAVA");
// 	}
	public Demo<Demo<String>> solveNQueens(int n) {
		Demo<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
	   
		helper(board, allBoards, 0);
		System.out.println(allBoards); 
	}
 
}
