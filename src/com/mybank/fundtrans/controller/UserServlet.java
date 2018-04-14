package com.mybank.fundtrans.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mybank.fundtrans.dao.FundDao;
import com.mybank.fundtrans.dao.FundDaoJDBCImpl;
import com.mybank.fundtrans.dao.UserDao;
import com.mybank.fundtrans.dao.UserDaoJDBCImpl;
import com.mybank.fundtrans.domain.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		UserDao userDao=new UserDaoJDBCImpl();
		String type=request.getParameter("type");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		switch (type) {
		case "1":
			if(userDao.findIt(userName, password)){
				HttpSession session=request.getSession();
				session.setAttribute("user", userName);
				request.getRequestDispatcher("index.jsp").forward(request, response);
					}
			else {
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			break;
		

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
