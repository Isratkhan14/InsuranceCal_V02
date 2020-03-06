package com.constructorprac;

import java.util.Scanner;

public class LoopPractice {
	int sum;
	float avarage;
	
 public void average1() {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Please enter 10 numbers");
	 
	 for(int i=0;i<10;i++) {
		
		 sum+=sc.nextInt();
	 }
	 System.out.println("Total of the numbers is: "+sum);
	 System.out.println("avarage of the 10 numbers is :"+sum/10);
 }
 
 public void pattern1() {
	 for(int i=1;i<=5; i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
			 }
		 System.out.println();
 }
 }
  
public void pattern2() 
	{
	int line=5;
	int mid=(line+1)/2;
	int i,j;
	for(i=1;i<=mid;i++) {
		for(j=1;j<=mid-i;j++) {
		System.out.print(" ");
	} 
	
	
	for(int k=1;k<=i*2-1;k++) {
		System.out.print("*");
	}
	System.out.println();}
	//lower
	for(i=1;i<=mid-1;i++) {
		
		for(int k=1;k<=i;k++) {
			System.out.print(" ");}
		for( j=1;j<=2*(mid-i)-1;j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}








} 
