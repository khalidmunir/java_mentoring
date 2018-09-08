package java_tutorial;


import java.util.Scanner;
import java.util.*; 

public class Animal {

	// Notes: 
	// public <- obvious
	// static <- shared by all objects 
	// final <- is a constant, cannot be changed
	// double <- the type of object (decimal number here)
	public static final double FAVNUMBER = 1.6180;
	
	// Notes :
	// private <- only members of this class
	// String <- the type of object (String here)
	private String name;
	// int <- integer 
	private int weight;
	// boolean <- true/false
	private boolean hasOwner = false;
	// byte <-
	private byte age;
	// long <- very long number -2^63 to 2^63
	private long uniqueID;
	// char <- single char (unsigned int representing UTF-16)
	private char favoriteChar;
	// double <- number 
	private double speed;
	// float <- number - 64bit with decimal place
	private float height;
	
	// protected - only accessible by other code in this package
	// static <- share with all object
	protected static int unmberOfAnimals = 0;
	
	// Scanner <- accept user input
	static Scanner userInput = new Scanner(System.in)

	public Animal() {
		super();
	}
	
			
	
	
}
