
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection 
{
	public Connection con;
	public DBConnection() 
	{
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    con = DriverManager.getConnection(url, "zeel19", "zeel19");
		   
		   System.out.println("Connection successfully");
		   
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.toString());
		} 
		catch (SQLException e) 
		{
		   System.out.println(e.toString());
		}
	}

} 