package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.javen.course.util.createRandom;
import com.javen.course.util.passCheck;
import com.lkscn.common.WebServiceClientConn;

import DataBase.ConnectOracle;




/**
 * @author joseber
 * 
 * 建立临时的账户
 *
 */
public class register {
	public static Boolean registering(HttpSession session){
		// TODO Auto-generated method stub 
					String[] a = new String[50];
					String openID = (String) session.getAttribute("openid");
					a[0] = openID; 
					a[1] = openID;
					
					
					
					WebServiceClientConn serviceClientConn = new WebServiceClientConn();
					RPCServiceClient serviceClient = serviceClientConn.getServiceClient();
						
						
					QName opAddEntry = serviceClientConn.getTheMethod("register");
						
					Class[] classes = new Class[] { String.class };
						
						
					Object[] opaddentryArgs = new Object[] { passCheck.orgLoginName,
								passCheck.password, passCheck.ukeyId, passCheck.orgCode,
								openID, createRandom.createRandomCharData(16), "临时账户", "", "",
								"", "", "", "", "",
								"", "", "", "",
								"", "", "" };
						
						
					String str;
					try {
						str = ((String) serviceClient.invokeBlocking(opAddEntry,
								opaddentryArgs, classes)[0]);
						
						System.out.println("=====注册是否成功=====");
						System.out.println(str);
						
						
						if(str.equals("1")){
							TemBind.temBinding(session);
							System.out.println("注册成功");
							return true;
						}else{
							System.out.println("注册失败");
							return false;
						}
					} catch (AxisFault e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					
					

				
	}
}

				
				
				
				
				
/*		ConnectOracle connectDataBase = new ConnectOracle();
		
		if(connectDataBase.getData() != null){
			try {
				Statement statement = connectDataBase.getData().createStatement();
				String sql = "update t_nv_user set open_id = '"+args[0]+"', source_link = 'weixin', open_check = 1 where login_name = '"+args[1]+"'";
				System.out.println(sql);
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
		return true;*/
		
		
		
		
		
