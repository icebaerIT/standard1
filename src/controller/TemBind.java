package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import DataBase.ConnectOracle;

 
/**
 * @author joseber
 * 绑定临时账户
 *
 */
public class TemBind {
public static boolean temBinding(HttpSession session,String ID){
		System.out.println("绑定临时账号");
		String openid = (String) session.getAttribute("openID");
		//连接数据库
		ConnectOracle connectDataBase = new ConnectOracle();
		
		if(connectDataBase.getData() != null){
			try {
				Statement statement = connectDataBase.getData().createStatement();
				String sql = "update t_nv_user set open_id = '"+openid+"', source_link = 'weixin', open_check = 0 where login_name = '"+ID+"'";
				System.out.println(sql);
		        ResultSet rs = statement.executeQuery(sql);
		 		rs.close();
		 		connectDataBase.getData().close();
		 		getLoginName.getLoginNameing(session);//绑定完成重新读取数据
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
