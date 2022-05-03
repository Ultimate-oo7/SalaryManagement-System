package pack1;

import java.util.*;




public class UpdateEmployee {
	UpdateEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("PRESS-1 to UPDATE PRESS-2 to DELETE");
		int k = sc.nextInt();
		if(k==1) {
		System.out.println("Note:: You canot change your Employee Id");
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter sex");
		String sex = sc.next();
		System.out.println("Enter Address");
		String Address= sc.next();
		System.out.println("Enter Mobile No.");
		String mobile = sc.next();
		System.out.println("Enter your ID");
		int id = sc.nextInt();
		
		String qry = "update employee set empname='"+name+"',empsex='"+sex+"',Address='"+Address+"',mobile ='"+mobile+"' where empid='"+id+"'";
	    
	    try{
	        sql_connection c1 = new sql_connection();
	        c1.s.executeUpdate(qry);
	        System.out.println("Employee Updated SUCESSFULLY");
	    }catch(Exception ee){
	        ee.printStackTrace();
	        System.out.println("PLEASE PROVIDE VALID INPUT");
	    }
		}
		else if(k==2){
	    try{
	    	System.out.println("Enter EMPLOYEE ID you want to delete");
	    	int id = sc.nextInt();
	    	sql_connection c1 = new sql_connection();
	        c1.s.executeUpdate("delete from employee where empid='"+id+"'");
	        System.out.println("Employee Deleted SUCESSFULLY");
	    }catch(Exception ee){
	        ee.printStackTrace();
	    }
		}else {
			System.out.println("INVAlID Input");
		}
	}
	
}
