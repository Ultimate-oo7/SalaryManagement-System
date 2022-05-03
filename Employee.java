package pack1;
import java.util.Scanner;

public class Employee {
	public   Employee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details for new employee");
		System.out.println("Enter the ID of Employee");
		String empid = sc.nextLine();
		System.out.println("Enter the Name of Employee");
		String empname = sc.nextLine();
		System.out.println("Enter the Sex of Employee");
		String empsex = sc.nextLine();
		System.out.println("Enter the Address of Employee");
		String userid = sc.nextLine();
		System.out.println("Enter the Mobile of Employee");
		String mobile = sc.nextLine();
		String qry = "insert into employee values('"+empid+"','"+empname+"','"+empsex+"','"+userid+"','"+mobile+"')";
		try{
            sql_connection c1 = new sql_connection();
            c1.s.executeUpdate(qry);
            System.out.println("---:Registration Sucessfull:---"); 
        }catch(Exception ee){
            ee.printStackTrace();
        }
	}

}
