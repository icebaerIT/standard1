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
			String get_access_token_url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code"; //微信获取openid接口地址
			String get_userinfo="https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";//微信获取用户详细信息接口地址
	
			// 将请求、响应的编码均设置为UTF-8（防止中文乱码） 
			request.setCharacterEncoding("UTF-8"); 
			response.setCharacterEncoding("UTF-8");
			
			String code=request.getParameter("code");//获取openid密码
			
			//将获取到的密码填入接口中
			get_access_token_url=get_access_token_url.replace("APPID", "wx67dfa21760b77ef6"); //公众号接口调用ID
			get_access_token_url=get_access_token_url.replace("SECRET", "b907671e3beeb7722371f8b6b8669e82");//公众号接口调用密码
			get_access_token_url=get_access_token_url.replace("CODE", code);
			String json=HttpUtil.getUrl(get_access_token_url);
			
			JSONObject jsonObject=JSONObject.fromObject(json); //格式转化
			
			//获取openid
			String access_token=jsonObject.getString("access_token"); 
			String openid=jsonObject.getString("openid");
			
			//获取openid填入用户详情接口中
			get_userinfo=get_userinfo.replace("ACCESS_TOKEN", access_token); 
			get_userinfo=get_userinfo.replace("OPENID", openid);
			
			
			//获取并保存用户信息数据和openid
			String userInfoJson=HttpUtil.getUrl(get_userinfo); 
			JSONObject userInfoJO=JSONObject.fromObject(userInfoJson);
			session.setAttribute("userInfo", userInfoJson);
			session.setAttribute("openID",userInfoJO.getString("openid"));
			
			//查看此openid是否已经注册
			if(userInfoJO.getString("openid") != null){//如果openid取到了
					
					Map<String, Object> map = getLoginName.getLoginNameing(session);	
					if(map.get("login_name") == null){
						System.out.println("用户未绑定=========");
					}else{
						System.out.println("用户已经绑定");
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


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
