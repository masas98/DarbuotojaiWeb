<%@page import="lt.bit.helper.UserManager"%>
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


<jsp:include page="partials/nav.jsp"></jsp:include>



<div class="container" style= "margin-top: 80px">
	<div class="row mt-5">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">Darbuotojų sąrašas</div>
				<div class="card-body">
					<table class="table">
						<thead>
							<tr>
								<th>ID</th>
								<th>Vardas</th>
								<th>Pavardė</th>
								<th>Lytis</th>
								<th>Telefonas</th>
								<th>Gimimo data</th>
								<th>Išsilavinimas</th>
								<th>Veiksmai</th>
							</tr>
						</thead>
						
						<tbody>
						   <%
						   for (Darbuotojai c: (List<Darbuotojai>)request.getAttribute("Darbuotojas") ){
							%>
							<tr>
								<td><%=c.getId() %></td>
								<td><%=c.getName() %></td>
								<td><%=c.getSurname() %></td>
								<td><%=c.getGender() %></td>
								<td><%=c.getPhone() %></td>
								<td><%=c.getBirthday() %></td>
								<td><%=c.getEducation() %></td>
								<% if (UserManager.isLoggedIn(session)){ %>
								<td>
								
								
									<a class="btn btn-success" href="/DarbuotojaiWeb/DarbuotojaiEdit?id=<%=c.getId()%>">Redaguoti</a> 
									<a class="btn btn-danger"  href="/DarbuotojaiWeb/DarbuotojaiDelete?id=<%=c.getId() %>" >Ištrinti</a>
								</td>
								<% } %>
								
							
							</tr>
						 <% } %>
						</tbody>
					</table>
				
				</div>
			</div>
		</div>
	
	</div>
</div>

<jsp:include page="partials/foot.jsp"></jsp:include>
</body>
</html>