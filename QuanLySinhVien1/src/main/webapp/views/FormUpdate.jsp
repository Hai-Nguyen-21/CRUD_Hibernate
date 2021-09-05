<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Sinh Vi�n</title>
</head>
<body>
	<form action="update" method="post">
		<table>
			<tr>
				<td>ID SINH VI�N</td>
				<td><input type="text" name="txt_idSV" value = "${sv.idSV }" readonly/></td>
			</tr>
			<tr>
				<td>NAME SINH VI�N</td>
				<td><input type="text" name="txt_nameSV" value = "${sv.nameSV }"/></td>
			</tr>
			<tr>
				<td>ID KHOA NG�NH</td>
				<td><select name="idKN">
						<c:forEach var="sv" items="${LIST_KHOANGANH_UPDATE}">
							<option ${idKN == sv.idKN ? "selected":""} value="${sv.idKN}">${sv.idKN}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>CCCD</td>
				<td><input type="text" name="txt_cccd" value = "${sv.CCCD }"/></td>
			</tr>
			<tr>
				<td>PHONE NUMBER</td>
				<td><input type="text" name="txt_phoneNum" value = "${sv.phoneNum }"/></td>
			</tr>
			<tr>
				<td>MAIL</td>
				<td><input type="text" name="txt_mail" value = "${sv.mail }"/></td>
			</tr>
			<tr>
				<td></td>
				<td><button value="btn_update">UPDATE</button></td>
			</tr>
		</table>
	</form>
</body>
</html>