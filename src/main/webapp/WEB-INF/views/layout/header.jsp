<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Baseball Management System</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/stadium">Baseball Management System</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">

							<li class="nav-item"><a class="nav-link" href="/stadium">경기장보기&삭제</a></li>
							<li class="nav-item"><a class="nav-link" href="/stadiumForm">경기장등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/team">팀목록보기&삭제</a></li>
							<li class="nav-item"><a class="nav-link" href="/teamForm">팀등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player">선수목록보기&삭제</a></li>
							<li class="nav-item"><a class="nav-link" href="/playerForm">선수등록</a></li>
							<li class="nav-item"><a class="nav-link" href="/player/position">포지션별야구선수보기</a></li>
							<li class="nav-item"><a class="nav-link" href="">퇴출선수목록</a></li>
							<li class="nav-item"><a class="nav-link" href="">퇴출선수등록</a></li>

				</ul>
			</div>
		</div>
	</nav>