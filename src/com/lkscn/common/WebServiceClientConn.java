package com.lkscn.common;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.javen.course.util.passCheck;

/**
 * 接口服务链接设置
 * 
 * @author hub
 * @version 1.1
 */

public class WebServiceClientConn {
	public RPCServiceClient getServiceClient() {
		RPCServiceClient serviceClient = null;
		try {
			serviceClient = new RPCServiceClient();
			Options options = serviceClient.getOptions();
			EndpointReference targetEPR = new EndpointReference(
					passCheck.ENDPOINTREFERENCE_CSSN);
			// "http://www.cssn.net.cn/services/cniswsbase?wsdl");
			options.setTo(targetEPR);
			options.setTimeOutInMilliSeconds(100000L);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		return serviceClient;
	}

	public QName getTheMethod(String method) {
		return new QName(passCheck.WS_QNAME, method);
	}
}
