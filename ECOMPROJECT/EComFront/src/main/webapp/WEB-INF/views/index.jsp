 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="shortcut icon" href="resources/images/logo25.ico" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<title>${title}</title>
</head>
<body>
	<c:import url="nav.jsp"></c:import>
	<div style="min-height: 620px;">
		<c:if test="${sliderpage}">
			<c:import url="slide.jsp"></c:import>
		</c:if>
		<c:if test="${aboutPage}">
			<c:import url="aboutus.jsp"></c:import>
		</c:if>
		<c:if test="${loginPage}">
			<c:import url="Login.jsp"></c:import>
		</c:if>
			
		<c:if test="${regPage}">
			<c:import url="reg.jsp"></c:import>
		</c:if>
		<c:if test="${cartpage}">
			<c:import url="cart.jsp"></c:import>
		</c:if>
		<c:if test="${billpage}">
			<c:import url="Invoice.jsp"></c:import>
		</c:if>
		
		<c:if test="${orderpage}">
			<c:import url="order.jsp"></c:import>
		</c:if>
		
		<c:if test="${addresspage}">
			<c:import url="address.jsp"></c:import>
		</c:if>
		
		
		<c:if test="${contactPage}">
			<c:import url="contactus.jsp"></c:import>
		</c:if>
		<c:if test="${categoryPage}">
			<c:import url="category.jsp"></c:import>
		</c:if>
		<c:if test="${productPage}">
			<c:import url="product.jsp"></c:import>
		</c:if>
		<c:if test="${showoneproductPage}">
			<c:import url="showoneproduct.jsp"></c:import>
		</c:if>

		<c:if test="${productdisplayPage}">
			<c:import url="productdisplay.jsp"></c:import>
		</c:if>

	</div>
	<c:import url="footer.jsp"></c:import>
</body>
</html>