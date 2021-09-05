<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:useBean id="d" class="DAO.SinhVienDAO" scope="request"></jsp:useBean>
<title>Th�m sinh vi�n</title>
</head>
<body>
	<form action="add" method = "post">
		<table>
			<tr>
				<td>ID SINH VI�N</td>
				<td><input type="text" name="txt_idSV" /></td>
			</tr>
			<tr>
				<td>NAME SINH VI�N</td>
				<td><input type="text" name="txt_nameSV" /></td>
			</tr>
			<tr>
				<td>ID KHOA NG�NH</td>
				<td><select name="idKN">
						<c:forEach var="o" items="${LIST_KHOANGANH}">
							<option value = "${o.idKN}">${o.idKN}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>CCCD</td>
				<td><input type="text" name="txt_cccd" /></td>
			</tr>
			<tr>
				<td>PHONE NUMBER</td>
				<td><input type="text" name="txt_phoneNum" /></td>
			</tr>
			<tr>
				<td>MAIL</td>
				<td><input type="text" name="txt_mail" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button value="btn_save">SAVE</button></td>
			</tr>
		</table>
	</form>
</body>
</html>