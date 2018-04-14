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
		<h3>新增客户</h3>
	</div>

	<div class="content-box-content">
		<form name="form1" action="ClientServlet?type=3"  method="post"
		onSubmit="return checkNull()">
			<p>
				客户名字：<input class="text-input large-input" type="text"
					name="ClientName" />
			</p>
			<p>
				客户电话：<input class="text-input large-input" type="text"
					name="ClientPhone" />
			</p>
			<p>
				客户地址：
				<textarea class="text-input textarea" rows="16" cols="50"
					name="ClientDes"></textarea>
			</p>
			<p>
				兴趣爱好：
				<textarea class="text-input textarea" rows="16" cols="50"
					name="ClientDes"></textarea>
			</p>
			<p>
				客户邮箱：
				<textarea class="text-input textarea" rows="16" cols="50"
					name="ClientDes"></textarea>
			</p>
			<p>
				客户性别： <input type="radio" name="fundStatus" value="Y" checked />男
				<input type="radio" name="fundStatus" value="N" />女
			</p>
			<p>
				<input class="button" type="submit" value="新增" /> <input
					class="button" type="reset" value="取消" />
			</p>
		</form>
	</div>

</body>
</html>