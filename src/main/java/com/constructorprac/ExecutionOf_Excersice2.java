package com.constructorprac;

public class ExecutionOf_Excersice2 {

	public static void main(String[] args) {
		//Example :1
		System.out.println("Example:1");
Student_exam1 name = new Student_exam1();

System.out.println("No name alocated for the student");

Student_exam1 name1 = new Student_exam1("Israt");

System.out.println("Student name is Israt");

System.out.println("---------------------------------------------------------");

//Example:2

//calling methods from class Rectangle_exam2
System.out.println("Example:2");
Rectangle_exam2 rec1 = new Rectangle_exam2();

rec1.area();

Rectangle_exam2 rec2 = new Rectangle_exam2(5);

rec2.area();



Rectangle_exam2 rec3 = new Rectangle_exam2(15,5);

rec3.area();

System.out.println("---------------------------------------------------------");

//Example:3

System.out.println("Example:3");
//Object of AddAmount class
AddAmount am = new AddAmount();
AddAmount am2 = new AddAmount(100);

System.out.println("------------------------------------------------------------");

//Example:4

System.out.println("Example:4");

//creating objects of Programming class

		Programming p1 = new Programming();

		Programming p2 = new Programming("Java");


	}

}
