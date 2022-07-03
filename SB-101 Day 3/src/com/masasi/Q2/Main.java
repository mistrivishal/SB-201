package com.masasi.Q2;

import java.io.*;
import java.io.File;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("Ram");
		s1.setAddress(new Address("MH","Pune","421013"));
		s1.setEmail("Abc@xyz.com");
		s1.setPassword("lol@123");
		
//		Serialization
		
		File f1 = new File("student.txt");
		
		f1.createNewFile();
		
		FileOutputStream fos =  new FileOutputStream("student.txt"); 
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
	
		
		System.out.println("Student oject Serialization success!");
		
//		DeSerialization
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student sd = (Student) ois.readObject();
		
		System.out.println(sd);
		
		
		
		oos.flush();
		fos.close();
		oos.close();
		fis.close();
		ois.close();
	}
}
