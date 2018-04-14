<%@page import="com.mybank.fundtrans.domain.Client"%>
<%@page import="com.mybank.fundtrans.dao.ClientDaoJDBCImpl"%>
<%@page import="com.mybank.fundtrans.dao.ClientDao"%>
<%@page import="com.mybank.fundtrans.dao.FundDao"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
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
<!-- findById -->
<%=new FundDaoJDBCImpl().findById(22).getName() %>
<%=new FundDaoJDBCImpl().findById(22).getDescription() %>
<%=new FundDaoJDBCImpl().findById(22).getStatus() %>
<%=new FundDaoJDBCImpl().findById(22).getCreateTime() %>
<%=new FundDaoJDBCImpl().findById(22).getPrice() %>
<%-- findAll --%>
<%-- <%List<Fund> funds=new FundDaoJDBCImpl().findAll(); %> --%>
<%-- <%for(Fund fund:funds){ out.print(fund.getName());} %> --%>
<%-- <%List<Client> it=new ClientDaoJDBCImpl().findAll(); %> --%>
<%-- <%for(Client client:it){out.print(client.getIdcard()); }%> --%>
<%-- insert --%>
<%-- <% Fund fund1=new Fund(33, "hly", "ly",1.4,"Y", new Date()); %> --%>
<%-- <% new FundDaoJDBCImpl().insert(fund1); %> --%>
<%-- <%Client client=new Client("132421311111111111","2","2",12,"2","2","2",new Date()); --%>
<!-- // new ClientDaoJDBCImpl().insert(client); -->
<!-- %> -->
<%-- delete --%>
<%-- <% new FundDaoJDBCImpl().delete(22); %> --%>
<%-- update --%>
<%-- <% Fund fund2=new Fund(27, "huangliyan", "ly",1.4,"Y", new Date()); %> --%>
<%-- <%new FundDaoJDBCImpl().update(fund2); %> --%>
</body>
</html>