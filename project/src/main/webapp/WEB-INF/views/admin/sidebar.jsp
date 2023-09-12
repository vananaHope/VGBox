<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" 
   value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fab fa-apple"></i>
                </div>
                <div class="sidebar-brand-text mx-3">VG ADMIN<sup>v.01</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">
                    <i class="fas fa-fw fa-home"></i>
                    <span>ADMIN HOME</span>
                </a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                MEMBER
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link" id="memList" href="#">
                    <i class="fas fa-fw fa-table"></i>
                    <span>회원관리</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-table"></i>
                    <span>판매자관리</span>
                </a>
                <div id="collapseTwo" class="collapse show" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="#" id="sellerList">정보 조회</a>
                        <a class="collapse-item" href="#" id="sellerReg">판매자 등록</a>
                        <a class="collapse-item" href="#">멤버쉽 관리</a> 
                    </div>
                </div>
            </li>
            <hr class="sidebar-divider">
			<div class="sidebar-heading">
                PAGE
            </div>
            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-image"></i>
                    <span>메인페이지 관리</span>
                </a>
                <div id="collapseUtilities" class="collapse"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item active" href="index.jsp">이미지 등록 관리</a>
                        <a class="collapse-item" href="index.jsp">멤버쉽 상품 관리</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                SALES DETAIL
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link" href="#" data-toggle="collapse" data-target="#collapsePages" 
                	aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>판매내역 관리</span>
                </a>
                <div id="collapsePages" class="collapse" id="sideMenuChild"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="login.html">판매내역</a>
                        <a class="collapse-item" href="login.html">매출조회</a>
                    </div>
                </div>
            </li>
            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

        </ul>
        <!-- End of Sidebar -->
<script type="text/javascript">
	$(document).ready(function() {
		$("#memList").click(function() {
			location.href = "getMemList.do";
		})
		$("#sellerList").click(function() {
			location.href = "getSellerList.do";
		})
	
		$("#sellerReg").click(function() {
			location.href = "sellerRegist.do";
		})
		
	});
	function goMemInfo(){
		location.href="${path}/getMemList.do"
	}
	function goSellerInfo(){
		location.href="${path}/getSellerList.do"
	}
	function sellerReg(){
		location.href="${path}/sellerRegist.do"
	}
	$("a[class='nav-link']").click(function(){
		$("#sideMenuChild").addClass("show");
	})
</script>
  

 