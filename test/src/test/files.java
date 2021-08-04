package test;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class files {
	
	private Formatter x;
	private Scanner input;
	
	public void createFile() {
		
		try{
			x = new Formatter("alton.txt");
		}catch(Exception e) {
			System.out.println("error creating file");
		}
	}
	
	public void addRecord() {
		x.format("%s%s%s", "20"," alton"," nyamz");
	}
	
	public void closeFile() {
		x.close();
	}
	
	public void openFile() {
		try {
			input = new Scanner(new File("china.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
	public void readFile() {
		while(input.hasNext()) {
			String a = input.next();
			String b = input.next();
			String c = input.next();
			
			System.out.printf("%s %s %s\n", a,b,c);
		}
	}
	
	public void closeFiles() {
		input.close();
	}
}
