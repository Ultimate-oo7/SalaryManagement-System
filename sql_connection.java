package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class sql_connection {
	public Connection c;
	public Statement s;
	
	public sql_connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","3011");
			s=c.createStatement();
		}catch(Exception e) {
			throw new RuntimeException("invalid");
		}
	}
	

}

