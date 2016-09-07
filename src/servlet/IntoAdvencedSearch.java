package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import com.javen.course.util.HttpUtil;

import controller.getLoginName;

public class IntoAdvencedSearch extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public IntoAdvencedSearch() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		ResourceBundle Bundle = ResourceBundle.getBundle("config.AppConfig");
		if(session.getAttribute("ID") == null){
			String get_access_token_url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"; 
			String get_userinfo="https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
	
			// 将请求、响应的编码均设置为UTF-8（防止中文乱码） 
			request.setCharacterEncoding("UTF-8"); 
			response.setCharacterEncoding("UTF-8");
			
			String code=request.getParameter("code");
			System.out.println("我是获取用户信息的get方法");
			System.out.print("我是code:");
			System.out.println(code);
			System.out.print("我是state:");
			System.out.println(request.getParameter("state"));
			
			get_access_token_url=get_access_token_url.replace("APPID", "wx67dfa21760b77ef6"); 
			get_access_token_url=get_access_token_url.replace("SECRET", "b907671e3beeb7722371f8b6b8669e82"); 
			get_access_token_url=get_access_token_url.replace("CODE", code);
			String json=HttpUtil.getUrl(get_access_token_url);
			System.out.print("我是第一次:");
		    System.out.println(json);
			
			JSONObject jsonObject=JSONObject.fromObject(json); 
			
			String access_token=jsonObject.getString("access_token"); 
			String openid=jsonObject.getString("openid");
			
			get_userinfo=get_userinfo.replace("ACCESS_TOKEN", access_token); 
			get_userinfo=get_userinfo.replace("OPENID", openid); 
			
			String userInfoJson=HttpUtil.getUrl(get_userinfo); 
			System.out.print("我是第二次:");
			System.out.println(userInfoJson);
			JSONObject userInfoJO=JSONObject.fromObject(userInfoJson);
			session.setAttribute("userInfo", userInfoJson);
			session.setAttribute("openID",userInfoJO.getString("openid"));
			
			//查看此openid是否已经注册
			String a = userInfoJO.getString("openid");
			
			if(userInfoJO.getString("openid") != null){//如果openid取到了
					
					Map<String, Object> map = getLoginName.getLoginNameing(session);
					
					if(map.get("login_name") == null){
	/*					response.sendRedirect(Bundle.getString("account"));*/
	/*					response.sendRedirect(Bundle.getString("weixinOpenID"));*/
						System.out.println("用户未绑定=========");
					}else{
						System.out.println("用户已经绑定");
	/*					session.setAttribute("ID",map.get("login_name"));*/
	/*					response.sendRedirect(Bundle.getString("personCenter"));*/
					}
					session.setAttribute("ID",map.get("login_name"));
					response.sendRedirect(Bundle.getString("advencedSearch"));
			}else{
				System.out.println("取openid时出错了");
			}
		}else{
			response.sendRedirect(Bundle.getString("advencedSearch"));
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
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
