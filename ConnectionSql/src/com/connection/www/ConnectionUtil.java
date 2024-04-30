package com.connection.www;
import java.sql.*;
public class ConnectionUtil {

	public static void main(String[] args) throws SQLException,ClassNotFoundException 
	{
	            
	        Connection connection =getConnection();
	        System.out.println(connection);
	        insert();
	        update();
	        delete();
	        read();
	        
	 }
	 public static Connection getConnection() throws ClassNotFoundException,SQLException
	 {
//	         Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Vasanth@1761");
	         return con ;
	 }
	 public static void update()throws ClassNotFoundException,SQLException
	 {
	   Connection connection = getConnection();
	  String query="update details set user_name='vasanth' where library_id=5";
	  PreparedStatement p= connection.prepareStatement(query);
	  System.out.println("Updated Successfully");
	  p.execute();
	  connection.close();
	 }
	 public static void insert()throws ClassNotFoundException,SQLException
	 {
		 Connection connection = getConnection();
		 String query = "insert into details value(3,'pranesh','harry',9876544442)";
		 PreparedStatement p=connection.prepareStatement(query);
		 System.out.println("Inserted successfully");
		 p.execute();
		 connection.close();
	 }
	 public static void delete()throws ClassNotFoundException,SQLException
	  
	 {
		 Connection connection = getConnection();
		 String query = "delete from details where library_id=8";
		 PreparedStatement p=connection.prepareStatement(query);
		 System.out.println("deleted successfully");
		 p.execute();
		 connection.close(); 
	 }
	 public static void read()throws ClassNotFoundException,SQLException
	 {
		 Connection connection = getConnection();
		 String query="Select *from details";
		 PreparedStatement p=connection.prepareStatement(query);
		 ResultSet r=p.executeQuery();
		 ResultSetMetaData rsmd = r.getMetaData();
	     int columnsNumber = rsmd.getColumnCount();
	     while (r.next()) {
	            for (int i =1; i <= columnsNumber; i++) {
	              //  if (i > 1) System.out.print(",  ");
	                String columnValue = r.getString(i);
	               System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" " );
	            }
	            System.out.println("");
	        }
	        
	                
	        connection.close();
		 
	 
	 }
	  
	        
}

