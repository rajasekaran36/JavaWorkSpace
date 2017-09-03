import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Main {

	static String pushQueryBuilder(){
		Scanner inp = new Scanner(System.in);
		String pushQuery = "";
		String name, email, location;
		long pno;
		System.out.print("Enter Name :");
		name = inp.next();
		System.out.print("Enter Phno :");
		pno = inp.nextInt();
		System.out.print("Enter Email :");
		email = inp.next();
		System.out.print("Enter Location :");
		location = inp.next();
		pushQuery = "INSERT INTO `testtable`(`name`, `phonenumber`, `email`, `location`) VALUES ('"+name+"', "+pno+", '"+email+"', '"+location+"')";
		inp.close();
		return pushQuery;
		
	}
	public static void main(String[] args) {
		String username = "root";
		String password = "";
		String dbLocation = "jdbc:mysql://localhost/testdb";
		Connection dbConnection = null;
		Statement stmtToBeExecuted = null;
		String getDataQuery = "select * from testtable";
		String pushDataQuery = "INSERT INTO `testtable`(`name`, `phonenumber`, `email`, `location`) VALUES ('ravi', 7878787, 'ravi@gmil.com', 'selam')";  
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load Done");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Driver Loading Problem");
		}
		
		try {
			dbConnection = (Connection) DriverManager.getConnection(dbLocation, username, password);
			System.out.println("Connection Done");
		} catch (SQLException e) {
			System.out.println("Connection Problem");
		}
		
		try {
			stmtToBeExecuted = (Statement) dbConnection.createStatement();
			System.out.println("Statement Done");
		} catch (SQLException e) {
			System.out.println("Statement Problem");
		}
		
		try {
			stmtToBeExecuted.executeUpdate(pushQueryBuilder());
			System.out.println("Update Query Done");
		} catch (SQLException e1) {
			System.out.println("Update Query Problem");
		}
		
		try {
			rs = stmtToBeExecuted.executeQuery(getDataQuery);
			System.out.println("Query Done");
		} catch (SQLException e) {
			System.out.println("Query Problem");
		}
		
		try {
			System.out.println(rs.wasNull());
			while(rs.next()){
				//System.out.println("Process RS");
				System.out.println(rs.getString(1)+ "\t" +rs.getInt(2) + "\t" +rs.getString(3) + "\t" +rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println("Unable to process result set");
		}
		
		finally{
			try {
				dbConnection.close();
				System.out.println("Closing Connection Done");
			} catch (SQLException e) {
				System.out.println("Closing Connection Problem");
			}
		}
	}

}
