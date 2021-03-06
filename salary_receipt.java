package pack1;

import java.sql.ResultSet;
import java.util.Scanner;
import java.util.*;

public class salary_receipt {
	salary_receipt(){
		try{
			Scanner s1 =new Scanner(System.in);
	        sql_connection c = new sql_connection();
	        System.out.println("Enter the employee id for the pay_slip");
	        int id = s1.nextInt();
	        ResultSet rs = c.s.executeQuery("select * from employee where empid="+id);
	        rs.next();
	        String name = rs.getString("empname");
	        rs.close();
	     
	        rs = c.s.executeQuery("select * from salary where empid="+id);

	        java.util.Date date= new Date();
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        int month = cal.get(Calendar.MONTH);
	        System.out.println(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2022  ------------------------");
	        System.out.println("\n");

	        if(rs.next()){
	      
	            System.out.println("\n    Employee ID "+id);
	            System.out.println("\n     Employee Name "+name);

	            System.out.println("\n----------------------------------------------------------------");
	            System.out.println("\n");

	            double basic = rs.getDouble("basic");
	            System.out.println("\n                  monthly        : "+basic);
	            double rent  = rs.getDouble("rent_pay");
	            System.out.println("\n                 rent allowance          : "+rent);
	            double special  = rs.getDouble("allowance");
	            System.out.println("\n             	  net          : "+special);
	            
	            double net = rs.getDouble("netsalary");
	            System.out.println("\n                  BASIC SALARY : "+net);
	            double gross = rs.getDouble("grosssalary");
	            System.out.println("\n                  BASIC SALARY : "+gross);

	            System.out.println("\n-------------------------------------------------------");
	            System.out.println("\n");

	            System.out.println("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);
	            System.out.println("\n       Tax   :   2.1% of gross "+ (gross*2.1/100));   
	            System.out.println("\n -------------------------------------------------");
	            System.out.println("\n");
	            System.out.println("\n");    
	            System.out.println("\n");
	            System.out.println("   (  Signature  )      ");

	        }
	    }catch(Exception ee) {
	        ee.printStackTrace();
	    }
	
	}		
	salary_receipt(int id){
		try{
        sql_connection c = new sql_connection();
        System.out.println("Enter the employee id for the pay_slip");
     
        ResultSet rs = c.s.executeQuery("select * from employee where empid="+id);
        rs.next();
        String name = rs.getString("FirstName");
        rs.close();
     
        rs = c.s.executeQuery("select * from salary where empid="+id);

        Date d1 = new java.util.Date();
        int month = d1.getMonth();
        System.out.println(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2022  ------------------------");
        System.out.println("\n");

        if(rs.next()){
      
            System.out.println("\n    Employee ID "+id);
            System.out.println("\n     Employee Name "+name);

            System.out.println("\n----------------------------------------------------------------");
            System.out.println("\n");

            double basic = rs.getDouble("basic");
            System.out.println("\n                  basic        : "+basic);
            double rent  = rs.getDouble("rent_allow");
            System.out.println("\n                 rent allowance  : "+rent);
            double special  = rs.getDouble("spec_allow");
            System.out.println("\n             	  net          : "+special);
            double monthly = rs.getDouble("total_monthly");
            System.out.println("\n                  Monthly         : "+monthly);
            double net = rs.getDouble("net");
           // System.out.println("\n                  net salary : "+net);
            double gross = rs.getDouble("gross");
           // System.out.println("\n                  gross salary : "+gross);

            System.out.println("\n-------------------------------------------------------");

            System.out.println("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);  
            System.out.println("\n -------------------------------------------------");
            System.out.println("\n");
            System.out.println("\n");    
            System.out.println("\n");
            System.out.println("   (  Signature  )      ");

        }
    }catch(Exception ee) {
        ee.printStackTrace();
    }
}
}
