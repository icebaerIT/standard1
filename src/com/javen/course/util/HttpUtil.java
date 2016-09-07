package com.javen.course.util;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
	public static String getUrl(String url) throws IOException{
		HttpClient client = new HttpClient();   
	      // 设置代理服务器地址和端口        
	  
	      //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);   
	      // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https   
	      HttpMethod method=new GetMethod(url);  
	      //使用POST方法  
	      //HttpMethod method = new PostMethod("http://java.sun.com");  
	      client.executeMethod(method);  
	  
	      //打印服务器返回的状态  
/*	      System.out.println("打印服务器返回的状态 =======");
	       System.out.println(method.getStatusLine());
	       System.out.println("=================");*/
	      //打印返回的信息  
	      
	      String xyz = new String(method.getResponseBody(), "UTF-8");
	      System.out.println(xyz);
	      //释放连接  
	      method.releaseConnection();
	      
	      return xyz;
	   }  
 }

