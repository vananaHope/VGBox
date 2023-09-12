<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<c:set var="path" 
	value="${pageContext.request.contextPath}"/>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>회원가입 페이지</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="./css/register.css">
	<script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/jquery.validate.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/additional-methods.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="./js/my-login.js"></script>
	<script>
	function hide() {
		$("#businessAll").hide();
	}
	
	function show() {
		$("#businessAll").show();
	}
	$(document).ready(function () {

		$.validator.addMethod("regex", function(value, element, regexp) {
		    var regExp = new RegExp(regexp);
		    return regExp.test(value);
		});

		$("#frm").validate({
				rules: {
					name:{
						required:true,
						rangelength:[2,5]
					},
					id:{
						required:true,
						regex:"/^[a-z0-9]{6,20}$/",
						remote:{
							type:"post",
							url:"${path}/checkId.do",
							data:{
								id: function(){
									return $("#id").val();
								},
								choice: function(){
									return $("#choice").val();
								}
							}
						}
					},
					password:{
						required:true,
						regex:"/^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$/"
					},
					passwordR:{
						required:true,
						equalTo:"#password"
					},
					address:{
						required:true
					},
					contact:{
						required:true,
						regex:"/^(0[2-8][0-5]?|01[01346-9])-?([1-9]{1}[0-9]{2,3})-?([0-9]{4})$/"
					},
					businessNum:{
						required:{
							depends:function(){
								return $("input[id=sellerChoice]:checked").val()=="seller"
							}
						}
					}
					
				},
				messages:{
					name:{
						required: "이름은 필수 입력입니다.",
						rangelength: "이름은 {0}자에서 {1}자까지 사용 가능합니다."
					},
					id:{
						required: "아이디는 필수 입력입니다.",
						regex: "영문 혹은 영문과 숫자를 조합하여 최소 6자리이상 20자리로 입력해주세요",
						remote: "중복된 아이디입니다."
					},
					password:{
						required: "비밀번호는 필수 입력입니다.",
						regex: "영문, 숫자, 특수문자를 포함하여 8~15자 비밀번호를 입력해주세요"
					},
					passwordR:{
						required: "비밀번호 확인은 필수 입력입니다.",
						equalTo: "비밀번호가 일치하지 않습니다."
					},
					address:{
						required: "주소는 필수 입력입니다."
					},
					contact:{
						required: "전화번호는 필수 입력입니다.",
						regex: "'-'를 포함하여 전화번호를 입력해주세요"
					},
					businessNum:{
						required:"사업자 번호를 입력해주세요"
					}
				},
				submitHandler:function(){
					console.log("submit");
				}
			})
		})	
		
</script>
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title">회원가입</h4>
							<form method="POST" id="frm" novalidate="">
								<input type="radio" class="memChoice" id="sellerChoice" name="choice" value="seller" onclick="show()">판매자
								<input type="radio" class="memChoice" id="userChoice" name="choice" value="user" onclick="hide()" checked>구매자
								<div class="form-group">
									<label for="name">이름</label>
									<input id="name" type="text" class="form-control" name="name" required autofocus>
									<small class="form-text text-muted">한글로 2~5자 이내로 입력해주세요</small>
								</div>

								<div class="form-group" id="idreg">
									<label for="id">아이디</label>
									<input id="id" type="text" class="form-control" name="id" required>
									<button class="btn btn-primary" type="button" id="idCheck">중복확인</button>
									<small class="form-text text-muted">영문 혹은 영문과 숫자를 조합하여 6~20자리로 입력해주세요</small>
								</div>

								<div class="form-group" id="pwdreg">
									<label for="password">비밀번호</label>
									<input id="password" type="password" class="form-control" name="password" 
										required data-eye>
									<small class="form-text text-muted">영문, 숫자, 특수문자를 포함하여 8~15자 비밀번호를 입력해주세요</small>
								</div>

								<div class="form-group" id="pwdregR">
									<label for="passwordR">비밀번호 확인</label>
									<input id="passwordR" type="password" class="form-control" name="passwordR" required>
								</div>
								<div class="form-group">
									<label for="address">주소</label>
									<input id="address" type="text" class="form-control" name="address" required data-eye>
								</div>
								<div class="form-group" id="contactreg">
									<label for="contact">연락처</label>
									<input id="contact" type="text" class="form-control" name="contact" required data-eye>
									<small class="form-text text-muted">'-'를 포함하여 연락처를 입력해주세요</small>
								</div>
								<div class="form-group" id="businessAll">
									<label for="businessNum">사업자 번호</label>
									<input id="businessNum" type="text" class="form-control" name="businessNum" required data-eye>
									<small class="form-text text-muted">'-'를 포함하여 사업자 번호를 입력해주세요</small>
								</div>

								<div class="form-group m-0">
									<button type="submit" id="regBtn" class="btn btn-primary btn-block">
										회원가입
									</button>
								</div>
								<div class="mt-4 text-center">
									이미 계정을 가지고 계신가요? <a href="index.html">로그인</a>
								</div>
							</form>
						</div>
					</div>
					<div class="footer">
						Copyright &copy; 2023 &mdash; VeggieBox
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>