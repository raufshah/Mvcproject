package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class any
{
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	Connection con=null;
	
	
	public void initial()
	{
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
			
		}
		catch(Exception e)
		{
			
		}
		try
		{
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT * FROM COLLEGE");
			while(res.next()==true)
			{
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				StudentDatabase sd=new StudentDatabase(a,b,c);
			
			}
			
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}
