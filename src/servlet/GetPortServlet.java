package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.commons.lang.ArrayUtils;

import controller.bind;
import controller.register;



import cn.gov.cnis.cssn.wssort.xsd.QueryResult;
import cn.gov.cnis.cssn.wssort.xsd.StandardPush;
import cn.gov.cnis.cssn.wssort.xsd.StandardTracking;
import cn.gov.cnis.cssn.wssort.xsd.TopicCategory;
import cn.gov.cnis.cssn.wssort.xsd.UserAccountInfo;

public class GetPortServlet extends HttpServlet {

	public GetPortServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();

		
		PrintWriter out = response.getWriter();
		
		String returnType = request.getParameter("returnType");
		String returnPackage = "cn.gov.cnis.cssn.wssort.xsd."+ returnType;
		
		//初始化接口密码和账户
		ResourceBundle Bundle = ResourceBundle.getBundle("config.AppConfig");
		String password = Bundle.getString("password");
		String orgLoginName = Bundle.getString("orgLoginName");
		String ukeyId = Bundle.getString("ukeyId");
		String orgCode = Bundle.getString("orgCode");
		
		String[] parameterList1={orgLoginName,password,ukeyId,orgCode};
		
		//获取并组合前端发送过来的数据	
		Object[] parameterList2 =request.getParameterValues("parameterList");
		Object[] parameterList = (Object[]) ArrayUtils.addAll(parameterList1, parameterList2);	
		
		
		String portName = request.getParameter("portName");
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();
		
		EndpointReference targetEPR = new EndpointReference(Bundle.getString("ENDPOINTREFERENCE_CSSN"));
		options.setTo(targetEPR);
		options.setTimeOutInMilliSeconds(100000L);
		
		
		QName opAddEntry = new 	QName(Bundle.getString("WS_QNAME"),portName);
			
		Class[] classes;
		switch(returnType){
		case "base" : 
			classes = new Class[] { String.class };
			String returnValue ;
			returnValue = (String)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);//���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry, args, classes)[0]);				
			out.write(returnValue);
			break;
		case "getStandardDetail"://获取详情页面
			Map<String,Object> regetStandardDetail = new HashMap<String,Object>();
			regetStandardDetail.put("star", "black");
			
