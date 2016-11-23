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
			
			<c:when test="${mode=='MODE_POKEMONES'}">
				<div class="container text-center" id="pokemonesDiv">
					<h3>My Pokemones</h3>
					<hr />
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>Type</th>
									<th>Atack Points</th>
									<th>Defence Points</th>
									<th>Ability Power Points</th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="pokemon" items="${pokemones}">
									<tr>
										<td>${pokemon.id_pokemon}</td>
										<td>${pokemon.name}</td>
										<td>${pokemon.type}</td>
										<td>${pokemon.atack_points}</td>
										<td>${pokemon.defence_points}</td>
										<td>${pokemon.ability_power_points}</td>
										<td><a href="update-pokemon?id=${pokemon.id_pokemon}"><span class="glyphicon glyphicon-pencil"></span>
										</a></td>
										<td><a href="delete-pokemon?id=${pokemon.id_pokemon}"> <span class="glyphicon glyphicon-trash"></span>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</c:when>
		
			<c:when test="${mode=='MODE_NEW_POKEMON' || mode=='MODE_UPDATE_POKEMON'}">
				<div class="container text-center">
					<h3>Manage Pokemon</h3>
					<hr />
					<form class="form-horizontal" method="POST" action="save-pokemon">
						<input type="hidden" name="id_pokemon" value="${pokemon.id_pokemon}" />
						<div class="form-group">
							<label class="control-label col-sm-3">Name</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="name" value="${pokemon.name}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Type</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="type" value="${pokemon.type}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Atack Points</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="atack_points" value="${pokemon.atack_points}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Defence Points</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="defence_points" value="${pokemon.defence_points}" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-3">Ability Power Points</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="ability_power_points" value="${pokemon.ability_power_points}" />
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
		