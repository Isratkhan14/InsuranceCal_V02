package com.constructorprac;

import java.util.Scanner;

public class IfStatement_Excer {
	int length,breadth;
	int num1,num2;
	int quantity,total_cost;
	int unit_cost =100;
	int num_of_year,emp_salary;
	double net_bonus;
	int std_marks;
	int age1,age2,age3;
	int number,absolute_val;
	float num_class, class_atten;
	double percentage_atten;
	String medi_cause;
	int x=2,y=5,z=0;
	char Alphabet;
	
	
	
	public void square_or_rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter length: ");
					
		 length=sc.nextInt();
		
		System.out.println("Please Enter breadth: ");
		breadth=sc.nextInt();
		
		
		if (length == breadth) {
			System.out.println("It is a Square.");
		}
		else
			System.out.println("It is a rectangle.");
	}
	
	public void greater_num() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first number: ");
		num1=sc.nextInt();
		
		System.out.println("Please Enter the second number: ");
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Greater number is:"+ num1);
			
		}
		else
			System.out.println("Greater number is:"+ num2);
	}
	
	public void cost_and_product() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items did you buy? ");
		System.out.println(quantity=sc.nextInt());
		total_cost = quantity*unit_cost;
		System.out.println("Total cost is " +total_cost);
		
		if(total_cost>1000) {
			System.out.println("Customer will get 10% discount.");
			double new_cost =( total_cost-(total_cost -(total_cost)*.10))+total_cost ;
			
			System.out.println("Customer total cost is now after 10% discount is: "+new_cost  );
			}
			else 
				{System.out.println("Sorry no discount.");
		        System.out.println("Total cost is :"+total_cost);}
		
	}
	
	public void employee_salary() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your salary? ");
		//System.out.println(
				emp_salary=sc.nextInt();
		System.out.println("How many years did you work ? ");
				//System.out.println(
						num_of_year=sc.nextInt();
				
				if(num_of_year>5) {
					System.out.println("Employee will get 5% bonus of his/her salary.");
				
					net_bonus = emp_salary*.5;
					System.out.println("Net bonus is : "+net_bonus);}
					else
						System.out.println("Employee will not get any bonus.");
				
			
		
	}
	
	public void student_grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your total marks on exam? ");
		//System.out.println(
				std_marks=sc.nextInt();
		if(std_marks<25)
		{
			System.out.println("Grade is F.");
		}
		else if(std_marks>25 && std_marks<45) {
			System.out.println("Grade is E.");
		}
		else if(std_marks>45 && std_marks<50) {
			System.out.println("Grade is D.");
		}
		else if(std_marks>50 && std_marks<60) {
			System.out.println("Grade is C.");
			}
		else if(std_marks>60 && std_marks<80) {
			System.out.println("Grade is B.");
		}
		else if(std_marks>80) {
			System.out.println("Grade is A.");
		
		}
		
		
	}
	
	public void yougest_person() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Pleasae write your age .");
		age1=sc.nextInt();
		
		System.out.println("Pleasae write your age .");
		age2=sc1.nextInt();
		
		System.out.println("Pleasae write your age .");
		age3=sc2.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println("If you are:"+age1+" Then you are the oldest");
		}
		else if(age2>age1&&age2>age3) {
			System.out.println("If you are:"+age2+" Then you are the oldest");
		}
		else
			System.out.println("If you are:"+age3+" Then you are the oldest");
	}

    public void find_absolute_num() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please write a number.");
    	//System.out.println
        number=sc.nextInt();
    	absolute_val= Math.abs(number);
    	System.out.println("Absolute value of is "+ absolute_val);
    	
}
    public void attendence() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please write how many classes you attendent.");
    	class_atten=sc.nextFloat();
    	System.out.println("Please write how many classes were there.");
    	num_class=sc.nextFloat();
    	percentage_atten =( (class_atten)*100)/(num_class);
    	
    //	System.out.println("Total attendence of the student in the class is "+percentage_atten+"%" );
    	System.out.println("Is medical cause  Y or N? ");
    	System.out.println(sc.next());
    	
    	if (percentage_atten>75 && medi_cause==" Y") {
    		System.out.println("You will be sit for the exam :)");
    	}	
    		else 
    			System.out.println("Sorry you can't sit for the exam :(");
    	}
    public void expressions() {
    	
    		System.out.println(x==2);
    		System.out.println(x!=5);
    		System.out.println( x != 5 && y >= 5);
    		System.out.println(z != 0 || x == 2);
    		System.out.println(!(y < 10));
    	
    }
    	public void Characters() {
    		Scanner sc = new Scanner(System.in);
        	System.out.println("Please write any alphabet.");
        	Alphabet=sc.next().charAt(0);
        	if (Character.isUpperCase(Alphabet)) {
        	System.out.println("Alphabet is in Uppercase.");
    	}
        	else
    		System.out.println("Alphabet is in Lowercase.");
    }}
