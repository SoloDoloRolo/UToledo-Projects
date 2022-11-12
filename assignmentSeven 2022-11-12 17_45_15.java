//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 7

//# Date: 03/14/21

//# Summary:This program takes the number of employees that you 
//# have and their total wages of the week and display it.

//# The TA for this class is Bibek Poudel (bibek.poudel@rockets.utoledo.edu).
//  Please reach out to him if you have questions about the assignment.
		  
//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  



import java.util.Scanner;
		
public class assignmentSeven {

	public static void main(String[] args) {
			
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
	
		int employeeQuantity = input.nextInt();
		
		int p = 0;
		
		int y = 0;
		
		int t = 0;
		
		String [] names = new String [employeeQuantity];

		double [] employeeWages = new double [employeeQuantity];

		for (p = 0; p < employeeQuantity; p++) {
			
			System.out.println("Enter the names of your employees: ");
				
				names[p] = input.next();
	
					
				}
		
		
		
		while (y < employeeQuantity) {
			
			System.out.print("Enter the employees Mon-Fri wages in order: ");
				employeeWages[y] = input.nextDouble();
				
				y++;
				
				}
		
		while (t < employeeQuantity) {
			
			System.out.println(names[t]);
			System.out.println(employeeWages[t]);
			
				t++;
			
				}
		

		
	}

}

// Link to video:  https://www.youtube.com/watch?v=eYViNuBQ8pU
