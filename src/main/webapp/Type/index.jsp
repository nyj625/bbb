<%@ page language="java" isELIgnored="false"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta  charset="utf-8">
<title>Insert title here</title>
<script src="../jquery-3.3.1.min(1).js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<script type="text/javascript">
function del(id){
	$.post("delete",{id:id},function(json){
		if(json.status>0)
			alert("删除成功");
		window.location.reload();
	},"json");
}
</script>
<c:forEach items="${requestScope.list}" var="r">
${r.name} <button onclick="javascript:del(${r.id})">删除</button>|<a href="edit?id=${r.id}">修改</a><br>
</c:forEach>


</body>
</html>