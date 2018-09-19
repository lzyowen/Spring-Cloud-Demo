package com.zuul;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulPreFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {

	    System.out.println("+++++++++++ZuulPreFilter-1 is invoked ++++++++++++++"+LocalTime.now());

		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}
	
	

}
