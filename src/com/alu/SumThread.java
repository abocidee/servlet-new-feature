package com.alu;



import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServletRequest;

public class SumThread implements Runnable {
    private AsyncContext  ac;
    
	public SumThread(AsyncContext ac) {
	this.ac = ac;
}
	@Override
	public void run() {
	HttpServletRequest request=	(HttpServletRequest) ac.getRequest();
	
	

		
		
		
	int	sum =0;
		// TODO Auto-generated method stub

        for (int i = 0; i < 10; i++) {
			sum+=i;
		}
        request.getSession().setAttribute("sum", sum);;
        System.out.println(sum);
        ac.dispatch("/email.jsp");
		
	
	}
}
