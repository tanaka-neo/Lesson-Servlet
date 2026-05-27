<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<p>商品一覧</p>
<a href="<%=request.getContextPath()%>/chapter14/ennsyuu?order=desc">高い順</a>

<a href="<%=request.getContextPath()%>/chapter14/ennsyuu?order=asc">安い順</a>
<%@include file="../footer.html" %>