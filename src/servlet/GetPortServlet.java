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

import DataBase.theMySQL;


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
		System.out.println("我是过去的GetPort:"+session.getAttribute("AAA"));
		session.setAttribute("AAA", "hello yeah!!!");
		System.out.println("我是之后的GetPort:"+session.getAttribute("AAA"));
		System.out.println("======================");
		
		PrintWriter out = response.getWriter();
		
		String returnType = request.getParameter("returnType");
		String returnPackage = "cn.gov.cnis.cssn.wssort.xsd."+ returnType;
		
		//��ȡconfig���
		ResourceBundle Bundle = ResourceBundle.getBundle("config.AppConfig");
		String password = Bundle.getString("password");
		String orgLoginName = Bundle.getString("orgLoginName");
		String ukeyId = Bundle.getString("ukeyId");
		String orgCode = Bundle.getString("orgCode");
		
		String[] parameterList1={orgLoginName,password,ukeyId,orgCode};
		
		//��ȡ���ݲ���
		
		Object[] parameterList2 =request.getParameterValues("parameterList");
		
/*		List lists = new ArrayList(Arrays.asList(parameterList1));
		lists.addAll(JSONArray.fromObject(parameterList2));
		Object[] parameterList = lists.toArray();
		
		
*/
		
		Object[] parameterList = (Object[]) ArrayUtils.addAll(parameterList1, parameterList2);	
		
		
		String portName = request.getParameter("portName");//��ȡ���õĽӿ���	
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();// ָ������webservice��URL
		
		EndpointReference targetEPR = new EndpointReference(Bundle.getString("ENDPOINTREFERENCE_CSSN"));
		options.setTo(targetEPR);
		options.setTimeOutInMilliSeconds(100000L);
		
		//funcNameΪ��Ҫ���õķ������
		QName opAddEntry = new 	QName(Bundle.getString("WS_QNAME"),portName);
			
		Class[] classes;
		switch(returnType){
		case "base" : 
			classes = new Class[] { String.class };
			String returnValue ;//����ֵ����ݷ�����ͬ�������ķ���ֵ����
			returnValue = (String)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);//���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry, args, classes)[0]);				
			out.write(returnValue);
			break;
		case "setUserTracking":	
			System.out.println("=========setUserTracking==========");
			if(session.getAttribute("ID")!=null){
				String[] setUserTrackinglist1={orgLoginName,password,ukeyId,orgCode};
				Object[] setUserTrackinglist2 =request.getParameterValues("parameterList");
				setUserTrackinglist2[0] = session.getAttribute("ID");
				Object[] setUserTrackingList = (Object[]) ArrayUtils.addAll(setUserTrackinglist1, setUserTrackinglist2);
				classes = new Class[] { String.class };
				String returnSetUserTrackingValue ;
				returnSetUserTrackingValue = (String)(serviceClient.invokeBlocking(opAddEntry, setUserTrackingList, classes)[0]);//���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry, args, classes)[0]);				
				out.write(returnSetUserTrackingValue);
			}else{
				out.write("bind");
			}
			break;
		case "Ccs": break;
		case "DownInfo": break;
		case "ElecInfo": break;
		case "ExtensionMapper": break;
		case "Ics": break;
		case "OrderInfo": break;
		case "OrderItem": break;
		case "OrderServFee": break;
		case "Pagination": break;
		case "QueryResult": //�߼���ѯ	
			classes = new Class[] { QueryResult.class };
			QueryResult returnValue1 ;//����ֵ����ݷ�����ͬ�������ķ���ֵ����
			returnValue1 = (QueryResult)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);//���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry, args, classes)[0]);				
			out.write(JSONArray.fromObject(returnValue1).toString());
			break;
		case "StanardSort": break;
		case "StandardElecInfo": break;
		case "StandardList": break;
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
		case "StandardSort": break;
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
		case "StandardWrap": break;
		case "TDStockAvisoItem": break;
		case "ThiOrderItemData": break;
		case "ThiOrderWrap": break;
		case "TNvOrderValidationItem": break;
		case "TopicCategory": // ����ר��
			classes = new Class[] { TopicCategory[].class };
			TopicCategory[] TopicCate;// ����ֵ����ݷ�����ͬ�������ķ���ֵ����
			TopicCate = (TopicCategory[]) (serviceClient.invokeBlocking(
					opAddEntry, parameterList, classes)[0]);// ���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry,
															// args,
															// classes)[0]);
			out.write(JSONArray.fromObject(TopicCate).toString());
			break;
		case "TrsStandard": break;
		case "UserAccountInfo": 	
			if(session.getAttribute("ID") == null){
				out.write("false");
			} else {
				Object[] UserID = { session.getAttribute("ID") };
				String userInfoStr = (String) session.getAttribute("userInfo");
				JSONObject userInfoJO = JSONObject.fromObject(userInfoStr);
				String url = userInfoJO.getString("headimgurl");

				Map<String, Object> userInfomation = new HashMap<String, Object>();
				userInfomation.put("url", url);
				// Object[] UserID = {"xiaoya_0822"};
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
		case "UserAudit": break;
		case "UserAuditItem": break;
case "base_loginName":
			
			classes = new Class[] { String.class };
			String returnName;
			returnName = (String) (serviceClient.invokeBlocking(opAddEntry,
					parameterList, classes)[0]);
			
			if(returnName == "true"){
				System.out.println("_!_!_!");
				System.out.println(parameterList2[0].toString());
				Boolean returnBind = bind.binding(parameterList2[0].toString(), session);
				System.out.println("boolean---------");
				System.out.println(returnBind.toString());
				out.write(returnBind.toString());
			}
			out.write(returnName);
			
			break;
		default:out.write( "û���ҵ�returnType");
		
		}

		out.flush();
		out.close();
	}
		

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
