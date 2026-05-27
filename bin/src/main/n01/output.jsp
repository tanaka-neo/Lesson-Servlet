<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%String name = (String)session.getAttribute("name");%>
<h1>こんにちは、<%=name %>さん！</h1>
<a href="input.jsp">戻る</a>


<%@include file="../footer.html" %>