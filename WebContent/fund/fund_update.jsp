<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content-box-header">
		<h3>更新基金信息</h3>
	</div>

	<div class="content-box-content">
		<form name="form2" action="fundServlet?type=4&id=<%=request.getParameter("id") %>" method="post"
		onSubmit="return checkNull()">
			<p>
				基金名字：<input class="text-input large-input" type="text"
					name="fundName" />
			</p>
			<p>
				基金价格：<input class="text-input large-input" type="text"
					name="fundPrice" />
			</p>
			<p>
				基金描述：
				<textarea class="text-input textarea" rows="16" cols="50"
					name="fundDes"></textarea>
			</p>
			<p>
				基金状态： <input type="radio" name="fundStatus" value="Y" checked />可交易
				<input type="radio" name="fundStatus" value="N" />不可交易
			</p>
			<p>
				<input class="button" type="submit" value="完成" /> <input
					class="button" type="reset" value="取消" />
			</p>
		</form>
	</div>

</body>
</html>