package com.constructorprac;

public class Programming {
	/* Example 4: 
Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed.
 If some String is passed to it, then in place of "programming languages" 
 the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.
*/
	String str1 = "I love ";


	

	Programming() {

		System.out.println(str1+" programming languages");

	}

	

	Programming(String str2) {

		System.out.println(str1+""+str2);

		

	}



	

}
