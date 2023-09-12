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
					<div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="sellerRegForm">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">판매자 등록</h1>
                            </div>
                            <form class="user">
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user" name="id"
											id="id" placeholder="Id">
									</div>
									<div class="col-sm-6">
										<input type="text" class="form-control form-control-user" name="pass"
											id="pass" placeholder="Password">
									</div>
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" name="name" 
                                    	id="name" placeholder="Name"> 
                                        
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" name="address" 
                                    	id="address" placeholder="Address">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" name="phone" 
                                    	id="phone" placeholder="Phone / 010-XXXX-XXXX">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" name="bNumber" 
                                    	id="bNumber" placeholder="Business Number / XXX-XX-XXXXX">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control form-control-user" name="auth" 
                                    	id="auth" value="판매자" disabled>
                                </div>
								<div class="form-check">
									<input type="radio" class="form-check-input" id="member" name="authRadio" value="회원" checked>
									<label class="form-check-label" for="member">회원</label>
								</div>
								<div class="form-check">
									<input type="radio" class="form-check-input" id="seller" name="authRadio" value="판매자">
									<label class="form-check-label" for="seller">판매자</label>
								</div>
								<hr> 
                                <button type="button" id="regBtn" class="btn btn-primary btn-user btn-block" disabled>
                                    등록
                                </button>
							</form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                   
                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
            
			<%@include file="footer.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			var flag1=false;
			var flag2=false;
			var flag3=false;
			var flag4=false;
			var flag5=false;
			var flag6=false;
			
			$('#id').on('blur', function() {
				var idV = $(this).val();
				// 아이디 형식에 대한 정규식 선언(영어와 숫자를 포함하여 글자수 제한 6)
				var idptrn = /^[a-zA-Z]+[a-zA-Z0-9]{5,}$/g;
				if (idptrn.test(idV)) {
				// 정규식 조건에 맞는 경우
					$(this).css('outline', '3px solid green');
					console.log("정규식에 적합할 때")
					flag1=true;
				} else {
					if(idV!=""){
					// 정규식 조건에 맞지 않는 경우
						$(this).css('outline', '3px solid red');
						flag1=false;
						console.log("정규식에 부합할 때")
					}
				}
				checkBtn();
			});
			$('#pass').on('blur', function(){
				var passV = $(this).val();
				// 비밀번호 형식에 대한 정규식 선언(영어 대문자와 소문자, 숫자, 특수문자중 2개 이상 입력 및 글자 수 제한 8~20)
				var passptrn = /^(?!((?:[A-Za-z]+)|(?:[~!@#$%^&*()_+=]+)|(?:[0-9]+))$)[A-Za-z\d~!@#$%^&*()_+=]{8,20}$/;
				
				if(passptrn.test(passV)){
					$(this).css('outline', '3px solid green');
					flag2=true;
				} else {
					if(passV!=""){
						$(this).css('outline', '3px solid red');
						flag2=false;
					}
				}
				checkBtn();
			});		
			$('#name').on('blur', function(){
				var nameV = $(this).val();
				// 한글 최소 1글자
				var nameptrn = /^[가-힣]{1,}$/;
				
				if(nameptrn.test(nameV)){
					$(this).css('outline', '3px solid green');
					flag3=true;
				} else {
					if(nameV!=""){
						$(this).css('outline', '3px solid red');
						flag3=false;
					}	
				}
				checkBtn();
			});		
			$('#address').on('blur', function(){
				var addressV = $(this).val();
				
				var addressptrn = /^(?:서울|인천|경기|강원|충북|충남|세종|대전|경북|경남|대구|전북|전남|광주|부산|울산|제주)(?:\s?[ㄱ-ㅣ가-힣]+(?:시|군|구))$/;
				
				if(addressptrn.test(addressV)){
					$(this).css('outline', '3px solid green');
					flag4=true;
				} else {
					if(addressV!=""){
						$(this).css('outline', '3px solid red');
						flag4=false;
					}
				}
				checkBtn();
			});		
			$('#phone').on('blur', function(){
				var phoneV = $(this).val();
				// 한글 최소 1글자
				var phoneptrn = /^01([0|1|6|7|8|9])-\d{3,4}-\d{4}$/;
				
				if(phoneptrn.test(phoneV)){
					$(this).css('outline', '3px solid green');
					flag5=true;
				} else {
					if(phoneV!=""){
						$(this).css('outline', '3px solid red');
						flag5=false;
					}
				}
				checkBtn();
			});		
			$('#bNumber').on('blur', function(){
				var bNumV = $(this).val();
				// 한글 최소 1글자
				var bNumptrn = /(\d{3}-\d{2}-\d{5})/g;
				
				if(bNumptrn.test(bNumV)){
					$(this).css('outline', '3px solid green');
					flag6=true;
				} else {
					if(bNumV!=""){
						$(this).css('outline', '3px solid red');
						flag6=false;
					}
				}
				checkBtn();
			});		
			function checkBtn(){
				if(flag1&&flag2&&flag3&&flag4&&flag5&&flag6){
					$('#regBtn').prop('disabled',false)
				} else{
					$('#regBtn').prop('disabled',true)
				}
			}
		});
		
	</script>
</body>

</html>