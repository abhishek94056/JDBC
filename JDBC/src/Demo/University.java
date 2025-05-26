package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class University {
	public static void main(String[] args) throws Exception{
		//Connect the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connect the databasee to driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","1111");
		
		if(c!= null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Connect the database");
			PreparedStatement stmt = c.prepareStatement("insert into SPPU values(?,?);");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			int num=stmt.executeUpdate();
			System.out.println(num);
			System.out.println("SPPU Added");		
		}
		else {
			System.out.println("Database was not connected");
		}

	}
	
}
