package Demo;

import java.sql.Connection;
import java.sql.DriverManager;

class Demo{
	public static void main(String[] args) throws Exception {
//		Step 1: Load the driver into the memory
    	Class.forName("com.mysql.cj.jdbc.Driver");   //optional
		
//		Step 2: Establish the connection using that loaded driver
		String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String username = "root";
		String password = "1111";
		
		Connection c = DriverManager.getConnection(url, username, password);
		
//		Step 3: Display appropriate message on the console.
		if(c != null)
			System.out.println("Database connected!");
		else
			System.out.println("Database NOT connected!");
	}
	
}


//public static void main(String[] args) throws Exception {
//	//Step1: Load the Driver into the memory
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	//Step2: Establish the connectin using that loaded driver
//	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","1111");
//	//Step3: Display the appropriate message
//	System.out.println((c!=null)? "Connected":"Not Connected");
//}

