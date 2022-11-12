//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 3

//# Date: 02/07/2021

//# Summary: this program stores and presents your rocket number / 
//username while testing your string to see if it creates a new word. 
//This program also gives you a random turn down rate of asking someone out.

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
 // Please reach out to him if you have questions about the assignment.
  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  






import java.util.Scanner;

public class Semordnilap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First and Last Name: ");
		String username = input.nextLine();
		System.out.println("Enter your Rocket ID: ");
		String rocketnum = input.nextLine();
		System.out.println(username + " " + rocketnum);
		System.out.print("Enter a string: ");
		String original = input.nextLine();
		
		if(Semordnilaptest(original)) {
		System.out.println(original + " is not a Semordnilap");
		}
		
		else {
			System.out.println(original + " is a Semordnilap");
		}		
		
		System.out.println("Enter the number of times you ask to go to dinner: ");
		
		int tries = input.nextInt();
		
		double rand = Math.random()*tries;
		
		double percentage = tries/rand;
		
		System.out.println("Hello " + username +  " Faint hearts don't win, buddy, your turning down rate is " + percentage +"%");
		
		
		
	 
		
		
		
		
}
	
	
		public static boolean Semordnilaptest(String original) {
		
		int lastchar = original.length() - 1;
		
		int frstchar = 0;
		
		while (frstchar<lastchar){
			if (original.charAt(frstchar) != original.charAt(lastchar)) {
				return false;
			}
			
			frstchar ++;
			lastchar --;
		}
		
		return true;
	
		}
}

