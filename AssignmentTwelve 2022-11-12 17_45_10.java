/*	Programming Assignment 12. CSET 1200. 
*	University of Toledo.
*	Instructor: Jared Oluoch, Ph.D.
*	Due Date:  Sunday April 18, 2021 11:59 PM.
*	Total Points:15
*/

/*	Your program must compile and run to get credit. 
	If your program does not compile, you may get 0. 
	
	If you copy from a website, you get 0.

*	Your program must have the following information at the top. 

# Name : Solomon Bryant

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 12

# Date: 04/18/21

# Summary: This code finds the amount of lowercase letters in a string and 
the smallest integer in an array using the recursion method

 Submit the java file. Cheating will result in a grade of 0.  
 Watch the video lecture titled "Recursion"
 in Blackboard/echo360/Echo360 to help you with this assignment.
/* 	Problem 1
	Using recursion, write a Java program that prompts the user
	to enter ten integers and displays the lowest integer.
	(5 points)
	

	2. Write a recursive method that prompts the user to enter 
	a string, and the method displays  the number of lowercase letters
	in the string. (5 points) 
	
	3. Submit a YouTube video that you design on your own, that 
	explains a) your understanding of recursion, and b) your explanation
	of solutions to problems 1 and 2 above. (5 points)
	
	Provide the YouTube link as a comment in your code
	for problem 2.
	
   (Total: 15 Points.)
*/
import java.util.Scanner;
public class AssignmentTwelve {
	
	public static int lowercaseNum (int r, String theStr) {
		
		if (r ==1) {
			return r;
		}
		
		else {
		
			for (int k = 0; k < theStr.length(); k++) {
			if (Character.isLowerCase(theStr.charAt(k))) {
				r++;
			}
			
		}
		}
		return r;
		}
	
	public static int findlowInt (int theNums[], int n) {
		if (n == 1) 
		{
			return theNums[0];
		}
		else 
		{	
		return Math.min(theNums[n-1], findlowInt(theNums, n-1));
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int [] theNums = new int [10];
		
		int i = 0;
		
		while(i < 10) {
			System.out.print("Enter your number one value at a time: ");
			theNums[i] = input.nextInt();
			i++;
		}
		
		int n = theNums.length;	
		
		System.out.println(findlowInt(theNums, n));
		
		System.out.print("Enter a string: ");
		
		String theStr = input.nextLine();
		
		int k = theStr.length();
		
		System.out.print(lowercaseNum(k , theStr));

	}
	

	}



