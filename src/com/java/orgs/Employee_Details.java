package com.java.orgs;

import java.util.Scanner;

public class Employee_Details {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	System.out.println("employee name is");
	String name = in.nextLine();
	System.out.println("employee age is");
	int age = in.nextInt();
	System.out.println("percentage is");
	float percentage=in.nextFloat();
	System.out.println("arrears cleared or not" );
	boolean arrears=in.nextBoolean();
	System.out.println("employee name is"+ name);
	System.out.println("employee age is"+age);
	System.out.println("percentage is"+percentage);
	System.out.println("arrrears cleared or not"+arrears);
    
}
}