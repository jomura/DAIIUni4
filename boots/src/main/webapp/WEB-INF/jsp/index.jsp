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
		<c:when test="${mode=='MODE_HOME'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Task Manager</h1>
				</div>
			</div>
		</c:when>
			
		
		</c:choose>
	
		<script type="text/javascript" src="../static/js/jquery-3.1.1.min.js"></script>
		<script type="text/javascript" src="../static/js/bootstrap.min.js"></script>
	</body>
</html>
