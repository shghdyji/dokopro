<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />
	<div class="w-container adminselect">
		<div>
			<div class="w-row">
				<div class="w-col w-col-6">
					<div class="selectaction4admin">
						<h3>
							<a href="<%=request.getContextPath()%>/front/admin/addcontent">コンテンツ追加</a>
						</h3>
					</div>
				</div>
				<div class="w-col w-col-6">
					<div class="selectaction4admin">
						<h3>
							<a href="<%=request.getContextPath()%>"></a>ユーザ削除
						</h3>
					</div>
				</div>
			</div>
			<div class="w-row">
				<div class="w-col w-col-6">
					<div class="selectaction4admin">
						<h3>
							<a href="<%=request.getContextPath()%>"></a>グループ削除
						</h3>
					</div>
				</div>
				<div class="w-col w-col-6">
					<div class="selectaction4admin">
						<h3>
							<a href="<%=request.getContextPath()%>"></a>コンテンツ編集
						</h3>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!--[if lte IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/placeholders/3.0.2/placeholders.min.js"></script><![endif]-->
</body>
</html>