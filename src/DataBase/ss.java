/*package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import net.sf.json.JSONArray;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.javen.course.util.passCheck;

import controller.register;

import cn.gov.cnis.cssn.wssort.xsd.QueryResult;

public class ss {
	
	public static Map<String, Object> getData(String[] args,String dealType,HttpSession session){
		String[] a = new String[50];
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println("Str===============");
		System.out.println(str);
		System.out.println("sdf===============");
		System.out.println(sdf);
			// 驱动    
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@10.3.4.15:1521/cnisora2"; //orcl为数据库的SID 
		String user="ncssn"; 
		String password="csic_cnis"; 
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl"; //orcl为数据库的SID 
		String user="test"; 
		String password="test"; 
		
		
		try {
			Connection conn= DriverManager.getConnection(url,user,password);
			 if(!conn.isClosed()){ 
		        System.out.println("Succeeded connecting to the Database!");
			 }

			 String sql = "";
	         Statement statement = conn.createStatement();
	 		switch(dealType){
	 		case "insert":register.insert(session);
	 					break;
			case "updata":sql = "update t_nv_user set open_id = '"+args[0]+"', source_link = 'weixin', open_check = 1 where login_name = '"+args[1]+"'";
							break;
			case "insert_updata": sql = "update t_nv_user set open_id = '"+args[0]+"', source_link = 'weixin', open_check = 3 where login_name = '"+args[1]+"'";
							break;
			case "open_check":sql = "select open_check from t_nv_user where source_link = 'weixin' and open_id ='" +args[0]+"'";
							break;
			case "login_name":sql = "select login_name from t_nv_user where open_id = '"+args[0]+"' and source_link = 'weixin' ";
							break;
			default:break;
	 		}
	                  
	 		System.out.println(sql);
	         ResultSet rs = statement.executeQuery(sql);

	         System.out.println(rs);
	         System.out.println("==================");
	 		switch(dealType){
			case "updata": 	map.put("OK", "true");
							break;
			case "open_check":while(rs.next() && rs != null){                  
							map.put("open_check", rs.getString("open_check"));
							map.put("OK", "true");
							}
			break;
			case "login_name":while(rs.next() && rs != null){                  
							map.put("login_name", rs.getString("login_name"));
							map.put("OK", "true");
							}
							break;
			default:break;				
	 		}
	 		 rs.close();
		     conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("OK", "false");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	
}
*/