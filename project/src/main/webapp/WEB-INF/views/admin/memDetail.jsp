<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8" />
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
<%@include file="header.jsp"%>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		var proc = "${proc}"
		if (proc == "del") {
			alert("삭제완료")
			location.href = "${path}/getMemList.do"
		}
		if (proc == "fail") {
			alert("처리 실패\n메인 페이지로 이동합니다.")
			location.href = "${path}/getMemList.do"
		}
	})
</script>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<%@include file="sidebar.jsp"%>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">
				<%@include file="topbar.jsp"%>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<div class="card o-hidden border-0 shadow-lg my-5">
						<div class="card-body p-0">
							<!-- Nested Row within Card Body -->
							<div class="row">
								<div class="sellerRegForm">
									<div class="p-5">
										<div class="text-center">
											<h1 class="h4 text-gray-900 mb-4">회원 정보 상세조회</h1>
										</div>
										<form class="user">
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="id" id="id" value="ID : ${mem.id}" disabled>

											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="pass" id="pass" value="Password : ${mem.password}"
													disabled>

											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="name" id="name" value="Name : ${mem.name}" disabled>

											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="address" id="address"
													value="Address : ${mem.address}" disabled>
											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="phone" id="phone" value="Phone : ${mem.contact}"
													disabled>
											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="grade" id="grade" value="Grade : ${mem.gradeName}"
													disabled>
											</div>
											<div class="form-group">
												<input type="text" class="form-control form-control-user"
													name="auth" id="auth" value="Auth : ${mem.auth}" disabled>
											</div>

											<hr>

											<button type="button"
												class="btn btn-danger btn-user btn-block"
												onclick="delMem('${mem.id}')">삭제</button>
											<button type="button" id="backToMemList"
												class="btn btn-warning btn-user btn-block">돌아가기</button>

										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				<script type="text/javascript">
						function delMem(id) {
							if (confirm(id + "를 삭제하시겠습니까?")) {
								location.href = "${path}/delMem.do?id=" + id
							}
						}
						$(document).ready(function() {
							$("#backToMemList").click(function() {
								location.href = "getMemList.do";
							})
						});
				</script>
				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->
			<%@include file="footer.jsp" %>
			

</body>

</html>