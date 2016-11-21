package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import javax.servlet.http.HttpSession;

import DataBase.ConnectOracle;

public class bind {
	
	/** 
	 * 方法简述：绑定账户
	 * @author 常景胜
	 * @param args:openid
	 * @param session
	 * @return 
	 * 
	 */
	public static boolean binding(String args,HttpSession session){
		
		String openid = (String) session.getAttribute("openID");
		//连接数据库
		ConnectOracle connectDataBase = new ConnectOracle();
		
		if(connectDataBase.getData() != null){
			if(openid == null){
				return false;
			}
			try {
				Statement statement = connectDataBase.getData().createStatement();
				String Dsql = "DELETE FROM t_nv_user WHERE OPEN_ID = '"+openid+"'";
				String sql = "update t_nv_user set open_id = '"+openid+"', source_link = 'weixin', open_check = 1 where login_name = '"+args+"'";
				System.out.println(sql);
				ResultSet Drs = statement.executeQuery(Dsql);
		        ResultSet rs = statement.executeQuery(sql);
		 		rs.close();
		 		connectDataBase.getData().close();
		 		return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("出现异常");
				return false;
			}
		}else{
			System.out.println("数据链连接失败=====bind=====");	
		}




		return false;
		
		
	}
}
