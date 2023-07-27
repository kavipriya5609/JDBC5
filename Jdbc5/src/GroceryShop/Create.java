package GroceryShop;
import java.sql.*;
import java.util.Scanner;

public class Create {
 
 
	 Scanner obj=new Scanner(System.in);
	 String url="jdbc:mysql://127.0.0.1:3306/GroceryShop";
	String username="root";
	String password="5609";
		
	public void createdatabase()

	  {
		  try { 
			
			  Connection con=DriverManager.getConnection(url,username,password);
	        String QUERY="create database GroceryShop";
        Statement st=(Statement) con.createStatement();      
         st.executeUpdate(QUERY);
       System.out.println("Created new DATABASE:GroceryShop"); 	}
		  catch(SQLException e) {
			  e.printStackTrace();
			  
		  }}
       
       
		  public void createGroceryTab() {
			  try {Connection con=DriverManager.getConnection(url,username,password);
				  Statement st=(Statement) con.createStatement();     
       String QUERY="create table GroceryShop.GroceryTable"+
              "(PRODUCTID integer primary key auto_increment,"+
              "PRODUCTNAME VARCHAR(255),"+
              "BRANDNAME VARCHAR(255),"+
              "PRICE integer,"+
              "QUANTITY integer)";
   st.executeUpdate(QUERY);
   System.out.println("Created table GroceryTable");}
   
   catch(SQLException e) {
		  e.printStackTrace();
		  
	  }}
   
   public void createusertable() {
		  try {Connection con=DriverManager.getConnection(url,username,password);
			  Statement st=(Statement) con.createStatement(); 
   
   
   String QUERY="create table GroceryShop.USER"+
 		    "(CUSTOMERID int PRIMARY KEY auto_increment,"+
             "CUSTOMERNAME VARCHAR(255),"+
             "CONTACTNUMBER INTEGER,"+
             "EMAIL VARCHAR(255))";
             
   st.executeUpdate(QUERY);
   System.out.println("Created table USER");}
	  catch(SQLException e) {
		  e.printStackTrace();
		  
	  }
	 
 }
}
