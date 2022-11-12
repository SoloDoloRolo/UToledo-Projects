//
//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 4

//# Date: 01/11/21

//# Summary: This program has three seperate tasks, it takes a given number and 
//gives you the summary of all the odd numbers, 
//it takes a given number and reverses it and prints it out, 
//and lastly uses a nested for loop to make a star square.

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
 // Please reach out to him if you have questions about the assignment.
  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  

import java.util.Scanner;
public class assignmentFour {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter a number greater than or equal to 3: ");
		
		int highnum  = input.nextInt();
	
		while (highnum < 3) {
		System.out.println("Error, your value is less than three, please enter a value greater than 3: ");
		highnum  = input.nextInt();
		}
		 
		int place = 0;
		int totalsum = 0;
		int i = 0;
		
		while(i != highnum) {
			
				int check = i%2;
			
			if (check!=0) {
				
				totalsum = i+totalsum;
				
				i++;
				
			}
			
			else {
			i++;
			}
			
		}
			
		System.out.println(totalsum);
		
		/////////////////////////////////////////////////////
		
		
		System.out.print("Enter a number: ");
		
		int orig = input.nextInt();
	
		int rever = 0;
		do {
			rever =rever * 10;
			rever = rever + orig%10;
			orig = orig/10;
			
			
		}while (orig!=0);
		
		System.out.println(rever);
		System.out.println("");
	/////////////////////////////////////////////////////////////

		
	
		System.out.println("YOU'RE A SQUARE");
		
		for (int plop = 2; plop < 5; plop++)
		{
		    
			for (int clop = 2; clop <= 6; clop++)
		    
			{
		        
				System.out.print("#");
		   }
		    
			System.out.println();
		}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
			
		}
		
	
	
	

	


