package pack1;

import java.util.Scanner;
import java.util.*;

public class user {
	user(int a){
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1 for Updating your info");
		System.out.println("Enter 2 for Getting the pay slip");
		 int input = s1.nextInt();
		 if(input==1) {
			 
			 new UpdateEmployee(a);
			 
			 System.exit(0);
		}
		 if(input==2) {
			 new salary_receipt(a);
			 System.exit(0);
			 
		 }
	}
}

