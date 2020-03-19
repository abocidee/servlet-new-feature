package com.alu;

import java.io.IOException;

import javax.servlet.AsyncEvent;

public class MyAsyncListener implements javax.servlet.AsyncListener {

	@Override
	public void onComplete(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
       System.out.println("已完成");
	}

	@Override
	public void onError(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
     System.out.println("出错了");
	}

	@Override
	public void onStartAsync(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTimeout(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
    System.out.println("已超时");
	}

}
