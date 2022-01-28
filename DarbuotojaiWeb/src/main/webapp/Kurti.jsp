<%@page import="java.util.List"%>
<%@page import="models.Darbuotojai"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<jsp:include page="partials/nav.jsp"></jsp:include>

<div class="container main-content" style= "margin-top: 80px">
	<div class="row mt-5">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">Pridėti naują darbuotoją</div>
				<div class="card-body">
					<form action="" method="POST">
						<div class="row">
						<div class="col-md-6">
						
							<div class="mb-3">
								<label class="form-label">Vardas</label>
								<input type="text" name="name" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Pavardė</label>
								<input type="text" name="surname" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Lytis</label>
								<select name="gender" class="form-control">
									<option value="Vyras">Vyras</option>
									<option value="Moteris">Moteris</option>
								</select>
							</div>
						</div>
						<div class="col-md-6">
								<div class="mb-3">
								<label class="form-label">Telefonas</label>
								<input type="text" name="phone" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Gimimo data</label>
								<input type="text" name="birthday" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Išsilavinimas</label>
								<select name="education" class="form-control">
									<option value="Vidurinis">Vidurinis</option>
									<option value="Aukštasis">Aukštasis</option>
									<option value="Gyvenimo Mokykla">Gyvenimo Mokykla</option>
								</select>
							</div>
						</div>
						<div class="col-md-12">
							<button class="btn btn-success" type="submit">Pridėti naują darbuotoją</button>
						</div>
						
						
						
						</div>
					</form>
				
				</div>
			</div>
		</div>
	
	</div>
</div>

<jsp:include page="partials/foot.jsp"></jsp:include>
