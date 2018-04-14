package com.mybank.fundtrans.controller;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.descriptor.web.LoginConfig;

import com.mybank.fundtrans.domain.User;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
,urlPatterns = { "/*" })
public class loginFilter implements Filter {
	private String logPage="/Login.jsp";


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//		String url = httpServletRequest.getRequestURI();
//		if(url != null && url.endsWith(".jsp")) {
//			httpServletResponse.sendRedirect(httpServletRequest.getContextPath());
//			return;
//		}
//		chain.doFilter(request, response);
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String request_uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String uri = request_uri.substring(contextPath.length());
		if (req.getSession().getAttribute("user") == null) {
			if (uri.equals(logPage) || request_uri.indexOf("css/") > 0
					|| request_uri.indexOf("images/") > 0
					|| request_uri.indexOf("scripts/") > 0
					|| uri.equals("/Uservlet")) {
				chain.doFilter(request, response);
				return;
			}
			else
			{
				req.getRequestDispatcher(logPage).forward(req, res);
				//res.sendRedirect("Login.jsp");
				//chain.doFilter(request, response);
			}
		}
		else chain.doFilter(request, response);
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
