package GroceryShop;
import java.sql.*;
import java.util.Scanner;

public class MainClass {
	  public static void main(String[] args)throws Exception{
          GroceryDetails obj=new GroceryDetails();
          UserDetails obj1=new UserDetails();
          Scanner sc=new Scanner(System.in);
           Create cr=new Create();
           System.out.println("ENTER THE RESPECTIVE NUMBER TO PERFORM OPERATION"
           		+ "\n                 1)CREATION OF NEW DATABASE AND TABLES"
           		+ "\n                 2)GroceryDetails"
           		+ "\n                 3)UserDetails");
           
           int userselection=sc.nextInt();
           
           switch(userselection)
           {
           case 1: 
        	   cr.createdatabase();
               cr.createGroceryTab();
               cr.createusertable();
               
        	   
        	   System.out.println("NEW DATABASE AND TABLE FOR USER AND PRODUCTS CREATED");
        	   break;
        	   
           case 2:
        	   System.out.println("ENTER THE RESPECTIVE NUMBER TO MANAGE PRODUCTDETAILS TABLE"
        	   		+ " \n                   1)INSERT  NEW PRODUCT DETAILS"
        	   		+ " \n                   2)TO UPDATE PRODUCTNAME"
        	   		+ " \n                   3)TO GET  PRODUCT DETAILS"
        	   		+ " \n                   4)TO GET ENTIRE PRODUCT DETAILS"
        	   		+ " \n                   5)TO DELETE  PRODUCT DETAILS"
        			   );
        	   int Producttable=sc.nextInt();
              switch(Producttable) {
              case 1:obj.Productsinsert();
                             break;
              case 2:obj.GroceryProductupdate();
            	             break;
              case 3:obj.getbyPRODUCTID();
            	              break;
              case 4:obj.PRODUCTTAB();
            	               break;
              case 5:obj.deletebyProductid();
            	               break;
              }
                               break;
           case 3:
        	   System.out.println("ENTER THE RESPECTIVE NUMBER TO MANAGE USERDETAILS TABLE"
        	   		+ "    \n                1)INSERT  NEW USER DETAILS"
        	   		+ "    \n                2)TO UPDATE USERNAME"
        	   		+ "    \n                3)TO GET  USER DETAILS"
        	   		+ "    \n                4)TO GET ENTIRE USER DETAILS"
        	   		+ "    \n                5)TO DELETE  USER DETAILS"
        			   );
        	   int usertable=sc.nextInt();
              switch(usertable) {
              case 1:obj1.userinsert();
                             break;
              case 2:obj1.customernameupdate();
            	             break;
              case 3:obj1.getbyCUSTOMERid();
            	              break;
              case 4:obj1.USERTABLE();
            	               break;
              case 5:obj1.deletebyuserid();
            	               break;
              }
           
           }
               

         sc.close();
         
         
          

}
}
