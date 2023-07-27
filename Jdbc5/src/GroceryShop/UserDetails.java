package GroceryShop;
import java.sql.*;
import java.util.Scanner;


public class UserDetails {

	Scanner obj=new Scanner(System.in);
	  String url="jdbc:mysql://127.0.0.1:3306/java";
		String username="root";
		String password="5609";
		
		public void userinsert()throws Exception{
			 try {
				/*create table GroceryShop.USER"+
		 		    "(CUSTOMERID int PRIMARY KEY auto_increment,"+
		             "CUSTOMERNAME VARCHAR(255),"+
		             "CONTACTNUMBER INTEGER,"+
		             "EMAIL VARCHAR(255)*/
		 Connection con=DriverManager.getConnection(url,username,password);
	          System.out.println("ENTER THE NUMBER OF ROWS WOULD LIKE TO INSERT:");
	           int size=obj.nextInt();
	                    obj.nextLine();
	          String QUERY="insert into GroceryShop.USER"+
	        	         "(CUSTOMERID,CUSTOMERNAME,CONTACTNUMBER,EMAIL)VALUES (?,?,?,?);";
	        	         PreparedStatement st =con.prepareStatement(QUERY);
	         
	        for(int i=0;i<size;i++)
	         {	 
	        	
	        	System.out.println("ENTER THE CUSTOMERID: ");
	        	int CUSTOMERID=obj.nextInt();
	        	 st.setInt(1,CUSTOMERID);
	        	 
	        	 System.out.println("ENTER THE CUSTOMERNAME: ");
	        	 String CUSTOMERNAME=obj.nextLine();
	        	  st.setString(2,CUSTOMERNAME);
	        	 
	        	 System.out.println("ENTER THE CONTACTNUMBER: ");
	        		int CONTACTNUMBER=obj.nextInt();
	        		 obj.nextLine();
	        		st.setInt(3,CONTACTNUMBER);
	        	 
	        	 System.out.println("ENTER THE EMAIL:");
	        	 String EMAIL=obj.nextLine();
	        	  st.setString(2,EMAIL);
	        	     
	        		 
	        	     	              
	            
	            st.executeUpdate();
	 
	         }
	        System.out.println(size+" ROWS ADDED SUCCESSFULLY");
		  }
			  catch(SQLException e) {
				  e.printStackTrace();
				  
			  }}
	        public void customernameupdate()

	        {
	        	try {
	        
	         Connection con=DriverManager.getConnection(url,username,password);
			 
	         System.out.println("ENTER THE NEW CUSTOMERNAME YOU WOULD LIKE TO UPDATE ");
	         String updatename=obj.nextLine();
	         
	         System.out.println("ENTER THE CORRESPONDING CUSTOMERID  ");
	         int updateid=obj.nextInt();
	         
	         String QUERY="UPDATE GroceryShop.USER set CUSTOMERNAME=? where CUSTOMERID=?";
	         PreparedStatement st=con.prepareStatement(QUERY);
	         st.setString(1,updatename);
	         st.setInt(2, updateid);
	         st.executeUpdate();
	 		 System.out.println("CUSTOMERNAME OF CUSTOMERID:"+updatename+"UPDATED SUCCESSFULLY");
	        	}
	        	catch(SQLException e) {
				  e.printStackTrace();
				  
			  }}
	        	public void getbyCUSTOMERid(){
	        		try { Connection con=DriverManager.getConnection(url,username,password);
	    			
	    			System.out.println("ENTER THE CUSTOMERID TO VIEW CUSTOMERDETAILS");
	   	             int getbyCUSTOMERid=obj.nextInt();
	   	          String QUERY="select*from GroceryShop.USER where CUSTOMERID="+getbyCUSTOMERid;
	   	       Statement st=(Statement) con.createStatement();     
	    		  ResultSet rs= st.executeQuery(QUERY);
	    			 while(rs.next()) {
	    	        	 System.out.println("CUSTOMERID : "+rs.getInt(1));
	    	        	 System.out.println("CUSTOMERNAME : "+rs.getString(2));
	    	        	 System.out.println("CONTACTNUMBER : "+rs.getInt(3));
	    	        	 System.out.println("EMAIL : "+rs.getString(4));
	    	        	

	    	        	}}
	        		
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();
	   				  
	   			  }}
	        	public void USERTABLE(){
	        		try { Connection   con=DriverManager.getConnection(url,username,password);
	    			String QUERY="select*from GroceryShop.USER";
	   	       Statement st=(Statement) con.createStatement();     
	    		  ResultSet rs= st.executeQuery(QUERY);
	    		  
	    		  System.out.println("CUSTOMERID  CUSTOMERNAME   CONTACTNUMBER  EMAIL" );
	    			 while(rs.next()) {
	    	        	 System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"      "
	    	        	+rs.getInt(3)+"      "+rs.getString(4)+"          ");
	    	        	}}
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();
	   				  
	   			  }}
	        	
	        	
	        	public void deletebyuserid(){
	        		try { Connection con=DriverManager.getConnection(url,username,password);
	        		 Statement st=(Statement) con.createStatement();
	    			System.out.println("ENTER THE CUSTOMERID TO DELETE FROM GROCERYDETAILS TABLE");
	   	             int deletebyuserid=obj.nextInt();
	   	          String QUERY="Delete from GroceryShop.USER where USERID="+deletebyuserid;
	   	           st.executeUpdate(QUERY);
	   	        System.out.println("CUSTOMERID:"+deletebyuserid+" FROM USER TABLE DELETED SUCCESSFULLY");
	    		
	    	       }
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();}
	   				  

}
	
}
