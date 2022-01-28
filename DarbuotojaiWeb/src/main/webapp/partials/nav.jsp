<%@page import="lt.bit.helper.UserManager"%>
<%@page import="lt.bit.helper.prefCurrency"%>
<%@page import="lt.bit.helper.PrefCountry"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>


<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="/DarbuotojaiWeb/">Darbuotojai</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/DarbuotojaiWeb/">Darbuotojų sąrašas</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/DarbuotojaiWeb/Kurti">Pridėti naują darbuotoją</a>
        </li>
        </ul>
        <%
      if (UserManager.isLoggedIn(session)){
    	  %>
    	  <!-- 
    	  <div>Sveikas prisijunges: <%=((UserManager)session.getAttribute("userManager")).getUser().getName() %> </div>
    	   -->
    	  <a class="float-end btn btn-info" href="/DarbuotojaiWeb/logout">Atsijungti</a>
    	  <%
      }else{
    	  %>
    	  <a class="float-end btn btn-info" href="/DarbuotojaiWeb/login">Prisijungti</a>
    	  <%
      }
      %>
    </div>
  </div>
</nav>


<div class="container">
	<div class="row " style="margin-top:80px;">
		<div class="col-md-12">
			<div class= "alert alert-info">
			Viso apsilankymų <%= session.getAttribute("counter") %>
			<div class="float-end"> <%= session.getAttribute("timer") %></div>
			
			</div>
		</div>
	</div>
</div>

<div class="container">
	<div class= "row mt-3">
		<div class="col-md-12">
			<div class="alert alert-warning">
			
			<form action="/DarbuotojaiWeb/PrefCountry" method="post">
			<div class="mb-3">
				<select name="prefCountry"class="form-control">
				<%
				for(String country: PrefCountry.getCountries()){
					
					%>
					<option value="<%=country%>" <%=country.equals(PrefCountry.getPrefCountry(request))?"selected":""%> >
										<%=country%></option>
					<%
				} 
				%>

				</select>
			</div>
			
				<button class="btn btn-success" type="submit">Pasirinkti</button>
				</form>
			</div>
			
		</div>
	</div>
</div>


<div class="container">
	<div class= "row mt-3">
		<div class="col-md-12">
			<div class="alert alert-warning">
			
			<form action="/DarbuotojaiWeb/prefCurrency" method="post">
			<div class="mb-3">
				<select name="prefCurrency"class="form-control">
				<%
				for(String currency: prefCurrency.getCurrencies()){
					
					%>
					<option value="<%=currency%>" <%=currency.equals(prefCurrency.getCurrency(request))?"selected":""%> >
										<%=currency%></option>
					<%
				}
				%>

				</select>
			</div>
			
				<button class="btn btn-success" type="submit">Pasirinkti</button>
				</form>
			</div>
			
		</div>
	</div>
</div>


