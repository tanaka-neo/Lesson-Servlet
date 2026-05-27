<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<%
String name = (String)session.getAttribute("name");
if(name == null){
	name = "";
}
%>
<form action="input" method="post">
名前：<input type="text" name="name" value="<%=name%>">
<input type="submit" value="送信">
</form>

<%@include file="../footer.html" %>