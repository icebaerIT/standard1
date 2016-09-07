package com.javen.course.util;

import java.util.ResourceBundle;

public class passCheck {
	static ResourceBundle Bundle = ResourceBundle.getBundle("config.AppConfig");
	public static String ENDPOINTREFERENCE_CSSN = Bundle.getString("ENDPOINTREFERENCE_CSSN");
	public static String WS_QNAME = Bundle.getString("WS_QNAME");
	public static String password = Bundle.getString("password");
	public static String orgLoginName = Bundle.getString("orgLoginName");
	public static String ukeyId = Bundle.getString("ukeyId");
	public static String orgCode = Bundle.getString("orgCode");
}