			classes = new Class[] { String.class };
			String returngetStandardDetail ;
			returngetStandardDetail = (String)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);
			regetStandardDetail.put("data", returngetStandardDetail);
			
			if(session.getAttribute("ID")!=null){//判断ＩＤ是否为空,如果不为空通过	
				String[] getStandardDetail_ParameterList  = {"lkscn$200301","9ijnmko0","95c3f3e5cf03a6a8fb7161f72a8b1f2f","200301",null,"1","9999"};
				getStandardDetail_ParameterList[4] = (String) session.getAttribute("ID");
					classes = new Class[] { StandardTracking[].class };
					QName opAddEntry1 = new 	QName(Bundle.getString("WS_QNAME"),"getUserStandardTracking");
					StandardTracking[] standardTracking;
					standardTracking = (StandardTracking[]) (serviceClient.invokeBlocking(
							opAddEntry1, getStandardDetail_ParameterList, classes)[0]);
					
					
					JSONArray JSON_standardTracking = JSONArray.fromObject(standardTracking);
					Object[] JSONArray_standardTracking = JSON_standardTracking.toArray();
					
					System.out.println("开始遍历跟踪列表");
					for(int i = 0; i < JSONArray_standardTracking.length; i++){
						System.out.println(JSONArray_standardTracking[i]);
						
						if(((JSONObject) JSONArray_standardTracking[i]).getString("a001").equals(parameterList[4])){//如果跟踪列表中有数据则进入
							System.out.println("收藏过的");
							regetStandardDetail.put("star", "light");
							break;
						}
						
					}
					
					
					//System.out.println(JSONArray.fromObject(standardTracking));
					System.out.println("parameterList------");
					System.out.println(JSONArray.fromObject(parameterList));
				
				//["lkscn$200301","9ijnmko0","95c3f3e5cf03a6a8fb7161f72a8b1f2f","200301","obFKEt1U4KmC2E7Cht75WZJHJch8","1","10"]
				
			}
			
			out.write(JSONObject.fromObject(regetStandardDetail).toString());
			break;
		case "setUserTracking":	
			System.out.println("=========setUserTracking==========");
			if(session.getAttribute("ID")!=null){
				String[] setUserTrackinglist1={orgLoginName,password,ukeyId,orgCode};
				Object[] setUserTrackinglist2 =request.getParameterValues("parameterList");
				setUserTrackinglist2[0] = session.getAttribute("ID");
				//setUserTrackinglist2[0] = "obFKEt1U4KmC2E7Cht75WZJHJch8";
				Object[] setUserTrackingList = (Object[]) ArrayUtils.addAll(setUserTrackinglist1, setUserTrackinglist2);
				classes = new Class[] { String.class };
				String returnSetUserTrackingValue ;
				returnSetUserTrackingValue = (String)(serviceClient.invokeBlocking(opAddEntry, setUserTrackingList, classes)[0]);
				out.write(returnSetUserTrackingValue);
			}else{
				out.write("bind");
			}
			break;
		case "QueryResult":
			classes = new Class[] { QueryResult.class };
			QueryResult returnValue1 ;
			returnValue1 = (QueryResult)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);
			out.write(JSONArray.fromObject(returnValue1).toString());
			break;
		case "StandardPush": 
			if(session.getAttribute("ID") == null){
			out.write("false");
			} else {
			parameterList[4]  = session.getAttribute("ID");
			classes = new Class[] { StandardPush[].class };
			StandardPush[] standardPush;
			standardPush = (StandardPush[]) (serviceClient.invokeBlocking(
					opAddEntry, parameterList, classes)[0]);
			out.write(JSONArray.fromObject(standardPush).toString());
		}
		break;
		case "StandardTracking": 
			if(session.getAttribute("ID") == null){
				out.write("false");
			} else {
				parameterList[4]  = session.getAttribute("ID");
				classes = new Class[] { StandardTracking[].class };
					StandardTracking[] standardTracking;
					standardTracking = (StandardTracking[]) (serviceClient.invokeBlocking(
							opAddEntry, parameterList, classes)[0]);
					out.write(JSONArray.fromObject(standardTracking).toString());
					System.out.println("parameterList------");
					System.out.println(JSONArray.fromObject(parameterList));
			}
			break;
		case "TopicCategory":
			classes = new Class[] { TopicCategory[].class };
			TopicCategory[] TopicCate;
			TopicCate = (TopicCategory[]) (serviceClient.invokeBlocking(
					opAddEntry, parameterList, classes)[0]);
			out.write(JSONArray.fromObject(TopicCate).toString());
			break;
		case "UserAccountInfo": //个人中心获取基本信息	
		if(session.getAttribute("ID") == null){
				out.write("false");
		} else{
				Object[] UserID = { session.getAttribute("ID") };
				String userInfoStr = (String) session.getAttribute("userInfo");
				JSONObject userInfoJO = JSONObject.fromObject(userInfoStr);
				String url = userInfoJO.getString("headimgurl");
				String nickname = userInfoJO.getString("nickname");
								Map<String, Object> userInfomation = new HashMap<String, Object>();
				userInfomation.put("url", url);
				userInfomation.put("nickname", nickname);
				Object[] UserAccountInfoList = (Object[]) ArrayUtils.addAll(
						parameterList1, UserID);
				classes = new Class[] { UserAccountInfo[].class };
				UserAccountInfo[] userInfo;
				userInfo = (UserAccountInfo[]) (serviceClient.invokeBlocking(
						opAddEntry, UserAccountInfoList, classes)[0]);
				userInfomation.put("userInfo", userInfo);
				out.write(JSONArray.fromObject(userInfomation).toString());
			}
			break;
		case "base_loginName":
			
			classes = new Class[] { String.class };
			String returnName;
			returnName = (String) (serviceClient.invokeBlocking(opAddEntry,
					parameterList, classes)[0]);

			
			if(returnName.equals("true")){
				System.out.println("_!_!_!");
				System.out.println(parameterList2[0].toString());
				Boolean returnBind = bind.binding(parameterList2[0].toString(), session);
				System.out.println("boolean---------");
				System.out.println(returnBind.toString());
				out.write(returnBind.toString());
			}
			out.write(returnName);
			
			break;
		case "base_register":
			
			Boolean returnRgister = register.registering(session);
			System.out.println("boolean---------");
		
			out.write(returnRgister.toString());
		
		break;
		case "flag": // 跟踪标志改变
			if(portName == "setUserStandardPushFlag"){
				if(session.getAttribute("ID") == null){
					out.write("false");
				} else {
					parameterList[0]  = session.getAttribute("ID");
				}
			}
			classes = new Class[] { String.class };
			String flagType ;
			flagType = (String)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);			
			out.write(flagType);
			break;
		default:out.write( "noReturnType");
		
		}

		out.flush();
		out.close();
	}
		

	public void init() throws ServletException {
		// Put your code here
	}

}
