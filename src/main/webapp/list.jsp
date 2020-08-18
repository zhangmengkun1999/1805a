<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<table>
			<tr>
				<td>姓名</td>
				<td>年龄</td>
				<td>班级</td>
				<td>性别</td>
				<td>操作</td>
			</tr>
		<c:forEach items="${page.list}" var="s">
			<tr>
				<td>${s.sname}</td>
				<td>${s.age}</td>
				<td>${s.cname}</td>
				<td>${s.gender}</td>
				<td>
					<a>
						<input type="button" value="修改">
					</a>
					<a href="del?sid=${s.sid}">
						<input type="button" value="删除">
					</a>
				</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="10">
					<a href="list?pageNum=1">首页</a>
					<a href="list?pageNum=${page.pageNum-1}">上一页</a>
					<a href="list?pageNum=${page.pageNum+1}">下一页</a>
					<a href="list?pageNum=${page.pages}">尾页</a>
				</td>
			</tr>
	</table>
</body>
</html>