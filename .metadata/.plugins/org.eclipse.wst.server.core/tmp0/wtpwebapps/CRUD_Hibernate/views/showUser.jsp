<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">

<title>Users Management</title>
</head>
<body>

	<main class="container">
		<br>
		<div class=row>
			<div class="col">
				<table class="table table-stripe">
					<tr>
						<td>User ID</td>
						<td>Password</td>
						<td>Full name</td>
						<td>Email Address</td>
						<td>Role</td>
						<td>Action</td>
						<td>&nbsp;</td>
					</tr>
					<c:forEach var="o" items="${listUser}">
						<tr>
							<td>${o.idU}</td>
							<td>${o.passU}</td>
							<td>${o.nameU}</td>
							<td>${o.emailU}</td>
							<td>
								<c:if test="${o.adminU == 1} ">
									Admin
								</c:if>
								<c:if test="${o.adminU == 0}">
									User
								</c:if>
							</td>
							<td><a class="btn_update" href="update?idU=${o.idU}">UPDATE</a>
								& <a class="btn_del" href="delete?idU=${o.idU}">DELETE</a> 
								<%-- khi bấm vào delete, sẽ truyền về servlet delSV 
							1 biến iSV, dấu ? kia thể hiện 1 biến --%></td>
							<td>&nbsp;</td>
						</tr>
					</c:forEach>

				</table>
				<div class=form-froup>
					<a class="btn btn-primary" type = "submit" href = "add">Create</a>
				</div>
			</div>
		</div>
	</main>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
		crossorigin="anonymous"></script>

</body>
</html>