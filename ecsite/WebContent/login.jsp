<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>LOGIN</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>login</p>
		</div>
		<div>

			<h3>商品を購入する際はログインをお願いします。</h3>
			<s:form action ="loginAction">
				<s:textfield name="loginUserId"/>
				<s:password name="loginPassword"/>
				<s:submit value="ログイン"/>
			</s:form>
			<br/>

			<div id="text-link">
				<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
				<p>Home画面へ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>

	<div id="footer">
	<div id="pr">
	</div>
	</div>

</body>
</html>