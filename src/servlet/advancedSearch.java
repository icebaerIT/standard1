package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;

import net.sf.json.JSONArray;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import cn.gov.cnis.cssn.wssort.xsd.QueryResult;

public class advancedSearch extends HttpServlet {

	public advancedSearch() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
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
/*		HttpSession session = request.getSession();
		System.out.println("我是ID:"+session.getAttribute("AAA"));*/
		PrintWriter out = response.getWriter();
		
		String returnType = request.getParameter("returnType");//��ȡ����ֵ����
		
		//��ȡconfig���
		ResourceBundle Bundle = ResourceBundle.getBundle("config.AppConfig");
		String password = Bundle.getString("password");
		String orgLoginName = Bundle.getString("orgLoginName");
		String ukeyId = Bundle.getString("ukeyId");
		String orgCode = Bundle.getString("orgCode");
		
		//��ȡ���ݲ���
		String portName = request.getParameter("portName");//��ȡ���õĽӿ���	

		String[] parameterList1={orgLoginName,password,ukeyId,orgCode};
		String[] parameterList2 = request.getParameterValues("parameterList");
		int length1 = parameterList1.length;
		int length2 = parameterList2.length;
		Object[] parameterList = new Object[length1 + length2];
		for (int i = 0; i < length1; i++) {
			parameterList[i] = parameterList1[i];
		}
		for (int i = length1; i <  length1 + length2; i++) {
			if (i - length1 == 2 && !(parameterList2[2].equals(""))) {
				parameterList[i] = parameterList2[2].split(",");
			} else if(i - length1 == 3 && !(parameterList2[3].equals(""))){
				parameterList[i] = parameterList2[3].split(",");
			}else if(i - length1 == 4 && !(parameterList2[4].equals(""))){
				parameterList[i] = parameterList2[4].split(",");
			}else{
				parameterList[i] = parameterList2[i - length1];
			}
		}
		System.out.println(JSONArray.fromObject(parameterList));
		
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();// ָ������webservice��URL
		
		EndpointReference targetEPR = new EndpointReference(Bundle.getString("ENDPOINTREFERENCE_CSSN"));
		options.setTo(targetEPR);
		options.setTimeOutInMilliSeconds(100000L);
		
		//funcNameΪ��Ҫ���õķ������
		QName opAddEntry = new 	QName(Bundle.getString("WS_QNAME"),portName);
		Class[] classes = new Class[] { QueryResult.class };
		QueryResult returnValue1 ;//����ֵ����ݷ�����ͬ�������ķ���ֵ����
		returnValue1 = (QueryResult)(serviceClient.invokeBlocking(opAddEntry, parameterList, classes)[0]);//���ýӿڣ�����ֵ��object������Ҫ����ת��ʱ��ֱ������ǰ�������Ҫת�������ͣ���(String)(serviceClient.invokeBlocking(opAddEntry, args, classes)[0]);				
		out.write(JSONArray.fromObject(returnValue1).toString());
		out.flush();
		out.close();
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
