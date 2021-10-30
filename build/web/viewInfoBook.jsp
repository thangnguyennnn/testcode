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
                        <h2>Quản Lý Thông Tin Sách</h2>
                        <div class="breadcrumb__option">
                            <a href="loadHomePage">Trang chủ</a>
                            <span>${book.tenSach}</span>
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
                <form action="changeInfoBook" method="post" enctype="multipart/form-data">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">
                            <c:if test="${checkUpdateBook == false}">
                                <div class="alert alert-warning">
                                    <strong>Thông báo!</strong> Vui lòng nhập chính xác mật khẩu của bạn!
                                </div>
                            </c:if>
                            <c:if test="${checkUpdateBook == true}">
                                <div class="alert alert-success">
                                    <strong>Thông báo!</strong> Thay đổi thành công!
                                </div>
                            </c:if>    
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Mã Sách<span>*</span></p>
                                        <input value="${book.bookID}" type="text" readonly name="bookID">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Tên sách<span>*</span></p>
                                        <input value="${book.tenSach}" type="text" name="tenSach">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input">
                                <p>Tác giả<span>*</span></p>
                                <input value="${book.tacGia}" type="text" placeholder="" class="checkout__input__add" name="tacGia">
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group">
                                          <p>Thể Loại<span>*</span></p>
                                          <select name="cate" class="checkout__input">
                                          <c:forEach items="${listC}" var="l">
                                              <option value="${l.cID}" ${l.cID == book.theLoai ? "selected":""}>${l.cName}</option>
                                          </c:forEach>
                                          </select>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="checkout__input">
                                        <p>Ngày xuất bản<span>*</span></p>
                                        <input value="${book.ngayXB}" type="date" name="ngayXB">
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="checkout__input">
                                        <p>Lượt Mượn<span>*</span></p>
                                        <input value="${book.luotMuon}" type="text" name="luotmuon" readonly>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="checkout__input">
                                        <p>Thời gian<span>*</span></p>
                                        <input value="${book.thoiGianMuon}" type="text" name="tg">
                                    </div>
                                </div>
                            </div> 
                            <div class="checkout__input">
                                <p>Hình ảnh 1<span>*</span></p>
                                <input value="" type="file" placeholder="Hình ảnh" class="form-control" name="photo1">
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 2<span>*</span></p>
                                <input value="" type="file" placeholder="Hình ảnh" class="form-control" name="photo2">
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 3<span>*</span></p>
                                <input value="" type="file" placeholder="Hình ảnh" class="form-control" name="photo3">
                            </div>
                            <div class="checkout__input">
                                <p>Hình ảnh 4<span>*</span></p>
                                <input value="" type="file" placeholder="Hình ảnh" class="form-control" name="photo4">
                            </div>
                            <div class="checkout__input">
                                <p>Mật Khẩu<span>*</span></p>
                                <small class="form-text text-muted">Để đổi thông tin vui lòng nhập chính xác mật khẩu của bạn</small>
                                <input value="" type="password" name="UB_Pass" required>
                            </div>
                            <button type="submit" class="site-btn">Thay đổi thông tin</button>     
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="checkout__order">
                                <h4>THÔNG TIN</h4>
                                <div class="checkout__order__products">Thuộc tính <span>Giá trị</span></div>
                                <ul>
                                    <li>
                                        <div class="row">
                                            <div class=" col-lg-6">
                                                <img style="width: 100%;"  src="${book.anhMH}" class="rounded" alt="image">
                                            </div>
                                            <div class=" col-lg-6">
                                                <img style="width: 100%;"  src="${book.anhMH1}" class="rounded" alt="image">
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class=" col-lg-6">
                                                <img style="width: 100%;"  src="${book.anhMH2}" class="rounded" alt="image">
                                            </div>
                                            <div class=" col-lg-6">
                                                <img style="width: 100%;"  src="${book.anhMH3}" class="rounded" alt="image">
                                            </div>
                                        </div>
                                        
                                    </li>
                                    <li>Tên sách <span>${book.tenSach}</span></li>
                                    <li>Tác giả <span>${book.tacGia}</span></li>
                                    <li>Thể loại <span>${cateName}</span></li>
                                    <li>Ngày xuất bản <span>${book.ngayXB}</span></li>
                                    <li>Lượt Mượn <span>${book.luotMuon}</span></li>
                                    <li>Số ngày mượn <span>${book.thoiGianMuon}</span></li>
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
