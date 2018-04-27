package pl.javastart.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter 
{


	public void destroy() 
	{
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("Authentication filter");
		HttpServletRequest httpRequest =(HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(false);
		
		if (session != null && session.getAttribute("username")!=null)
		{
			System.out.println("Session & user are valid");
			chain.doFilter(httpRequest, response);
		}
		else
		{
			System.out.println("Session or user are invalid");
			HttpServletResponse httpResponse =(HttpServletResponse) response;
			httpResponse.sendRedirect("login.jsp");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
