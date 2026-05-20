<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォーム</title>
</head>
<body>

	<form action="select" method="post">

		<p>氏名</p>
		<input type="text" name="username">
		<p>会社</p>
		<input type="text" name="company">
		<p>メールアドレス</p>
		<input type="text" name="mailadress">

		<p>お問い合わせ内容</p>
		<textarea name="toiawase" cols="30" rows="5"></textarea>

		<p>メルマガ種類</p>
		<p>
			<input type="checkbox" name="mailmaga" value="総合案内">総合案内
		</p>
		<p>
			<input type="checkbox" name="mailmaga" value="セミナー案内">セミナー案内
		</p>
		<p>
			<input type="checkbox" name="mailmaga" value="求人採用情報">求人採用情報
		</p>

		<p>資料請求希望</p>
		<input type="radio" name="shiryou" value="Yes" checked>Yes <input
			type="radio" name="siryou" value="No">No

		<p>
			<input type="submit" value="送信">
		</p>

	</form>
	
</body>
</html>