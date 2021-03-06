<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản Lý Sinh Viên 1</title>
</head>
<body>
	<div class="container">
		<h2>List Sinh Viên</h2>
		<br>
		<a type = "submit" href="add">ADD</a>
		<br>
		<table border="1px">
			<thead>
				<tr>
					<th>ID SinhVien</th>
					<th>Name SinhVien</th>
					<th>ID KhoaNganh</th>
					<th>CCCD</th>
					<th>Phone Number</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="o" items="${listS}">
					<tr>
						<td>${o.idSV}</td>
						<td>${o.nameSV}</td>
						<td>${o.idKN}</td>
						<td>${o.CCCD}</td>
						<td>${o.phoneNum}</td>
						<td>${o.mail}</td>
						<td><a class="btn_update" href="update?idSV=${o.idSV}">UPDATE</a>
							& <a class="btn_del" href="delSV?idSV=${o.idSV}">DELETE</a> 
							<%-- khi bấm vào delete, sẽ truyền về servlet delSV 
							1 biến iSV, dấu ? kia thể hiện 1 biến --%>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>

</html>