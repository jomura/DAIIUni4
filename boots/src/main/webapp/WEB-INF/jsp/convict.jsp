<%@page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Boot Sample | Home</title>
		<link rel="stylesheet" href="../static/css/bootstrap.min.css">
		<link rel="stylesheet" href="../static/css/style.css">
	</head>
	
	<body>
		<div role="navigation">
			<div class="navbar navbar-inverse">
				<a href="/" class="navbar-brand">Home</a>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="new-task">New Task</a></li>
						<li><a href="all-tasks">All tasks</a></li>
						<li><a href="new-convict">New Convict</a></li>
						<li><a href="all-convicts">All convicts</a></li>
						<li><a href="new-pokemon">New Pokemon</a></li>
						<li><a href="all-pokemones">All Pokemones</a></li>
					</ul>
				</div>
			</div>
		</div>
		
		<c:choose>
			
			<c:when test="${mode=='MODE_CONVICTS'}">
				<div class="container text-center" id="convictsDiv">
					<h3>My Convicts</h3>
					<hr />
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Id</th>
									<th>Identity Card Convict</th>
									<th>Name Convict</th>
									<th>Nationlaity</th>
									<th>Birthdate</th>
									<th>Place of Birth</th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="convict" items="${convicts}">
									<tr>
										<td>${convict.id_convict}</td>
										<td>${convict.identity_card_convict}</td>
										<td>${convict.name_convict}</td>
										<td>${convict.nationality}</td>
										<td>${convict.birthdate}</td>
										<td>${convict.place_of_birth}</td>
										<td><a href="update-convict?id=${convict.id_convict}"><span class="glyphicon glyphicon-pencil"></span>
										</a></td>
										<td><a href="delete-convict?id=${convict.id_convict}"> <span class="glyphicon glyphicon-trash"></span>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</c:when>
		
			<c:when test="${mode=='MODE_NEW_CONVICT' || mode=='MODE_UPDATE_CONVICT'}">
				<div class="container text-center">
					<h3>Manage Convict</h3>
					<hr />
					<form class="form-horizontal" method="POST" action="save-convict">
						<input type="hidden" name="id_convict" value="${convict.id_convict}" />
						<div class="form-group">
							<label class="control-label col-sm-3">Identity Card Convict:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="identity_card_convict" value="${convict.identity_card_convict}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Name Convict:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name_convict" value="${convict.name_convict}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Nationality:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="nationality" value="${convict.nationality}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Birthdatet:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="birthdate" value="${convict.birthdate}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Place of Birth:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="place_of_birth" value="${convict.place_of_birth}" />
							</div>
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-primary" value="Save" />
						</div>
					</form>
				</div>
			</c:when>
		
		
		</c:choose>
	<script type="text/javascript" src="../static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="../static/js/bootstrap.min.js"></script>
</body>
</html>
		