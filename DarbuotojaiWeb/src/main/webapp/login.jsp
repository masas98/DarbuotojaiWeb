<%@page import="java.util.List"%>
<%@page import="models.Darbuotojai"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Darbuotojai</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>






<div class="container main-content" >
	<div class=" d-flex align-items-center" style="min-height: 100vh"> 
		<div class="row" style="width: 100%">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						Prašome prisijungti
					</div>
					<div class="card-body">
						<form action="" method="post">
						<%
							if (request.getAttribute("error")!=null){
								%>
								<div class="alert alert-danger mt-3 mb-3"><%=request.getAttribute("error") %></div>
								<%
							}
						%>
						
						<div class="mb-3">
							<label class="form-label">Vartotojo vardas</label>
							<input type="text" name="name" value="" class="form-control">
						</div>
						<div class="mb-3">
							<label class="form-label">Slaptažodis</label>
							<input type="password" name="password" value="" class="form-control">
						</div>
						<hr>
						<button class="btn btn-success">Prisijungti</button>
						</form>
					</div>
				</div>
			</div>
		</div> 
	</div>
	
</div>
<jsp:include page="partials/foot.jsp"></jsp:include>