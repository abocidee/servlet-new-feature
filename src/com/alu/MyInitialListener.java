package com.alu;



import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyInitialListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		 ServletContext servletContext = sce.getServletContext();
		Dynamic dynamic = servletContext.addServlet("DynamicServlet", "com.alu.DynamicServlet");
		 dynamic.addMapping("/DynamicServlet");
		 dynamic.setLoadOnStartup(1);
		 dynamic.setInitParameter("hello", "world");
		 
		 javax.servlet.FilterRegistration.Dynamic filter = servletContext.addFilter("DynamicFilter", "com.alu.DynamicFilter");
		
		 filter.addMappingForUrlPatterns( EnumSet.of(DispatcherType.REQUEST), true, "/*");
		 
		 servletContext.addListener("com.alu.DynamicListener");
		 
	}

}
