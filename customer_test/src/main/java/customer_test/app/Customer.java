package customer_test.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			//Step 1 - Load/Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			
			//Step 2 - Open Connection(url,username,password)
			String url="jdbc:postgresql://localhost:5432/postgres";			
			String username="postgres";
			String password="Spiderman1!";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successfull");
			
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select "
					+ "cus_id,fname,lname,contact "
					+ "from "
					+ "Practice.customer";
			System.out.println("Statement Created");
			
			//Step 4 - Execute Query
			ResultSet rs=statement.executeQuery(sql);
			System.out.println("Query Executed");
			
			//Step 5 - Process Results
			while(rs.next()) {
				System.out.print("cus_id = "+rs.getInt("cus_id"));
				System.out.print(" fname = "+rs.getString("fname"));
				System.out.print(" lname = "+rs.getString("lname"));
				System.out.println(" Contact = "+rs.getLong("contact"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			
			try {
				//Step 6 - Close Connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
