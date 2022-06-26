package com.masai.Q3;

import java.io.*;
import java.util.Scanner;

public class CountCharecters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		String fileName = sc.next();
		
		File f1 = new File(fileName);
		
		try {
			
			BufferedReader b1 = new BufferedReader(new FileReader(f1));
			
			int code = b1.read();
			
			System.out.println("Enter the character to be counted");
			char search = sc.next().charAt(0);
		
			int found = 0;
			
			while(code != -1) {
				char s = (char)code;
				if(search == s) {
					found++;
				}
					
				code = b1.read();;

			}
			
			System.out.println(found + " results are found for character " + search);
			
			
			b1.close();
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("File dose not exists ");

		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
