<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイート一覧</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<%@page import="jp.co.aforce.beans.Tweet, java.util.List" %>
	<div class="container">
		<h1>ツイート一覧</h1>
		<%-- 新規投稿 --%>
		<p>
			<a href="new_tweet.jsp">新規投稿</a>
		</p>

		<%-- ツイート一覧の表示 --%>
		
		<ul class="tweet-list">
<% List<Tweet> tweets=(List<Tweet>)request.getAttribute(tweets); %>
			
			<li>
			<%for (Tweet t : list){ %>	
				<div class="tweet-content">
					<%=t.getContent() %><br>
					<a class="tweet-info">
						<%=t.getAuthor() %>
						<%=t.getPostedAt() %>
					</a>
				</div>
					<%} %>
			</li>
		
		</ul>
	
	</div>
</body>
</html>
