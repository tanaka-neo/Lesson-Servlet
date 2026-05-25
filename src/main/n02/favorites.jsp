<%@page contentType="text/html; charset=UTF-8" %>
<%@page import ="java.util.List" %>
<%@page import ="beans.Favorite" %>
<%@include file="../header.html" %>

<%
List<Favorite> list =
(List<Favorite>)session.getAttribute("list");
%>
<h1>お気に入り登録</h1>

<form action="favorite" method="post">
名前：<input type="text" name="name">
URL：<input type="text" name="url">
<input type="submit" value="追加">
</form>

<h2>登録一覧</h2>

<form action="clear" method="post">
	<input type="submit" value="クリア">
</form>


<%
if(list != null){
	for(Favorite f : list){
%>

<p>・
<a href="<%=f.getUrl()%>">
	<%=f.getName()%>
</a>
</p>

<%
	}
}
%>
<%@include file="../footer.html" %>