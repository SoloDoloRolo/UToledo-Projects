//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 6

//# Date: 02/22/21

//# Summary: This code asks you to type your monthly miles and your mothly weight and gives you the 
//highest/lowest weight and the average mileage for the year. It also searches for a number through an array and gives you the index. 
//Finally it creates an array of 15 random integers.

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
  //Please reach out to him if you have questions about the assignment.
  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  


import java.util.Scanner;
import java.lang.Math;

public class assignmentSix {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		double [] oneYear = new double [12];
		
		
		for (int a =0; a<oneYear.length; a++) {
		
			System.out.print("Enter the number of miles you've ran this year, one month at a time: ");
			oneYear[a] = input.nextDouble();
		
		}
		
		double sumMile = 0;
		
		for (int b = 0; b < oneYear.length; b++) {
			
			sumMile = sumMile + oneYear[b];
		}
		
		sumMile = sumMile / 12;
		
		System.out.println(sumMile);
		
		double [] yearWeight = new double [12];
		
		for (int c = 0; c < yearWeight.length; c++ ) {
			
			System.out.println("Enter your weight for each month in order, one at a time: ");
			yearWeight[c] = input.nextDouble();
		}
		
		int d = 0;
		
		double lowWeight = 1000000000000.0;
		
		double highWeight = 0.0;
		
		
		
		while (d < yearWeight.length) {
			
			if (yearWeight[d] < lowWeight) {
				
				lowWeight = yearWeight[d];
				
				
			}
			
			
			if (yearWeight[d] > highWeight) {
				
				highWeight = yearWeight[d];
				
			}
			
			d++;
			
			
		}
		
		System.out.println("Your highest weight of the year is: " + highWeight);
		
		System.out.println("Your lowest weight of the year is: " + lowWeight);

		
//////////////////////////////////
		
		System.out.println("Enter a number you would like to search for: ");
		
		int searchNum = input.nextInt();
		
		int [] binaryNum = { 3, 6, 7, 8, 12, 15, 22 ,36, 45, 48, 49, 52, 65, 70, 73, 88, 94};	
		
		boolean exists = false;
		
		int i = 0;
		
			
			for (i = 0; i < binaryNum.length; i++) {
				
				if (binaryNum[i] == searchNum) {
					exists = true;
					break;
				}
			}
			
			
			if (exists) {System.out.println("Your number exists in the array at index "+ i);
			}
			
			else {System.out.println("Sorry, value not found.");
			}
			
			
////////////////////////////////
			
			
			
			double [] moose = new double [15];
			
			for (int v = 0; v < moose.length; v++) {
				
			moose[v] =  ((Math.random() * (99 - 30)) + 30);
				
			}
			
			
			for (int o = 0; o < 15; o++) {
				
				System.out.println(moose[o]);
			}
			
			double high = moose[0];
			
			double low = moose[0];
			
			int count = 0;
		
			while (count < moose.length) {
				
				if (low > moose[count]) {
					
					low = moose[count];
					
				}
				
				if (moose[count] > high) {
					
					high = moose[count];
					
				}
				
				count++;
				
				
			}
			
	

			System.out.print("The lowest number is " + low);
			
			
			
				
			
			
			
	}
	}

			
		
		
			
		
	