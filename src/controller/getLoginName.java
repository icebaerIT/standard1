package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import DataBase.ConnectOracle;


/**
 * @author joseber
 * 通过用户的openID获取到用户的真实ID
 *
 */
public class getLoginName {
	
	public static Map<String, Object> getLoginNameing(HttpSession session){
		
		System.out.println("获取用户信息");
		String openid = (String) session.getAttribute("openID");
/*		String openid = "obFKEt1U4KmC2E7Cht75WZJHJch8";*/
		
		//连接数据库
		ConnectOracle connectDataBase = new ConnectOracle();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		if(connectDataBase.getData() != null){
			try {
				
				Statement statement = connectDataBase.getData().createStatement();
				String sql = "select login_name,OPEN_CHECK from t_nv_user where open_id = '"+openid+"' and source_link = 'weixin'";
				System.out.println(sql);
		        ResultSet rs = statement.executeQuery(sql);
		        
		        while(rs.next() && rs != null){    
		        	session.setAttribute("OPEN_CHECK", rs.getString("OPEN_CHECK"));
		        	session.setAttribute("ID",rs.getString("login_name"));
		        	map.put("OPEN_CHECK", rs.getString("OPEN_CHECK"));
					map.put("login_name", rs.getString("login_name"));
					System.out.println(rs.getString("login_name"));
					map.put("OK", "true");
					}
		 		rs.close();
		 		connectDataBase.getData().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("出现异常");
			}
		}else{
			System.out.println("数据链连接失败=====bind=====");	
		}
		return map;
	}
}
