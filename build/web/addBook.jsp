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
                        <h2>Thêm Sách Mới</h2>
                        <div class="breadcrumb__option">
                            <a href="loadHomePage">Trang chủ</a>
                            <span>Thêm Sách</span>
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
                <h4>THÔNG TIN SÁCH MỚI</h4>
                <form action="addBook" method="post" enctype="multipart/form-data">
                    <div class="row">
                        <div class="col-lg-12 col-md-6">
                            <c:if test="${addBook == false}">
                                <div class="alert alert-warning">
                                    <strong>Thông báo!</strong> Vui lòng nhập chính xác mật khẩu của bạn!
                                </div>
                            </c:if>
                            <c:if test="${addBook == true}">
                                <div class="alert alert-success">
                                    <strong>Thông báo!</strong> Thêm thành công!
                                </div>
                            </c:if>    
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Tên sách<span>*</span></p>
                                        <input value="" type="text" name="tenSach">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Tác Giả<span>*</span></p>
                                        <input value="" type="text" name="tacGia">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                              <div class="col-lg-12">
                                <div class="form-group">
                                  <p>Thể Loại<span>*</span></p>
                                  <select name="cate" class="checkout__input">
                                  <c:forEach items="${listC}" var="l">
                                      <option value="${l.cID}">${l.cName}</option>
                                  </c:forEach>
                                      
                                  </select>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="checkout__input">
                                        <p>Ngày Xuất Bản<span>*</span></p>
                                        <input value="" type="date" name="ngayXB">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Lượt Mượn<span>*</span></p>
                                        <input value="0" type="text" name="luotMuon" readonly>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Số ngày cho phép mượn<span>*</span></p>
                                        <input value="" type="text" name="sncpm">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 1<span>*</span></p>
                                    <input  value="" type="file" placeholder="Hình ảnh" class="form-control" name="photoBook1"> 
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 2<span>*</span></p>
                                    <input  value="" type="file" placeholder="Hình ảnh" class="form-control" name="photoBook2"> 
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 3<span>*</span></p>
                                    <input  value="" type="file" placeholder="Hình ảnh" class="form-control" name="photoBook3"> 
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 4<span>*</span></p>
                                    <input  value="" type="file" placeholder="Hình ảnh" class="form-control" name="photoBook4"> 
                            </div>
                            <div class="checkout__input">
                                <p>Mật Khẩu<span>*</span></p>
                                <small class="form-text text-muted">Để thêm vui lòng nhập chính xác mật khẩu của bạn</small>
                                <input value="" type="password" name="T_Pass" required>
                            </div>
                            <button type="submit" class="site-btn">Thay đổi thông tin</button>     
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
