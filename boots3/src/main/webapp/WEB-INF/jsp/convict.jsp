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
						<li><a href="new-convict">New Convict</a></li>
						<li><a href="all-convicts">All convicts</a></li>
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
										<td>${convict.idConvict}</td>
										<td>${convict.identityCardConvict}</td>
										<td>${convict.nameConvict}</td>
										<td>${convict.nationality}</td>
										<td>${convict.birthdate}</td>
										<td>${convict.placeOfBirth}</td>
										<td><a href="update-convict?id=${convict.idConvict}"><span class="glyphicon glyphicon-pencil"></span>
										</a></td>
										<td><a href="delete-convict?id=${convict.idConvict}"> <span class="glyphicon glyphicon-trash"></span>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</c:when>
		
			<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
				<div class="container text-center">
					<h3>Manage Convict</h3>
					<hr />
					<form class="form-horizontal" method="POST" action="save-convict">
						<input type="hidden" name="idConvict" value="${convict.idConvict}" />
						<div class="form-group">
							<label class="control-label col-sm-3">Identity Card Convict:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="identityCardConvict" value="${convict.identityCardConvict}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Name Convict:</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="nameConvict" value="${convict.nameConvict}" />
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
								<input type="text" class="form-control" name="placeOfBirth" value="${convict.placeOfBirth}" />
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
		