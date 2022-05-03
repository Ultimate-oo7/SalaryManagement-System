package pack1;

import java.sql.ResultSet;
import java.util.Arrays;

public class List {
	public List(){
		String d[][]=new String[5][5];  
	    int i=0;
	    int j = 0;
		try{
			String q="select * from employee";
			sql_connection c1=new sql_connection();
			ResultSet rs = c1.s.executeQuery(q);
			 while(rs.next()){
	                // i = 0 j = 0
	                d[i][j++]=rs.getString("empid");
	                d[i][j++]=rs.getString("empname");
	                d[i][j++]=rs.getString("empsex");
	                d[i][j++]=rs.getString("Address");
	                d[i][j++]=rs.getString("mobile");
	                i++;
	                j=0;
	            }
			 System.out.println(Arrays.deepToString(d));
		}catch(Exception e) {}
	}
}
