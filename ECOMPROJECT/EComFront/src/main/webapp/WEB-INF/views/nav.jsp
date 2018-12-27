<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<style>
@import url('https://fonts.googleapis.com/css?family=Poppins');

nav {
	background-color: #fcc99b;
	color: #b1aca;
	padding: 15px 0px;
	font-family: 'Poppins', sans-serif;
}

nav .menu li a {
	color: #2b2927;
	padding: 10px;
}

nav .menu li a:hover {
	color: #d9d3cd;
}
</style>
<nav>
	<div class="container">
		<div class="navbar-header">
			<button button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" rel="home" href="#"
				title="Making beautiful flowers a part of your life."> <img
				style="max-width: 110px; margin-top: -28px;"
				src="${contextRoot}/resources/images/25.png">
			</a>
		</div>
<div id="navbar" class="collapse navbar-collapse navbar-responsive-collapse">

<div class="collapse navbar-collapse" id="collapse-example">
<c:choose>

<c:when test="${sessionScope.userlogin==true}">

			
			<ul class="nav navbar-nav">
				<li class="active"><a href="${contextRoot}/index">Home</a></li>
				<li><a href="${contextRoot}/aboutus">About</a></li>
				<li><a href="${contextRoot}/contactus">Contact</a></li>
				<li><a href="${contextRoot}/productdisplay">Productdisplay</a></li>
				<li><a href="${contextRoot}/user/viewCart">Cart</a></li>
				<li><a href="${contextRoot}/Logout">Logout</a></li>
				
			</ul>
</c:when>	
<c:when test="${sessionScope.userlogin==false}">

			
			<ul class="nav navbar-nav">
				<li class="active"><a href="${contextRoot}/index">Home</a></li>
				<li><a href="${contextRoot}/aboutus">About</a></li>
				<li><a href="${contextRoot}/contactus">Contact</a></li>
				<li><a href="${contextRoot}/admin/category">Category</a></li>
				<li><a href="${contextRoot}/admin/product">Product</a></li>
				<li><a href="${contextRoot}/Logout">Logout</a></li>
				
			</ul>
</c:when>
<c:otherwise>
	<ul class="nav navbar-nav">
				<li class="active"><a href="${contextRoot}/index">Home</a></li>
				<li><a href="${contextRoot}/aboutus">About</a></li>
				<li><a href="${contextRoot}/contactus">Contact</a></li>
				<li><a href="${contextRoot}/Login">Login</a></li>
				<li><a href="${contextRoot}/reg">Sign Up</a></li>
				<li><a href="${contextRoot}/productdisplay">Productdisplay</a></li>
				
	</ul>
</c:otherwise>
</c:choose>
	</div>
	</div>
</nav>