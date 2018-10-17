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
function save(){
	console.log($(".f1").serialize());	
	$.post("update",$(".f1").serialize(),function(json){
		if(json.status>0)
			alert("修改成功");
		//window.location.reload();
	},"json");
}
</script>
<form  method="post" class="f1">
<input type="hidden" name="id" value="${requestScope.id}">
父节点<input type="text" name="parentid"  value="${requestScope.list.parentid}" >
类型名<input type="text" name="name" value="${requestScope.list.name}"  >
<input type="button" value="保存" onclick="save();"  >
</form>


</body>
</html>