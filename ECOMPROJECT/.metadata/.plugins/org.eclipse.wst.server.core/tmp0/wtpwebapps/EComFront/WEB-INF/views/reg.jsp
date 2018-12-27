<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style>
body
.form-heading {
	color: #fff;
	font-size: 23px;
}

.panel h2 {
	color: #444444;
	font-size: 18px;
	margin: 0 0 8px 0;
	text-align: center;
}

.login-form .form-control {
	background: #f7f7f7 none repeat scroll 0 0;
	border: 1px solid #d4d4d4;
	border-radius: 4px;
	font-size: 14px;
}

.main-div {
	background: #ffffff none repeat scroll 0 0;
	border-radius: 2px;
	margin: 10px auto 30px;
	max-width: 38%;
	padding: 50px 70px 70px 71px;
}

.login-form .form-group {
	margin-bottom: 10px;
}

.login-form {
	text-align: left;
	font-size: 13px;
}

.login-form  .btn.btn-primary {
	background: #fcc99b none repeat scroll 0 0;
	border-color: #f0ad4e;
	color: black;
	font-size: 14px;
	width: 100%;
	height: 50px;
	line-height: 50px;
	padding: 0;
}

.botto-text {
	color: #ffffff;
	font-size: 14px;
	margin: auto;
}

.login-form .btn.btn-primary.reset {
	background: #fcc99b none repeat scroll 0 0;
}

.back {
	text-align: left;
	margin-top: 10px;
}

.back a {
	color: #444444;
	font-size: 13px;
	text-decoration: none;
}
</style>

<div id="LoginForm">
	<div class="container">
		<c:if test="${haserror}">
			<div class="alert alert-danger alert-dismissable">
				<strong>Oh snap!</strong>${error}
			</div>
		</c:if>

		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>
						<b>Create Account</b>
					</h2>
				</div>
	<form:form modelAttribute="userModel" action="adduserdetail" method="post">

				<form id="Login">
						<div class="form-group">
							<label for="text"><b>User Name</b></label>
							<form:input type="text" class="form-control" id="inputUserName"
								placeholder="User Name" path="userName" />
							<form:errors path="userName" cssStyle="color:red"></form:errors>
						</div>

						<div class="form-group">
							<label for="email"><b>Email</b></label>
							<form:input type="email" class="form-control" id="inputEmail"
								placeholder="Email Address" path="emailId" />
							<form:errors path="emailId" cssStyle="color:red"></form:errors>
						</div>

						<div class="form-group">
							<label for="password"><b>Password</b></label>
							<form:input type="password" class="form-control"
								id="inputPassword" placeholder="Password" path="password" />
							<form:errors path="password" cssStyle="color:red"></form:errors>
						</div>

						<div class="form-group">
							<label for="mobile"><b>Mobile</b></label>
							<form:input type="mobile" class="form-control" id="inputMobile"
								placeholder="Mobile" path="mobileNo" />
							<form:errors path="mobileNo" cssStyle="color:red"></form:errors>
						</div>

						<button type="submit" class="btn btn-primary">Continue</button>
					</form>
				</form:form>
			</div>
		</div>
	</div>
</div>