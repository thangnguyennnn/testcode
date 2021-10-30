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
            
            .checkout__input {
                width: 100%;
             }
        </style>
</head>

<body style="font-family: sans-serif; display: ${sessionScope.isAdmin == "1" && sessionScope.Logining != null ? "block":"none"}">
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
                        <h2>Quản Lý Thông Tin Người Dùng</h2>
                        <div class="breadcrumb__option">
                            <a href="loadHomePage">Trang chủ</a>
                            <span>${u}</span>
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
                <form action="addAdmin">
                    <div class="row">
                        <div class="col-lg-12 col-md-12">
                            <div class="checkout__order">
                                <h4>THÔNG TIN</h4>
                                <div class="checkout__order__products">Thuộc tính <span>Giá trị</span></div>
                                <ul>
                                    <li>
                                        <div class=" col-lg-6">
                                            <img style="width: 100%;"  src="${user.anhCMND}" class="rounded" alt="image">
                                        </div>
                                    </li>
                                    <li>Mã Thẻ Thư Viện <span>${account.maThe}</span></li>
                                    <li>Tên người dùng <span>${user.hoten}</span></li>
                                    <li>Địa chỉ <span>${user.diaChi}</span></li>
                                    <li>Email <span>${user.email}</span></li>
                                    <li>Số điện thoại <span>${user.sdt}</span></li>
                                    <li>Số sách đã mượn <span>5</span></li>
                                        <li>Quyền 
                                            <span>
                                                <c:if test="${account.isAdmin == 1}">
                                                    Quản Trị Viên
                                                </c:if>
                                                <c:if test="${account.isAdmin == 0}">
                                                    Người Dùng
                                                </c:if>
                                            </span>
                                        </li>
                                </ul>
                                
                            </div>
                        </div>
                           
                    </div>
                    <div class="row">
                        <div class="col-lg-12 col-md-12">
                            <c:if test="${checkPass == false}">
                                <div class="alert alert-warning">
                                    <strong>Thông báo!</strong> Vui lòng nhập chính xác mật khẩu của bạn!
                                </div>
                            </c:if>
                            <c:if test="${checkAddAdmin == true}">
                                <div class="alert alert-success">
                                    <strong>Thông báo!</strong> Đã thêm ${user.hoten} là quản trị viên!
                                </div>
                            </c:if>    
                            <c:if test="${check_remove == true}">
                                <div class="alert alert-success">
                                    <strong>Thông báo!</strong> Đã gỡ ${user.hoten} ra khỏi ban quản trị viên!
                                </div>
                            </c:if> 
                            <c:if test="${account.maThe != sessionScope.Logining.maThe}">
                                <div class="checkout__input">
                                    <p>Mật Khẩu<span>*</span></p>
                                    <small class="form-text text-muted">Để đổi thông tin vui lòng nhập chính xác mật khẩu của bạn</small>
                                    <input value="" type="password" name="CA_Pass" required>
                                </div>
                                <c:if test="${account.isAdmin == 0}">
                                    <button name="btAction" value="add" type="submit" class="site-btn">Cấp quyền Quản trị viên</button>
                                </c:if>
                                <c:if test="${account.isAdmin == 1}">
                                    <button name="btAction" value="remove" type="submit" class="site-btn">Gỡ quyền Quản trị viên</button>
                                </c:if>
                            </c:if>
                            
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
