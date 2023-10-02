<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::modify</title>
	</head>
	<body>
		<h3>user1 수정</h3>
		
		<a href="/Ch05/index">메인</a>
		<a href="/Ch05/user1/list">목록</a>
		
		<!-- 
		<form> 태그 : 폼 관련 태그들의 범위를 지정하고 포함하는 역할
		action: <form> 태그에 입력된 내용을 처리하는 서버 프로그램의 URI를 지정하는 역할
		method: 사용자가 입력한 내용을 어떤 방식(get, post)으로 넘길 것인지를 지정하는 역할
		 -->
		<form action="/Ch05/user1/modify" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<!-- 수정할 수 없게 readonly 설정 -->
					<td><input type="text" name="uid" value="${user1DTO.uid}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${user1DTO.name}"/></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="hp" value="${user1DTO.hp}"></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="number" name="age" value="${user1DTO.age}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="수정하기"/></td>
				</tr>
			</table>
		</form>		
	</body>
</html>