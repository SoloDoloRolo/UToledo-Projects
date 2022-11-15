/*	

# Name : Solomon Bryant

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 10

# Date: 04/01/2021

# Summary: A brief description of what the program does

 Submit the java file. Cheating will result in a grade of 0.  

/* 	Problem 1 (5 Points)
	Write a Java program that meets the following requirements:
		a) Prompts the user to enter two random numbers between 8 and 21.
		   Name the first and second random numbers generated your middle name_number1
		   and toledo_number2 respectively. For example travis_number1 and toledo_number2.
		b) Divide the the second random number generated with the first random 
		   number generated.
		c) Make sure that if the first number generated is 0, the program throws
		   an Arithmetic exception that reads "you cannot divide by zero."
		c) Use a try catch block and print out "no, we don't divide by zero."
		d) Print out the result.
		
	Problem 2 (5 Points)
	Write a Java program that reads from a text file and prints out the output.
	The text file should be named your middle name.txt for example travis.txt.
	The text file should contain the following information:
	Class, Time, Day, Location, Type
	
	So you could have something like: 
	ENGL2950, 6:55 pm, Monday, Lecture
	CSET1200, 4:00 pm, Thursday, Lab
	
	Make sure you have at least 6 rows and you must have commas separating 
	each column.

	Read from the text file and print out all contents.
	
	Problem 3 (5 Points)
	Create a short YouTube video (15 minutes maximum) or Powerpoint slides 
	with your voice over that explains clearly your approach to solving
	problems 1 and 2. The video should walk us through what each line of code
	does. In the video or PowerPoint, begin by stating your name.
	
	You may put the link to the YouTube video in the comments at the top
	of your code. You may also, if you prefer, attach the PowerPoint slides
	and your code in a zipped file.
	
	YouTube Link: https://www.youtube.com/watch?v=oNvbPBhq5UU
	
	
   (15 Points.)
*/


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AssignmentTen {
	public static void main(String[] args) {		
		Scanner input  = new Scanner(System.in);	
		System.out.print("Enter the first number between 8 and 21: ");	
		int isaiah_number1 = input.nextInt();	
		System.out.print("Enter the second number between 8 and 21: ");	
		int toledo_number2 = input.nextInt();	
		int result = 0;	
		try 
		{
			result = toledo_number2/isaiah_number1;
		}	
		catch (Exception e) 
		{	
			System.out.println("You cannot divide by zero.");	
		}
		
		System.out.println("Your result is " + result);
		try
		{	
			File inputFile = new File("/Users/solocup/Desktop/Isaiah.txt");
			Scanner file = new Scanner(inputFile);
		while (file.hasNextLine()) 
		{	
			System.out.println(file.nextLine());	
		}
			
		}
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("Message: " + fnfe.getMessage());
			System.out.println("\ntoString(): " + fnfe + "\n");
			fnfe.printStackTrace();
		}
		
		
	}

}
