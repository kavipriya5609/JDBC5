package GroceryShop;
import java.sql.*;
import java.util.Scanner;

public class GroceryDetails {

	Scanner obj=new Scanner(System.in);
	  String url="jdbc:mysql://127.0.0.1:3306/GroceryShop";
		String username="root";
		String password="5609";
		
		public void Productsinsert()throws Exception{
			 try {
				
		 Connection con=DriverManager.getConnection(url,username,password);
	          System.out.println("ENTER THE NUMBER OF ROWS WOULD LIKE TO INSERT:");
	           int size=obj.nextInt();
	                    obj.nextLine();
	          String QUERY="insert into stocks.NIFTY50"+
	        	         "(PRODUCTID,PRODUCTNAME,BRANDNAME,PRICE,QUANTITY)VALUES (?,?,?,?,?);";
	        	         PreparedStatement st =con.prepareStatement(QUERY);
	         
	        for(int i=0;i<size;i++)
	         {	 
	        	// int updateid=obj.nextInt();
	        	 //String updatename=obj.nextLine();
	        	 
	        	System.out.println("ENTER THE PRODUCTID: ");
	        	int PRODUCTID=obj.nextInt();
	        	 st.setInt(1,PRODUCTID);
	        	 
	        	 System.out.println("ENTER THE PRODUCTNAME: ");
	        	 String PRODUCTNAME=obj.nextLine();
	        	   st.setString(2,PRODUCTNAME);
	        	 
	        	 System.out.println("ENTER THE BRANDNAME: ");
	        	 String BRANDNAME=obj.nextLine();
	        	   st.setString(3,BRANDNAME);
	        	 
	        	 System.out.println("ENTER THE PRICE:");
	        	 int PRICE=obj.nextInt();
	        	 st.setInt(4,PRICE);
	        		 
	        	System.out.println("ENTER THE QUANTITY:");
	        	int QUANTITY=obj.nextInt();
	        	             obj.nextLine();
	            st.setInt(5,QUANTITY);
	            
	            st.executeUpdate();
	 
	         }
	        System.out.println(size+" ROWS ADDED SUCCESSFULLY");
		  }
			  catch(SQLException e) {
				  e.printStackTrace();
				  
			  }}
		
		
	        public void GroceryProductupdate()

	        {
	        	try {
	        
	         Connection con=DriverManager.getConnection(url,username,password);
			 
	         System.out.println("ENTER THE NEW GROCERYPRODUCT YOU WOULD LIKE TO UPDATE ");
	         String updatename=obj.nextLine();
	         
	         System.out.println("ENTER THE CORRESPONDING PRODUCTID  ");
	         int updateid=obj.nextInt();
	         
	         String QUERY="UPDATE GroceryShop.GroceryDetails set PRODUCTNAME=? where PRODUCTID=?";
	         PreparedStatement st=con.prepareStatement(QUERY);
	         st.setString(1,updatename);
	         st.setInt(2, updateid);
	         st.executeUpdate();
	 		 System.out.println("PRODUCTNAME OF PRODUCTID:"+updatename+"UPDATED SUCCESSFULLY");
	        	}
	        	catch(SQLException e) {
				  e.printStackTrace();
				  
			  }}
	        	public void getbyPRODUCTID(){
	        		try { Connection con=DriverManager.getConnection(url,username,password);
	    			
	    			System.out.println("ENTER THE PRODUCTID TO VIEW PRODUCTDETAILS");
	   	             int getbyPRODUCTID=obj.nextInt();
	   	          String QUERY="select*from GroceryShop.GroceryDetails where STOCKID="+getbyPRODUCTID;
	   	       Statement st=(Statement) con.createStatement();     
	    		  ResultSet rs= st.executeQuery(QUERY);
	    		//  PRODUCTID,PRODUCTNAME,BRANDNAME,PRICE,QUANTITY
	    			 while(rs.next()) {
	    	        	 System.out.println("PRODUCTID : "+rs.getInt(1));
	    	        	 System.out.println("PRODUCTNAME : "+rs.getString(2));
	    	        	 System.out.println("BRANDNAME : "+rs.getString(3));
	    	        	 System.out.println("PRICE : "+rs.getInt(4));
	    	        	 System.out.println("QUANTITY : "+rs.getInt(5));
	    	        	 
	    	        	}}
	        		
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();
	   				  
	   			  }}
	        	public void PRODUCTTAB(){
	        		try { Connection   con=DriverManager.getConnection(url,username,password);
	    			
	    		
	   	          String QUERY="select*from GroceryShop.GroceryDetails";
	   	       Statement st=(Statement) con.createStatement();     
	    		  ResultSet rs= st.executeQuery(QUERY);
	    		  System.out.println("PRODUCTID PRODUCTNAME BRANDNAME PRICE QUANTITY" );
	    			 while(rs.next()) {
	    	        	 System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"      "
	    	        	+rs.getString(3)+"      "+rs.getInt(4)+"      "+
	    	        +rs.getInt(5)+"      ");
	    	        	}}
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();
	   				  
	   			  }}
	        	
	        	
	        	public void deletebyProductid(){
	        		try { Connection con=DriverManager.getConnection(url,username,password);
	        		 Statement st=(Statement) con.createStatement();
	    			System.out.println("ENTER THE PRODUCTID TO DELETE FROM GROCERYDETAILS TABLE");
	   	             int deletebyProductid=obj.nextInt();
	   	          String QUERY="Delete from GroceryShop.GroceryDetails where PRODUCTID="+deletebyProductid;
	   	           st.executeUpdate(QUERY);
	   	        System.out.println("PRODUCTID:"+deletebyProductid+" FROM GroceryDetails TABLE DELETED SUCCESSFULLY");
	    		
	    	       }
	    	         
	    	         catch(SQLException e) {
	   				  e.printStackTrace();
	   				  
	   			  }
		
}
}
