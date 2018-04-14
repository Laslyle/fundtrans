package com.mybank.fundtrans.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybank.fundtrans.dao.FundDao;
import com.mybank.fundtrans.dao.FundDaoJDBCImpl;
import com.mybank.fundtrans.domain.Fund;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientServlet() {
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
		FundDao fundDao = new FundDaoJDBCImpl();
		String type = request.getParameter("type");
		switch (type) {
		case "1":
			request.getRequestDispatcher("Client/Client_add.jsp").forward(request, response);
			break;

		case "2":
			request.getRequestDispatcher("Client/Client_List.jsp").forward(request, response);
			break;
		case "3":
			
			request.getRequestDispatcher("Client/Client_List.jsp").forward(request, response);
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

	private void getClientRequestPar(HttpServletRequest request ) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		   request.setCharacterEncoding("UTF-8");
		   /*
		   String idcard=null;
		   String idcard, String name, String sex, Integer phone, String addredss, String email, String hobby,
			Date createTime
		   if(request.getParameter("idcard")!=null)
			   idcard=request.getParameter("idcard");
			 String name=request.getParameter("ClientName");
			String priceString=request.getParameter("ClientPhone"); 
			Double price =Double.parseDouble(priceString); 
			 String Des=request.getParameter("fundDes"); 
			String status=request.getParameter("fundStatus"); 
			Fund fund=new Fund(id,name,Des,price,status,new Date()); 
		   
		   
	         return fund;*/
	}
	
}
