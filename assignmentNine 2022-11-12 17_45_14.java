
/*
# Name : Solomon Bryant

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 9

# Date: 03/26/21

# Summary: This program has the ability to create a checking account 
that has a monthly fee over 30 days and a savings account that deposits 
the interests and grows at the applyInterestRate(); method

 Submit the java file. Cheating will result in a grade of 0.  

*/

/* 	Problem 1
	Write a Java program that accomplishes the following.
	1. A superclass Bank Account that has the following: balance (attribute), and the following methods:getBalance(),
	deposit(), withdraw().

	2. A checking account that inherits from the Bank Account. In addition, the checking account
	has monthly fees. Feel free to determine the monthly fee. The checking account also has
	the following methods: *applyMonthlyfee() and  getMonthlyfee(). 
	
	3. A savings account that inherits from the Bank Account. In addition, the savings account
	has an interest rate (feel free to define the rate) and the following methods: applyInterestRate(), SavingsAccount(), 
	and getInterestRate().
	
	Based on the above, write a simple Java program that shows the relationships of the above classes
	and returns the savings amount based on the current amount in the savings account and the interest rate.
	
	Be creative.
   (15 Points.)
*/



public class assignmentNine {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) 
	        for (int j = 0; j < i; j++)
	     System.out.println(i * j);
	}
	
	
		 public class BankAccount{  
			 public double balance;
			 int day = 0;
			 
				
		    public BankAccount()
		    {  
		       balance = 0;
		    }
		 
		    
	      public BankAccount(double firstBalance)
		    {  
		      balance = firstBalance;
		    }
		  
		 
		    public void deposit(double amount) 
		    {  
		       balance = balance + amount;
		    }
		
		    
		    public void withdraw(double amount) 
		    
		    {  
		      balance = balance - amount;
		    }
		 
		  
		    public double getBalance()
		    {  
		       return balance; 
		    }	
	
		    
	}
		 
		 public class CheckingAccount extends BankAccount{  
		     
		     public CheckingAccount(double firstBalance)
		     {  

		        super(firstBalance);
		        day = 0;
		   
		     }
		  
		     public void deposit(double amount) 
		     {  
		        day++;
		        super.deposit(amount); 
		     
		     }
		     
		     public void withdraw(double amount) 
		     
		     {   
		    	 day++;
		        super.withdraw(amount); 
		     }
		     
		     public void applyMonthlyFee() {
		    	 
		    	 if (day > 30) {
		    		 
		    		 super.withdraw(5.0);	 
		    	 }	 
		    	 
		    	 
		     }
		  
		    
		     
		  }
		 
		 public class SavingsAccount extends BankAccount
		  {  
		   
		     public SavingsAccount(double rate) 
		     {  
		    	 
		        interRate = rate;
		     }
		  
	        
		     public void applyInterestRate() 
		     {  
		        double interest = getBalance() * interRate / 100;
		        
		        deposit(interest); 
		     }
		     
		     public double getInterestRate() {
		    	 
		    	 return interRate;
		    	 
		     }
		  
		     private double interRate;
		  }
		 
		
	
	
	
}



