package com.constructorprac;

public class Rectangle_exam2 {

	/*
	 * Example 2: Create a class named 'Rectangle' with two data members- length and
	 * breadth and a method to claculate the area which is 'length*breadth'. The
	 * class has three constructors which are : 1 - having no parameter - values of
	 * both length and breadth are assigned zero. 2 - having two numbers as
	 * parameters - the two numbers are assigned as length and breadth respectively.
	 * 3 - having one number as parameter - both length and breadth are assigned
	 * that number. Now, create objects of the 'Rectangle' class having none, one
	 * and two parameters and print their areas.
	 */

	int length;

	int breadth;

	Rectangle_exam2() {

	}

	Rectangle_exam2(int ln, int br) {

		length = ln;

		breadth = br;

	}

	Rectangle_exam2(int num) {

		length = num;

		breadth = num;

	}

	public void area() {

		int area = length * breadth;

		System.out.println("Area of the rectangle is " + area);

	}

}
