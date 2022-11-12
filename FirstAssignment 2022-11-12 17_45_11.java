

//Name : Solomon Bryant

//Class: CSET 1200

//Instructor: Dr.Jared Oluoch

//Programming Assignment: 1

//Date: 01/23/20

//Summary: This program lists off facts about me and the syllabus

//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€ 


public class FirstAssignment {

	public static void main(String[] args) {
		
		//problem #1
		System.out.println("Question: 1");
		System.out.println("a) Outcome 2 - An ability to design, implement and evaluate a computing-based solution to meet a given set of computing requirements in the context of the program’s discipline.");
		System.out.println("");
		System.out.println("b)Understand and apply the concept of abstract classes and interfaces.");
		System.out.println("");
		System.out.println("  Understand and apply the concepts of recursion, inheritance and polymorphism in Java.");
		System.out.println("");
		System.out.println("  Understand the concept of arrays, loops, and selection in Java.");
		System.out.println("");
		System.out.println("c) The course is a presentation/lecture course that the student holds responisbility of keeping up with. All course material is on Blackboard or Echo 365.");
		System.out.println("");
		System.out.println("d)Quizzes:15%  Midterm:20% Programming Assignments:20% Final Exam:20% Course Project:25%");
		System.out.println("");
		System.out.println("e)Loops, Methods, and Single-Dimensional Arrays");
		System.out.println("");
		System.out.println("f)Although this is an asynchronous class, students are expected to log in Blackboard at least once every week to access the course material.");
		System.out.println();
		
		
		//problem #4
		System.out.println("Question 4:");
		String name = "Solomon Bryant";
		String RocketNum = "R001488079";		
		int dob = 2001;
		int currentyr = 2021;
		int age = currentyr - dob;
		System.out.println("Hello " + name);
		System.out.println("Your rocket number is " + RocketNum);
		System.out.println("You were born in " + dob);
		System.out.println("You are " + age + " years old as of "  + currentyr);
		
		//problem 5
		//100 cm = 1 meter
		double CM_PER_MTR = 100;
		int kilograms = 100;
		double height = 1.72;
		double newheight = height*height;
		double BMI = newheight%kilograms;
		
		System.out.println("");
		System.out.println("Question 5:");
		System.out.println();
		System.out.println("Solomon Bryant, you are " + height + " meters tall");
		System.out.println();
		System.out.println("You weigh " + kilograms + " kilograms");
		System.out.println();
		System.out.println("Your BMI is " + BMI);
		
		

		
		
		//Jane Doe, you are1.828 meters tall.
		//You weigh 77 kilograms.
		//Your BMI is 23.2 
	}

}
