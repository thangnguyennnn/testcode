<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Thông tin</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style_1.css" type="text/css">
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

<body style="font-family: sans-serif">
    <jsp:include page="header.jsp"></jsp:include>
    <!-- Hero Section Begin -->
    <section class="hero hero-normal">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="hero__categories">
                        <div class="hero__categories__all">
                            <i class="fa fa-bars"></i>
                            <span>All departments</span>
                        </div>
                        <ul>
                            <li><a href="#">Fresh Meat</a></li>
                            <li><a href="#">Vegetables</a></li>
                            <li><a href="#">Fruit & Nut Gifts</a></li>
                            <li><a href="#">Fresh Berries</a></li>
                            <li><a href="#">Ocean Foods</a></li>
                            <li><a href="#">Butter & Eggs</a></li>
                            <li><a href="#">Fastfood</a></li>
                            <li><a href="#">Fresh Onion</a></li>
                            <li><a href="#">Papayaya & Crisps</a></li>
                            <li><a href="#">Oatmeal</a></li>
                            <li><a href="#">Fresh Bananas</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="hero__search">
                        <div class="hero__search__form">
                            <form action="#">
                                <div class="hero__search__categories">
                                    All Categories
                                    <span class="arrow_carrot-down"></span>
                                </div>
                                <input type="text" placeholder="What do yo u need?">
                                <button type="submit" class="site-btn">SEARCH</button>
                            </form>
                        </div>
                        <div class="hero__search__phone">
                            <div class="hero__search__phone__icon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <div class="hero__search__phone__text">
                                <h5>+65 11.188.888</h5>
                                <span>support 24/7 time</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Section End -->

    <!-- Breadcrumb Section Begin -->
    <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="breadcrumb__text">
                        <h2>Quản Lý Thông Tin</h2>
                        <div class="breadcrumb__option">
                            <a href="loadHomePage">Trang chủ</a>
                            <span>${sessionScope.name}</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <h4>THÔNG TIN CHI TIẾT</h4>
                <form action="changeInfo" method="post" enctype="multipart/form-data">
                    <div class="row">
                        <div class="col-lg-7 col-md-6">
                            <c:if test="${checkUpdate == false}">
                                <div class="alert alert-warning">
                                    <strong>Thông báo!</strong> Vui lòng nhập chính xác mật khẩu của bạn!
                                </div>
                            </c:if>
                            <c:if test="${checkUpdate == true}">
                                <div class="alert alert-success">
                                    <strong>Thông báo!</strong> Thay đổi thành công!
                                </div>
                            </c:if>    
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Tài khoản<span>*</span></p>
                                        <input value="${sessionScope.Logining.tk}" type="text" readonly>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Họ Tên<span>*</span></p>
                                        <input value="${sessionScope.userInfo.hoten}" type="text" name="hoten">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input">
                                <p>Địa chỉ<span>*</span></p>
                                <input value="${sessionScope.userInfo.diaChi}" type="text" placeholder="Street Address" class="checkout__input__add" name="diaChi">
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Số điện thoại<span>*</span></p>
                                        <input value="${sessionScope.userInfo.sdt}" type="text" name="sdt">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Email<span>*</span></p>
                                        <input value="${sessionScope.userInfo.email}" type="email" name="em">
                                    </div>
                                </div>
                            </div> 
                            <div class="checkout__input">
                                <p>Hình ảnh<span>*</span></p>
                                <input value="" type="file" placeholder="Hình ảnh" class="form-control" name="photo">
                            </div>
                            <div class="checkout__input">
                                <p>Mật Khẩu<span>*</span></p>
                                <small class="form-text text-muted">Để đổi thông tin vui lòng nhập chính xác mật khẩu của bạn</small>
                                <input value="" type="password" name="C_Pass" required>
                            </div>
                            <button type="submit" class="site-btn">Thay đổi thông tin</button>     
                        </div>
                        <div class="col-lg-5 col-md-6">
                            <div class="checkout__order">
                                <h4>THÔNG TIN</h4>
                                <div class="checkout__order__products">Thuộc tính <span>Giá trị</span></div>
                                <ul>
                                    <li>
                                        <div class="text-center">
                                            <img src="${sessionScope.img}" class="rounded" alt="image">
                                        </div>
                                    </li>
                                    <li>Tài khoản <span>${sessionScope.Logining.tk}</span></li>
                                    <li>Họ tên <span>${sessionScope.userInfo.hoten}</span></li>
                                    <li>Email <span>${sessionScope.userInfo.email}</span></li>
                                    <li>Số điện thoại <span>${sessionScope.userInfo.sdt}</span></li>
                                    <li>Địa chỉ <span>${sessionScope.userInfo.diaChi}</span></li>
                                </ul>
                                
                            </div>
                        </div>
                           
                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->

    <jsp:include page="footer.jsp"></jsp:include>

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>

 

</body>

</html>
