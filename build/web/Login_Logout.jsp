<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
        
	<link rel="stylesheet" href="./css/style.css">
	<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <title>
		Đăng Nhập
	</title>
        <style>
            .alert-warning {
                color: #856404;
                background-color: #fff3cd;
                border-color: #ffeeba;
            }
            
            .alert {
                position: relative;
                padding: 0.75rem 1.25rem;
                margin-bottom: 1rem;
                border: 1px solid transparent;
                border-radius: 0.25rem; 
            }
            
            .alert-success {
                color: #155724;
                background-color: #d4edda;
                border-color: #c3e6cb;
            }
        </style>
</head>

<body>
    <div id="container" class="container">
		<!-- FORM SECTION -->
		<div class="row">
			<!-- SIGN UP -->
			<div class="col align-items-center flex-col sign-up">
				<div class="form-wrapper align-items-center">
                                    <form  action="signup" method="post">
					<div class="form sign-up">
                                            <div class="input-group">
                                                    <i class='bx bxs-user'></i>
                                                    <input oninput="checkUsernameExit(this)" id="username" name="username" type="text" placeholder="Tài khoản">

                                            </div>
                                            <div id="div_Username">

                                            </div>
                                            <div class="input-group">
                                                    <i class='bx bx-mail-send'></i>
                                                    <input oninput="checkEmailExit(this)" id="email" name="email" type="text" placeholder="Email">
                                            </div>
                                            <div id="Div_email">

                                            </div>
                                            <div class="input-group">
                                                    <i class='bx bxs-lock-alt'></i>
                                                    <input oninput="checkPass(this)" id="password" name="password" type="password" placeholder="Mật khẩu">

                                            </div>
                                            <div id="div_Pass">

                                            </div>
                                            <div class="input-group">
                                                    <i class='bx bxs-lock-alt'></i>
                                                    <input oninput="checkRePass(this)" name="cofirm" id="confirm" type="password" placeholder="Xác nhận mật khẩu">

                                            </div>
                                            <div id="div_rePass">

                                            </div>
                                            <button>
                                                    Đăng ký
                                            </button>
                                            <p>
                                                    <span>
                                                            Bạn đã có tài khoản?
                                                    </span>
                                                    <b onclick="toggle()" class="pointer">
                                                            Đăng nhập tại đây
                                                    </b>
                                            </p>
					</div>
                                    </form>
				</div>
				<div class="form-wrapper">
					<div class="social-list align-items-center sign-up">
						<div class="align-items-center facebook-bg">
							<i class='bx bxl-facebook'></i>
						</div>
						<div class="align-items-center google-bg">
							<i class='bx bxl-google'></i>
						</div>
						<div class="align-items-center twitter-bg">
							<i class='bx bxl-twitter'></i>
						</div>
						<div class="align-items-center insta-bg">
							<i class='bx bxl-instagram-alt'></i>
						</div>
					</div>
				</div>
			</div>
			<!-- END SIGN UP -->
			<!-- SIGN IN -->
			<div class="col align-items-center flex-col sign-in">
				<div class="form-wrapper align-items-center">
                                    <form action="login" method="post">
					<div class="form sign-in">
                                            <c:if test="${sessionScope.checkLogin == false}">
                                                <div class="alert alert-warning">
                                                    <strong>Nhắc nhở!</strong> Vui lòng kiểm tra tài khoản và mật khẩu!
                                                </div>
                                            </c:if>
                                            <c:if test="${checkAdd == false}">
                                                <div class="alert alert-warning">
                                                    <strong>Nhắc nhở!</strong> Đăng ký không thành công!
                                                </div>
                                            </c:if>    
						<div class="input-group">
							<i class='bx bxs-user'></i>
                                                        <input name="L_username" type="text" placeholder="Tài khoản">
						</div>
						<div class="input-group">
							<i class='bx bxs-lock-alt'></i>
                                                        <input name="L_password" type="password" placeholder="Mật khẩu">
						</div>
						<button>
							Đăng nhập
						</button>
						<p>
							<b>
								Quên mật khẩu
							</b>
						</p>
						<p>
							<span>
								Bạn chưa có tài khoản?
							</span>
							<b onclick="toggle()" class="pointer">
								Đăng ký tại đây
							</b>
						</p>
					</div>
                                    </form>
				</div>
				<div class="form-wrapper">
					<div class="social-list align-items-center sign-in">
						<div class="align-items-center facebook-bg">
							<i class='bx bxl-facebook'></i>
						</div>
						<div class="align-items-center google-bg">
							<i class='bx bxl-google'></i>
						</div>
						<div class="align-items-center twitter-bg">
							<i class='bx bxl-twitter'></i>
						</div>
						<div class="align-items-center insta-bg">
							<i class='bx bxl-instagram-alt'></i>
						</div>
					</div>
				</div>
			</div>
			<!-- END SIGN IN -->
		</div>
		<!-- END FORM SECTION -->
		<!-- CONTENT SECTION -->
		<div class="row content-row">
			<!-- SIGN IN CONTENT -->
			<div class="col align-items-center flex-col">
				<div class="text sign-in">
					<h2>
						Welcome back
					</h2>
				</div>
				<div class="img sign-in">
					<img src="imgLogin/undraw_different_love_a3rg.svg" alt="welcome">
				</div>
			</div>
			<!-- END SIGN IN CONTENT -->
			<!-- SIGN UP CONTENT -->
			<div class="col align-items-center flex-col">
				<div class="img sign-up">
					<img src="imgLogin/undraw_creative_team_r90h.svg" alt="welcome">
				</div>
				<div class="text sign-up">
					<h2>
						Tham gia cùng chúng tôi
					</h2>
				</div>
			</div>
			<!-- END SIGN UP CONTENT -->
		</div>
		<!-- END CONTENT SECTION -->
	</div>

	<script src="./js/login_form.js"></script>
        <script src="vendor/jquery/jquery.min.js"></script>
        <script>
            function checkUsernameExit(param){
                var username = param.value;
                $.ajax({
                    url : "checkUsernameExist",
                    type : "post",
                    data: {
                        Username : username 
                    },
                    success: function (data){
                        var divUser = document.getElementById("div_Username");
                        divUser.innerHTML = data;
                    },
                    error: function (xhr){

                    }
                });
            }
            
            function checkEmailExit(param){
                var email = param.value;
                $.ajax({
                    url : "checkEmailExist",
                    type : "post",
                    data: {
                        Email_User : email 
                    },
                    success: function (data){
                        var divEmail = document.getElementById("Div_email");
                        divEmail.innerHTML = data;
                    },
                    error: function (xhr){

                    }
                });
            }

            function checkPass(param){
                var Password = param.value;
                $.ajax({
                   url: "CheckPass",
                   type: "post",
                   data: {
                       Pass : Password
                   },
                   success: function (data){
                        var divPass = document.getElementById("div_Pass");
                        divPass.innerHTML = data;
                    },
                    error: function (xhr){

                    }
                });
            }


            function checkRePass(param){
                var rePass = param.value;

                $.ajax({
                   url: "checkRePass",
                   type: "post",
                   data: {
                       Re_Pass : rePass
                   },
                   success: function (data){
                       var divRePass = document.getElementById("div_rePass");
                       divRePass.innerHTML = data;
                   }
                });
            }
        </script>
</body>

</html>