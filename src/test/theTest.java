package test;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.javen.course.util.HttpUtil;
import com.javen.course.util.createRandom;
import com.javen.course.util.passCheck;
import com.lkscn.common.WebServiceClientConn;

import controller.TemBind;
import controller.getLoginName;
import controller.register;



public class theTest {

	/** 
	 * 方法简述：
	 * @author 常景胜
	 * @param args 
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		HttpSession session = null;
		// TODO Auto-generated method stub
/*		String[] a = ["1","2"];*/
		
		/*HttpUtil.getUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx67dfa21760b77ef6&redirect_uri=http://mobile.cssn.net.cn/standard/servlet/UserLoginStatus&response_type=code&scope=snsapi_base&state=STATE&connect_redirect=1#wechat_redirect");
	*/	
		getLoginName.getLoginNameing(session);
		
/*		String[] arg = {"111"};
		try {
			if(loginNameCheck()){
				register();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}
	
	public static void register() throws Exception{
		// TODO Auto-generated method stub 
		String[] a = new String[50];
/*		String openID = (String) session.getAttribute("openid");*/
		String openID = "obFKEt1U4KmC2E7Cht75WZJHJch8"; 
		a[0] = openID; 
		a[1] = openID;
		try {
			WebServiceClientConn serviceClientConn = new WebServiceClientConn();
			RPCServiceClient serviceClient = serviceClientConn.getServiceClient();
			
			
			QName opAddEntry = serviceClientConn.getTheMethod("register");
			
			Class[] classes = new Class[] { String.class };
			
			
			Object[] opaddentryArgs = new Object[] { passCheck.orgLoginName,
					passCheck.password, passCheck.ukeyId, passCheck.orgCode,
					openID, createRandom.createRandomCharData(16),"玄崖熊","国家标准馆", "619667384@qq.com",
					"北京市", "北京市", "北京市海淀区", "100001", "18983663542",
					"010-11111111", "13811111111", "身份证", "522131199502070012",
					"男", "2014-11-13", "本科" };
			
			
			String str = ((String) serviceClient.invokeBlocking(opAddEntry,
					opaddentryArgs, classes)[0]);
			
			
			System.out.println("=====注册是否成功=====");
			System.out.println(str);
			
			
			if(str.equals("1")){
				System.out.println("注册成功");
			}else{
				System.out.println("注册失败");
			}

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Boolean loginNameCheck() throws Exception {
		Boolean getreturn = false;
		try {
			WebServiceClientConn serviceClientConn = new WebServiceClientConn();
			RPCServiceClient serviceClient = serviceClientConn
					.getServiceClient();
			QName opAddEntry = serviceClientConn.getTheMethod("loginNameCheck");
			Object[] opaddentryArgs = new Object[] { passCheck.orgLoginName,
					passCheck.password, passCheck.ukeyId, passCheck.orgCode,
					"obFKEt1U4KmC2E7Cht75WZJHJch8" };
			Class[] classes = new Class[] { Boolean.class };
			getreturn = (Boolean) serviceClient.invokeBlocking(opAddEntry,
					opaddentryArgs, classes)[0];
			System.out.println("验证是否通过：" + getreturn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getreturn;
	}


}
