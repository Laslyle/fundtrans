<%@page import="java.util.List"%>
<%@page import="com.mybank.fundtrans.domain.Client"%>
<%@page import="com.mybank.fundtrans.dao.ClientDaoJDBCImpl"%>
<%@page import="com.mybank.fundtrans.util.JDBCUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>客户列表</h1>
<table border="1" id="pattern-style-a">
<thead>
<tr>
<td> idcard </td>
<td> name</td>
<td>sex</td>
<td>phone</td>
<td>address</td>
<td>email</td>
<td>hobby</td>
<td>createTime</td>
</tr>
</thead>
<tbody>
<%List<Client> it=new ClientDaoJDBCImpl().findAll(); %>
<%for(Client client:it){ %>
<tr>
<td><%=client.getIdcard()%></td>
<td><%=client.getName() %></td>
<td><%=client.getSex()%></td>
<td><%=client.getPhone() %></td>
<td><%=client.getAddredss() %></td>
<td><%=client.getEmail() %></td>
<td><%=client.getHobby() %></td>
<td><%=client.getCreateTime() %></td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>