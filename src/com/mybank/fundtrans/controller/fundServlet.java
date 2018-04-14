package com.mybank.fundtrans.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybank.fundtrans.dao.FundDao;
import com.mybank.fundtrans.dao.FundDaoJDBCImpl;
import com.mybank.fundtrans.domain.Fund;

/**
 * Servlet implementation class fundServlet
 */
@WebServlet("/fundServlet")
public class fundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fundServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		FundDao fundDao=new FundDaoJDBCImpl();
		String type=request.getParameter("type");
		switch (type) {
		case "1":
			Fund fund1=getFundRequestPar(request);
			fundDao.insert(fund1);
			request.getRequestDispatcher("fund/fund_list.jsp").forward(request, response);
			break;
		case "2":
			request.getRequestDispatcher("fund/fund_update.jsp").forward(request, response);
			break;
		case "3":
			fundDao.delete(Integer.parseInt(request.getParameter("id")));
			request.getRequestDispatcher("fund/fund_list.jsp").forward(request, response);
			break;

		case "4":
			Fund fund2=getFundRequestPar(request);
			fundDao.update(fund2);
			request.getRequestDispatcher("fund/fund_list.jsp").forward(request, response);

			break;
		case "5":
			request.getRequestDispatcher("fund/fund_add.jsp").forward(request, response);
			break;
		case "6":
			request.getRequestDispatcher("fund/fund_list.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	   private Fund getFundRequestPar(HttpServletRequest request ) throws UnsupportedEncodingException {
			// TODO Auto-generated method stub
			   request.setCharacterEncoding("UTF-8");
			   Integer id=0;
			   if(request.getParameter("id")!=null)
				   id=Integer.parseInt(request.getParameter("id"));
				 String name=request.getParameter("fundName");
				String priceString=request.getParameter("fundPrice"); 
				Double price =Double.parseDouble(priceString); 
				 String Des=request.getParameter("fundDes"); 
				String status=request.getParameter("fundStatus"); 
				Fund fund=new Fund(id,name,Des,price,status,new Date()); 
			   
		         return fund;
		}
}
