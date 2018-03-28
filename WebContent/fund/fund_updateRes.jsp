<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="java.util.Date"%>
<%@page import="com.mybank.fundtrans.domain.Fund"%>
<%@page import="com.mybank.fundtrans.dao.FundDaoJDBCImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<% Integer id=Integer.parseInt(request.getParameter("id")); %>
<% String name=request.getParameter("fundName");%>
<%String priceString=request.getParameter("fundPrice"); %>
<%Double price =Double.parseDouble(priceString); %>
<% String Des=request.getParameter("fundDes"); %>
<%String status=request.getParameter("fundStatus"); %>
<%Fund fund=new Fund(id,name,Des,price,status,new Date()); %>
<% new FundDaoJDBCImpl().update(fund); %>
jsp<jsp:forward page="fund_list.jsp"></jsp:forward>
</body>
</html>