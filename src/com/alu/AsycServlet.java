package com.alu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/AsycServlet", asyncSupported=true)
public class AsycServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html,charset=ISO8859-1");
		PrintWriter out = resp.getWriter();
		out.write("开始<br>");
		
		AsyncContext ac =	req.startAsync();
		
		ac.start(new SumThread(ac));
		ac.setTimeout(30000);
		ac.addListener(new MyAsyncListener());
		
	
	resp.getWriter().write("结束<br>");
	}

}
