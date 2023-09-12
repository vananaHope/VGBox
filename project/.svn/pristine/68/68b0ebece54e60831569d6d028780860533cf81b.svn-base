<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" 
   value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

<head>
<%@include file="header.jsp" %>
</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <%@include file="sidebar.jsp" %>
        
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
			<%@include file="topbar.jsp" %>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">
					 <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">회원 관리</h1>
                    <br>
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                      <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">회원정보 테이블</h6>
                       </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Name</th>
                                            <th>Phone</th>
                                            <th>Auth</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                    	<c:forEach var="m" items="${memList}">
	                                        <tr ondblclick="goDetail('${m.id}')">
	                                            <td>${m.id}</td>
	                                            <td>${m.name}</td>
	                                            <td>${m.contact}</td>
	                                            <td>${m.auth}</td>
	                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                         
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

    
		<%@include file="footer.jsp" %>
    
</body>
</html>