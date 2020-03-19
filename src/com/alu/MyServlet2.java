package com.alu;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/shenzhen"},name="myServlet2",
initParams = {@WebInitParam(name="hubei2",value = "wuhan"),
@WebInitParam(name="beijing3",value = "tianshi")},
loadOnStartup = 2)//servlet 创建时启动
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	public MyServlet2() {
		System.out.println("启动了 3");
		// TODO Auto-generated constructor stub
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html,charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println(this.getServletName());
		Enumeration<String> names=this.getInitParameterNames();
		while (names.hasMoreElements()) {
			response.getWriter().append(this.getInitParameter(names.nextElement()));
			
		}
		
		
	}

}
