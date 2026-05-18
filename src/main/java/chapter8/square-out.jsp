<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="../header.html"%>

<%@page  errorPage="square-error.jsp" %>

<%
request.setCharacterEncoding("UTF-8");
int num=Integer.parseInt(request.getParameter("num"));
%>

<p>入力した数値：
<%=num %></p>
<p>結果:
<%=num*num %></p>

<%@ include file="../footer.html"%>