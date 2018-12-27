<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons">
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<script>
	$(document).ready(function() {
		$('#myTable').DataTable({
			"pagingType" : "full_numbers",
			"lengthMenu" : [ [ 2, 5, 10, -1 ], [ 2, 5, 10, "All" ] ],
			"ordering" : true,
		}); 
		
	});
</script>

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
	height: 50px;
	line-height: 50px;
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
	font-size: 29px;
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

html * {
	-webkit-font-smoothing: antialiased;
}

body {
	background: #fff !important;
}

small {
	font-size: 75% !important;
	color: #777;
}

.btn-group {
	position: relative;
	margin: 10px 1px;
	display: inline-flex;
	vertical-align: middle;
}

.btn-group .btn {
	padding: 6.5px 20px !important;
	s
}

.btn.btn-round {
	border-radius: 30px !important;
}

.btn-group .btn.btn-round {
	border-radius: 30px !important;
}

.btn-group>.btn:not (:last-child ):not (.dropdown-toggle ) {
	border-top-right-radius: 0 !important;
	border-bottom-right-radius: 0 !important;
}

.btn-group>.btn:not (:first-child ) {
	border-top-left-radius: 0 !important;
	border-bottom-left-radius: 0 !important;
}

.btn {
	padding: 12px 30px !important;
	margin: 5px 1px;
	font-size: 12px !important;
	box-shadow: 0 2px 2px 0 hsla(0, 0%, 60%, .14), 0 3px 1px -2px
		hsla(0, 0%, 60%, .2), 0 1px 5px 0 hsla(0, 0%, 60%, .12);
}

.btn .material-icons {
	position: relative;
	display: inline-block;
	top: 0;
	margin-top: -1.2em;
	margin-bottom: -1em;
	font-size: 19px;
	vertical-align: middle;
}

.btn.btn-sm {
	border-radius: 3px !important;
}

.btn.btn-just-icon.btn-sm {
	height: 30px;
	min-width: 30px;
	width: 30px;
}

.btn.btn-just-icon {
	font-size: 10px;
	height: 41px;
	min-width: 41px;
	width: 41px;
	padding: 0 !important;
	overflow: hidden;
	position: relative;
	line-height: 41px;
}

.btn.btn-just-icon.btn-round {
	border-radius: 50% !important;
}

.btn.btn-link {
	background: transparent;
	box-shadow: none;
	color: #999;
}

.btn.btn-info {
	color: #fff !important;
	background-color: #00bcd4 !important;
	border-color: #00bcd4;
	box-shadow: 0 2px 2px 0 rgba(0, 188, 212, .14), 0 3px 1px -2px
		rgba(0, 188, 212, .2), 0 1px 5px 0 rgba(0, 188, 212, .12) !important;
}

.btn.btn-info:hover {
	box-shadow: 0 14px 26px -12px rgba(0, 188, 212, .42), 0 4px 23px 0
		rgba(0, 0, 0, .12), 0 8px 10px -5px rgba(0, 188, 212, .2) !important;
	background: #00aec5 !important;
}

.btn.btn-info.btn-link {
	background-color: transparent !important;
	color: #00bcd4 !important;
	box-shadow: none !important;
}

.btn.btn-success {
	color: #fff !important;
	background-color: #4caf50 !important;
	border-color: #4caf50;
	box-shadow: 0 2px 2px 0 rgba(76, 175, 80, .14), 0 3px 1px -2px
		rgba(76, 175, 80, .2), 0 1px 5px 0 rgba(76, 175, 80, .12) !important;
}

.btn.btn-success:hover {
	box-shadow: 0 14px 26px -12px rgba(76, 175, 80, .42), 0 4px 23px 0
		rgba(0, 0, 0, .12), 0 8px 10px -5px rgba(76, 175, 80, .2) !important;
	background: #47a44b !important;
}

.btn.btn-success.btn-link {
	background-color: transparent !important;
	color: #4caf50 !important;
	box-shadow: none !important;
}

.btn.btn-danger {
	color: #fff !important;
	background-color: #f44336 !important;
	border-color: #f44336;
	box-shadow: 0 2px 2px 0 rgba(244, 67, 54, .14), 0 3px 1px -2px
		rgba(244, 67, 54, .2), 0 1px 5px 0 rgba(244, 67, 54, .12) !important;
}

