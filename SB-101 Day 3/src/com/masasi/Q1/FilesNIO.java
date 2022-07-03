package com.masasi.Q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesNIO {
	
	public static void main(String[] args) throws IOException {
			
		
		String fileName = "abc.txt";
		
		Stream<String> stream = Files.lines(Paths.get(fileName));
		
		stream.forEach(s -> System.out.println(s));
	}
}
