package com.masai.Q1;

import java.io.*;

public class BufferReaderRead {

	public static void main(String[] args) {
		
		
		File f1 = new File("xyz.txt");
		
		try {
			f1.createNewFile();
		
			System.out.println(f1.exists());
			
			FileReader fr1 = new FileReader(f1);
			
			BufferedReader b1 = new BufferedReader(fr1);
			
			String line = b1.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = b1.readLine();

			}
			
			
			fr1.close();
			b1.close();
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
