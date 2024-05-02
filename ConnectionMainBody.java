package com.connectionnewproject.www;
import java.util.*;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;

public class ConnectionMainBody {
//	public static ConnectionNewProjectPojo obj=new ConnectionNewProjectPojo ();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ConnectionNewProjectPojo obj=new ConnectionNewProjectPojo() ;
		System.out.println("Enter the studentid:");
		int  id= sc.nextInt();
		 System.out.println("Enter the studentName");
		String  name=sc.next();
		 System.out.println("Enter the studentDepartment");
		 String dept=sc.next();
		 System.out.println("Enter the studentLocation");
	     String location=sc.next();
		 obj.setStudent_id(id);
		 obj.setStudent_name(name);
		 obj.setStudent_department(dept);
		 obj.setStudent_location(location);
	     insert(obj);
	     updateStudentName(obj);
		

	}
	 public static Connection getConnection() throws ClassNotFoundException,SQLException
	 {
         
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Vasanth@1761");
	         return con ;
	 }
	 public static void insert(ConnectionNewProjectPojo obj)throws ClassNotFoundException,SQLException
	 {   
		 
		 Scanner sc=new Scanner(System.in);
		 
		 
		 Connection connection = getConnection();
		 String query = "insert into studentinformation values(?, ?, ?,?)";
		 PreparedStatement p=connection.prepareStatement(query);
		 p.setInt(1,obj.getStudent_id());
		 p.setString(2,obj.getStudent_name());
		 p.setString(3,obj.getStudent_department());
		 p.setString(4,obj.getStudent_location());
		 int rows=p.executeUpdate();
		 System.out.println("rows:"+rows);
		 connection.close();
	 }
	 public static void updateStudentName(ConnectionNewProjectPojo obj)throws ClassNotFoundException,SQLException
	 {
		 Scanner sc=new Scanner(System.in);
		 Connection connection=getConnection();
		 System.out.println("Enter the student name:");
		 String sname=sc.next();
		 System.out.println("Enter the student id:");
         int id=sc.nextInt();
         obj.setStudent_id(id);
         obj.setStudent_name(sname);
		 String query="update studentinformation set student_name=? where student_id=?";
		 PreparedStatement p=connection.prepareStatement(query);
		 
		 p.setString(1,obj.getStudent_name());
		 p.setInt(2,obj.getStudent_id());
		 int rows=p.executeUpdate();
		 System.out.println("rows:"+rows);
		 
		 
	 }

}
