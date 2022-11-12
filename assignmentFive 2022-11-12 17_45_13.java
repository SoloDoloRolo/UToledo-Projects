//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 5

//# Date: 02-20-21

//# Summary: This program finds the LCM out of two numbers, 
//I have also taken problem two from assignment four  which is,
//flipping a number backwords and printing it out,
//and called upon it using  the number the user picks.

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
//  Please reach out to him if you have questions about the assignment.
  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€ 

import java.util.Scanner;
public class assignmentFive {

	public static void main(String[] args) {
		
		
				Scanner input = new Scanner (System.in);
				
				System.out.println("Enter the first integer: ");
				
				int first = input.nextInt();
				
				System.out.println("Enter the second integer: ");
			    
				int second = input.nextInt();
				
				System.out.println("The LCM for  " + first + " and " + second + " is " + lcm(first, second));
				

				System.out.print("Enter a number: ");
				
				int orig = input.nextInt();
				
				System.out.print("Your number in reverse is " + reverseInt(orig));
				
				
				
				
				
			}
			
			public static int lcm (int n1, int n2) {
				
				int lcm = 1; 
				
				int p = 1;
				
				while (p <= n1 && p <=n2) {
					if (n1 % p == 0 && n2 % p == 0)
						lcm = p;
					p++;
				}
				int numerator = n1*n2;
				lcm = numerator/lcm;
				
				return lcm ;
			}
			
		
			
			//flipping a number backwords and printing it out

			
			public static int reverseInt (int orig) {
			
		
			int rever = 0;
			do {
				rever =rever * 10;
				rever = rever + orig%10;
				orig = orig/10;
				
				
			}while (orig!=0);
			
			return rever;
			
			}
		
	}


