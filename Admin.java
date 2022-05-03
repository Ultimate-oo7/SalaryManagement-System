package pack1;

import java.util.Scanner;



class User {
	static void user(){
		Scanner sc = new Scanner(System.in);
		System.out.println("-:WELCOME to Salary Management System:-");
		System.out.println("PRESS 1 to Add new Employee");
		System.out.println("PRESS 2 to print salary reciept");
		System.out.println("PRESS 3 for List of Employees");
		System.out.println("PRESS 4 to update info");
		
		
		 int input = sc.nextInt();
		 if(input==1) {
			 new Employee();
				System.exit(0);
			 
		 }
		 if(input==2) {
			 new salary_receipt();
				System.exit(0);
			 
		 }
		 if(input==3) {
			 new List();
			  System.exit(0);
		 }
		 if(input==4) {
			 new UpdateEmployee();
			  System.exit(0);
		 }
		 else{
			 System.out.println("Please Provide A Valid Input");
		 }
		 
	}
	

}

public class Admin {
	public static void main(String[] args) {
		System.out.println ("@uthor-Ultimate@3011");
		System.out.println ("-:HELLO USER:-");
		User user = new User();
		user.user();
		}

	
}
