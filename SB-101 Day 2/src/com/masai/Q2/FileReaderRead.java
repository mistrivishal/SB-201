package com.masai.Q2;

import java.io.*;

public class FileReaderRead {

	public static void main(String[] args) {
		
		
		File f1 = new File("abc.txt");
		
		try {
		
			FileReader fr1 = new FileReader(f1);
			
			int code = fr1.read();
			
			while(code != -1) {
				System.out.print((char)code);
				code = fr1.read();;

			}
			
			
			fr1.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
