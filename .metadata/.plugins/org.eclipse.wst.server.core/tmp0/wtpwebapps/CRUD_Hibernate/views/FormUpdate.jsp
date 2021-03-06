<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<div class="row">
			<div class="col">
				<form action="update" method = "post">
					<div class = "form-group">
						<label for = "userId"> User ID: </label> 
						<input type = "text" name = "userId" id = "userId" class = "form-control" value = "${user.idU }"/>
					</div>
					<div class = "form-group">
						<label for = "password"> Password: </label>
						<input type = "text" name = "password" id = "password" class = "form-control" value = "${user.passU }"/>
					</div>
					<div class = "form-group">
						<label for = "fullname"> Full name: </label>
						<input type = "text" name = "fullname" id = "fullname" class = "form-control" value = "${user.nameU }"/>
					</div>
					<div class = "form-group">
						<label for = "email"> Email Address: </label>
						<input type = "text" name = "email" id = "email" class = "form-control" value = "${user.emailU }"/>
					</div>
					<div class = "form-check form-check-inline">
						<label> Role: </label>
						<label class = "ml-2" >Admin <input type = "radio" value = "true" name = "role" id = "admin" class = "form-check-input" /></label>
						<label class = "ml-2" >User <input type = "radio" value = "false" name = "role" id = "user" class = "form-check-input"/></label>
					</div>
					<div class = form-froup>
						<button class = "btn btn-primary" >Update</button>
					</div>
				</form>
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