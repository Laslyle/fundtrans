<%@page import="com.mybank.fundtrans.dao.FundDao"%>
<%@page import="com.mybank.fundtrans.dao.FundDaoJDBCImpl"%>
<%@page import="com.mybank.fundtrans.domain.Fund"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <link rel="stylesheet" type="text/css" href="resources/css/table.css" />  

<title>Insert title here</title>
</head>
<body>
<h1>基金结果</h1>
<table border="1" id="pattern-style-a">
<thead>
<tr>
<td> 基金编号 </td>
<td> 基金产品名称</td>
<td>基金产品价格</td>
<td>基金产品状态</td>
<td>基金产品创建时间</td>
<td>操作</td>
</tr>
</thead>
<tbody>
<%List<Fund> it=new FundDaoJDBCImpl().findAll(); %>
<%for(Fund fund:it){ %>
<tr>
<td><%=fund.getId()%></td>
<td><%=fund.getName() %></td>
<td><%=fund.getPrice()%></td>
<td><%=fund.getStatus() %></td>
<td><%=fund.getCreateTime() %></td>
<td> <a href="fundServlet?type=2&id=<%=fund.getId() %>">修改</a>&nbsp&nbsp<a href="fundServlet?type=3&id=<%=fund.getId() %>">删除</a> </td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>