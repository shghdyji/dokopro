<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- This site was created in Webflow. http://www.webflow.com-->
<!-- Last Published: Mon Apr 20 2015 01:31:28 GMT+0000 (UTC) -->
<html data-wf-site="5529405753ab13dd4efff00c" data-wf-page="5533f54d6ca197b65278dc76">
<head>
  <meta charset="utf-8">
  <title>accountsetting</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="generator" content="Webflow">
  <link rel="stylesheet" type="text/css" href="css/normalize.css">
  <link rel="stylesheet" type="text/css" href="css/webflow.css">
  <link rel="stylesheet" type="text/css" href="css/pg-int.webflow.css">
  <script src="https://ajax.googleapis.com/ajax/libs/webfont/1.4.7/webfont.js"></script>
  <script>
    WebFont.load({
      google: {
        families: ["Montserrat:400,700","Bitter:400,700,400italic","Ubuntu:300,300italic,400,400italic,500,500italic,700,700italic"]
      }
    });
  </script>
  <script type="text/javascript" src="js/modernizr.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="images/webclip-slate.png">
  <link rel="apple-touch-icon" href="images/webclip-slate.png">
</head>
<body>
 <header class="w-section navbar">
		<jsp:include page="/WEB-INF/jsp/header.jsp" />
	</header>
 
  <div class="w-section">
    <div class="w-container accountsettingwrapper">
      <div>
        <h1 class="accountsetting">アカウント設定</h1>
        <div class="separationyoko"></div>
        <div class="changaccountinfowrapper">
          <div class="w-form">
            <form name="ACCOUNT_NAME" action="<%=request.getContextPath() %>/front/account/edit" method="post">
              <label for="name">アカウント名</label>
              <input class="w-input" id="" type="text" placeholder="e.g.dokopro" name="ACCOUNT_NAME" data-name="Name">
              <input class="w-button" type="submit" value="名前の変更" data-wait="Please wait...">
            </form>
            <form  name="MAIL" action="<%=request.getContextPath() %>/front/account/edit" method="post">
              <div class="changeemail">アドレスの変更</div>
              <label for="email">メールアドレス</label>
              <input class="w-input" id="email" type="email" name="MAIL" data-name="Email" required="required">
              <input class="w-button" type="submit" value="メールアドレスの変更" data-wait="Please wait...">
            </form>
            <form name="PASSWORD" action="<%=request.getContextPath() %>/front/account/edit" method="post">
              <div class="changpassword">パスワードの変更</div>
              <label for="email-2">古いパスワード</label>
              <input class="w-input" id="email-2" type="password"  name="PASSWORD" data-name="Email 2" required="required">
              <label for="email-4">新しいパスワード</label>
              <input class="w-input" id="email-4" type="password" name="NEW_PASSWORD" data-name="Email 4" required="required">
              <label for="email-3">新しいパスワード（ 確認）</label>
              <input class="w-input" id="email-3" type="password"  name="CHECK_PASSWORD" data-name="Email 3" required="required">
              <input class="w-button" type="submit" value="パスワードの変更" data-wait="Please wait...">
            </form>
            <div class="w-form-done">
              <p>Thank you! Your submission has been received!</p>
            </div>
            <div class="w-form-fail">
              <p>Oops! Something went wrong while submitting the form :(</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <!--[if lte IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/placeholders/3.0.2/placeholders.min.js"></script><![endif]-->
</body>
</html>