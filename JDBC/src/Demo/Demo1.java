package Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String username = "root";
		String password = "1111";
		Connection c = DriverManager.getConnection(url, username, password);
		
		if(c != null)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter name: ");
			String name = sc.next();
			
			System.out.println("Database connected!");
		
			String query = "insert into planets values(?, ?);";
			PreparedStatement stmt = c.prepareStatement(query);
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			
			int num = stmt.executeUpdate();
			
			System.out.println(num);
			System.out.println("Planet added!");
			
		}
		else
			System.out.println("Database NOT connected!");
					
	}
}









