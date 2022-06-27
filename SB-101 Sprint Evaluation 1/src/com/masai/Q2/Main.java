package com.masai.Q2;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Employee e1 = new Employee();
		
		e1.setEmpId(101);
		e1.setEmpName("Ramesh");
		e1.setAddress(new Address("Delhi","Delhi","1011010"));
		e1.setEmail("ramesh@xyz.com");
		e1.setPassword("ramesh@123");
		
		//Serializing the Employee object inside a file called "emp.txt" in the current location.
		
		FileOutputStream fos = new FileOutputStream("emp.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
	
		
		System.out.println("Serialized Successfully..");
		
		//DeSerializing the Employee object from the "emp.txt" file.
		
		FileInputStream fis = new FileInputStream("emp.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee de1 = (Employee)ois.readObject();
		
		
		System.out.println(de1);
		
		System.out.println("\nDeSerialized Successfully..");
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		
		
	}
}
