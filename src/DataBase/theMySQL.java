package DataBase;

import java.sql.*;

public class theMySQL {
	public String[] getData(String args){
		String[] thers = new String[2];
		String weixingID = "";
		String ID =""; 
        // �������          
		String driver = "com.mysql.jdbc.Driver";
        // URLָ��Ҫ���ʵ���ݿ���scutcs           
		String url = "jdbc:mysql://123.57.207.4:3306/standardWeixin";
        // MySQL����ʱ���û���           
		String user = "root";              
		// MySQL����ʱ������          
		String password = "root";
		try {             
        	// ���������            
        	Class.forName(driver);
         // ������ݿ�           
        	Connection conn = DriverManager.getConnection(url, user, password);
         if(!conn.isClosed())              
        	 System.out.println("Succeeded connecting to the Database!");
         // statement����ִ��SQL���            
         Statement statement = conn.createStatement();
         // Ҫִ�е�SQL���            
         String sql = args;
         // ���           
         ResultSet rs = statement.executeQuery(sql);
         
/*		while(rs.next()){              
        	 // ѡ��sname�������            
			thers[0] = rs.getString("UserID");
			thers[1] = rs.getString("weixinID");
        	}*/
	    rs.close();            
	    conn.close();
	        } catch(ClassNotFoundException e) {
	         System.out.println("Sorry,can`t find the Driver!");             e.printStackTrace();
	        } catch(SQLException e) {
	         e.printStackTrace();
	        } catch(Exception e) {
	         e.printStackTrace();
	        } 
    	return thers;
        }
}
