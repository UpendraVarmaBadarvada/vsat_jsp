package Dao;
import java.io.*;
import java.sql.*;
import Bean.User;


public class UserDao {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	    	Class.forName("org.sqlite.JDBC");
		    con=DriverManager.getConnection("jdbc:sqlite:/Users/upendravarma/vsat.db"); 
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}
	public static User getRecordById(String Address){  
	    User u=null;
	    Connection con = null;
		PreparedStatement ps= null;
		int data_sent=0;
		int Bill_amount=0;
	    try{  
	        con=getConnection();  
	        ps=con.prepareStatement("select Bill.CALLING_ADDRESS,Bill.CALLED_ADDRESS,Bill.START_DATE,Bill.END_DATE,Bill.NO_OF_BYTES_TRANSFERRED,Bill_Address.STATE,Bill_Address.CITY,Bill_Address.STREET_NAME,Bill_Address.ZIP_CODE from Bill inner join Bill_Address on Bill.CALLING_ADDRESS=Bill_Address.CALLING_ADDRESS and Bill_Address.CALLING_ADDRESS=?");  
	        ps.setString(1,Address);
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            u=new User();  
	            u.setCalling_address(rs.getString(1));  
	            u.setCalled_address(rs.getString(2));
	            u.setStart_date(rs.getString(3));
	            u.setEnd_date(rs.getString(4));
	            u.setData_sent(rs.getInt(5));
	            u.setState(rs.getString(6));
	            u.setCity(rs.getString(7));
	            u.setStreet_name(rs.getString(8));
	            u.setZip_code(rs.getInt(9));
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}  

}
