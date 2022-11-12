//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 2

//# Date: 01/31/20

//# Summary: This program gives feedback on health based on the user's response

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
  //Please reach out to him if you have questions about the assignment.
  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  
import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first name: ");
		
		String firstname = input.nextLine();
		
		System.out.println("Enter your last name: ");
		
		String lastname = input.nextLine();
		
		System.out.println("Here is the guideline for great health outcomes:");
		
		System.out.println("Good Nutrition (GN)");
		
		System.out.println("Regular Exercise (EXC)");
		
		System.out.println("Plenty of water (WTR)");
		
		System.out.println("Enough Rest (RST)");
		
		System.out.println("Enter your selection(s): ");
		
		String selections = input.nextLine();
		
		
		
	
		
		switch (selections) {
	
	default:
		
		System.out.println(firstname+""+lastname);
	
		System.out.println("You did not enter a valid choice.");
		
		break;
		
	case "GN, EXC, RST", "RST, EXC, GN":
		
		System.out.println("You have good health outcomes");
		
		break;
	
	case "GN, EXC, WTR, SUN, RST":
	
		System.out.println("You have excellent health outcomes");
	
	case "SUN, RST", "RST, SUN":
		
		System.out.println("You have okay health outcomes");
		
	case "GN","EXC","WTR","SUN","RST":
	
		System.out.print("You will have poor health outcomes");
		
	

		
	
	
	}
		
		//link to youtube video https://www.youtube.com/watch?v=n2HqWZW7jhA
		


	}

}
