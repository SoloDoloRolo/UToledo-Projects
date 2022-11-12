//# Name : Solomon Bryant

//# Class: CSET 1200

//# Instructor: Dr. Jared Oluoch

//# Programming Assignment: 8

//# Date: 03/18/21

//# Summary: This program takes your tax file status, your tax income, and gives you your tax amount.

//# You must put this line as a comment at the top of your Java source file. 
//â€œThis code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.â€  

import java.util.Scanner;

public class assignmentEight {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter your full legal name: ");
			
			String legalName = input.nextLine();
			
		System.out.print("Enter your 2020 federal income: ");
		
			int fedIncome = input.nextInt();
			
		System.out.print("Enter your filing status: ");
		
			int fileStatus = input.nextInt();
			
			double fedReturn = 0.0;
			
			String filerType = "";
			
			
			
			switch (fileStatus) {
					
			case 0:
				
				filerType = "single";
				
				if (fedIncome > 0 && fedIncome < 9875) {
					fedReturn = fedIncome * 0.10;
				}
				if (fedIncome >= 9876 && fedIncome < 40125) {
					fedReturn = fedIncome * 0.12; 
				}
				if (fedIncome >= 40126 && fedIncome < 85525) {
					fedReturn = fedIncome * 0.22;
				}
				if (fedIncome >= 85526 && fedIncome < 163300) {
					fedReturn = fedIncome * 0.24;
				}
				if (fedIncome >= 163301 && fedIncome < 207350) {
					fedReturn = fedIncome * 0.32;
				}
				if (fedIncome >= 207351  && fedIncome < 518400) {
					fedReturn = fedIncome * 0.35;
				}
				if (fedIncome >= 207351  && fedIncome < 518400) {
					fedReturn = fedIncome * 0.35;
				}
				if (fedIncome >= 518401) {
					fedReturn = fedIncome * 0.37;
				}
				
				break;
			
			case 2:
				
				filerType = "head of household";
				
				if (fedIncome > 0 && fedIncome < 14100) {
					fedReturn = fedIncome * 0.10;
				}
				if (fedIncome >= 14101 && fedIncome < 53700) {
					fedReturn = fedIncome * 0.12; 
				}
				if (fedIncome >= 53701 && fedIncome < 85500) {
					fedReturn = fedIncome * 0.22;
				}
				if (fedIncome >= 85501 && fedIncome < 163300) {
					fedReturn = fedIncome * 0.24;
				}
				if (fedIncome >= 163301 && fedIncome < 207350) {
					fedReturn = fedIncome * 0.32;
				}
				if (fedIncome >= 207351  && fedIncome < 518400) {
					fedReturn = fedIncome * 0.35;
				}
				if (fedIncome >= 518401) {
					fedReturn = fedIncome * 0.37;
				}
				break;
			
			case 3:
				
				filerType = "married filing jointly or qualifying widow";
				
				if (fedIncome > 0 && fedIncome < 19750) {
					fedReturn = fedIncome * 0.10;
				}
				if (fedIncome >= 19750 && fedIncome < 80250) {
					fedReturn = fedIncome * 0.12; 
				}
				if (fedIncome >= 80251 && fedIncome < 171050) {
					fedReturn = fedIncome * 0.22;
				}
				if (fedIncome >= 171051 && fedIncome < 326600) {
					fedReturn = fedIncome * 0.24;
				}
				if (fedIncome >= 326601 && fedIncome < 414700) {
					fedReturn = fedIncome * 0.32;
				}
				if (fedIncome >= 414701  && fedIncome < 622050) {
					fedReturn = fedIncome * 0.35;
				}
				if (fedIncome >= 622051) {
					fedReturn = fedIncome * 0.37;
				break;
				}
				
			case 4:
				
				filerType = "married filing seperatly";
				
				if (fedIncome > 0 && fedIncome < 9875) {
					fedReturn = fedIncome * 0.10;
				}
				if (fedIncome >= 9876 && fedIncome < 40125) {
					fedReturn = fedIncome * 0.12; 
				}
				if (fedIncome >= 40126 && fedIncome < 85525) {
					fedReturn = fedIncome * 0.22;
				}
				if (fedIncome >= 85526 && fedIncome < 163300) {
					fedReturn = fedIncome * 0.24;
				}
				if (fedIncome >= 163301 && fedIncome < 207350) {
					fedReturn = fedIncome * 0.32;
				}
				if (fedIncome >= 207351  && fedIncome < 311025) {
					fedReturn = fedIncome * 0.35;
				}
				if (fedIncome >= 311026) {
					fedReturn = fedIncome * 0.37;
				break;
				}
			}
			
			
			System.out.print(legalName + ", the federal income tax for an annual salary"
					+ " of " + fedIncome +" for a " + filerType + " filer is " + fedReturn);

}
}