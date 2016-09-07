package DataBase;

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

public class ConnectOracle {
	
	public Connection getData(){
/*		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println("Str===============");
		System.out.println(str);
		System.out.println("sdf===============");
		System.out.println(sdf);*/
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

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,password);
			 if(!conn.isClosed()){ 
			        System.out.println("Succeeded connecting to the Database!");
				 }
			 return conn ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