.btn.btn-danger:hover {
	box-shadow: 0 14px 26px -12px rgba(244, 67, 54, .42), 0 4px 23px 0
		rgba(0, 0, 0, .12), 0 8px 10px -5px rgba(244, 67, 54, .2) !important;
	background-color: #f33527 !important;
}

.btn.btn-danger.btn-link {
	background-color: transparent !important;
	color: #f44336 !important;
	box-shadow: none !important;
}

.btn.btn-just-icon .material-icons {
	margin-top: 0;
	position: absolute;
	width: 100%;
	transform: none;
	left: 0;
	top: 0;
	height: 100%;
	line-height: 41px;
	font-size: 10px;
}

.btn.btn-just-icon.btn-sm .material-icons {
	font-size: 10px;
	line-height: 29px;
}

.table {
	width: 100%;
	max-width: 100%;
	margin-bottom: 16px;
	background-color: transparent;
}

.table thead tr th {
	font-size: 17px;
	font-weight: 300;
}

.table>thead>tr>th {
	padding: 12px 8px;
	vertical-align: middle;
	border-color: #ddd;
	font-weight: 300;
}

.table>tbody>tr>td {
	padding: 12px 8px;
	vertical-align: middle;
	border-color: #ddd;
	font-weight: 300;
	font-size: 14px;
	color: #3c4858;
}

.table .td-actions .btn {
	margin: 0;
	padding: 5px;
}
</style>

<body id="LoginForm">
	<div class="container">

		<c:if test="${editMode}">
			<c:set var="url" value="${contextRoot}/admin/update"></c:set>
		</c:if>
		<c:if test="${!editMode}">
			<c:set var="url" value="${contextRoot}/admin/add"></c:set>
		</c:if>
		<c:if test="${haserror}">
			<div class="alert alert-danger alert-dismissable">
				<strong>Oh snap!</strong>${error}
			</div>
		</c:if>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">
					<h2>
						<b>Category</b>
					</h2>
				</div>
				<form:form modelAttribute="category" action="${url}" method="post">
					<form id="Login">
						<c:if test="${editMode}">
							<div class="form-group">
								<form:input type="text" class="form-control"
									id="inputCategoryName" placeholder="" path="categoryId"
									readonly="true" />
								<form:errors path="categoryId" cssStyle="color:red"></form:errors>
							</div>

						</c:if>

						<div class="form-group">
							<label for="text"><b>Category Name</b></label>
							<form:input type="text" class="form-control"
								id="inputCategoryName" placeholder="Category Name"
								path="categoryName" />
							<form:errors path="categoryName" cssStyle="color:red"></form:errors>
						</div>
						<div class="form-group">
							<label for="Description"><b>Description</b></label>

							<form:input type="text" class="form-control"
								id="inputDescription" placeholder="Description"
								path="categoryDesc" />
							<form:errors path="categoryDesc" cssStyle="color:red"></form:errors>
						</div>
						<c:if test="${!editMode}">
							<button type="submit" class="btn btn-primary">Add
								Category</button>
						</c:if>
						<c:if test="${editMode}">
							<button type="submit" class="btn btn-primary">Edit
								Category</button>
						</c:if>
					</form>
				</form:form>
			</div>
		</div>
		<div class="container">
			<div class="row">

				<div class="table-responsive">
					<table id="myTable" class="table">
						<thead>
							<tr>
								<th>CATEGORY ID</th>
								<th>CATEGORY NAME</th>
								<th>CATEGORY DESCRIPTION</th>
								<th class="text-right">Edit/Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${catlist}" var="c">
								<tr>
									<td>${c.categoryId}</td>
									<td>${c.categoryName}</td>
									<td>${c.categoryDesc}</td>
									<td class="td-actions text-right"><a
										href="${contextRoot}/admin/editCategory?categoryName=${c.categoryName}"
										rel="tooltip"
										class="btn btn-success btn-link btn-just-icon btn-sm"
										data-original-title="" title=""> <i class="material-icons">edit</i>
									</a> <a href="${contextRoot}/admin/deletecategory?categoryName=${c.categoryName}"
										rel="tooltip"
										class="btn btn-danger btn-link btn-just-icon btn-sm"
										data-original-title="" title=""> <i class="material-icons">close</i>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>
</body>