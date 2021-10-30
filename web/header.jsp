 <%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Humberger Begin -->
    <div class="humberger__menu__overlay"></div>
    <div class="humberger__menu__wrapper">
        <div class="humberger__menu__logo">
            <a href="loadHomePage"><img src="img/logo.png" alt=""></a>
        </div>
        <div class="humberger__menu__cart">
            <ul>
                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
            </ul>
            <div class="header__cart__price">item: <span>$150.00</span></div>
        </div>
        <c:if test="${sessionScope.Logining == null}">
        <div class="humberger__menu__widget">
            
            
            <div class="header__top__right__auth">
                <a href="loadLoginPage"><i class="fa fa-user"></i> Đăng Nhập</a>
            </div>
        </div>
        </c:if>
        <c:if test="${sessionScope.Logining != null}">
        <div class="humberger__menu__widget">
            <div class="header__top__right__auth">
                <a href="loadManagerInfo"><i class="fa fa-user-secret"></i>${sessionScope.name}</a>
            </div>
            <div class="header__top__right__auth">
                <a href="logout"><i class="fa fa-sign-out"></i> Đăng Xuất</a>
            </div>
        </div>
        </c:if>
        
        <nav class="humberger__menu__nav mobile-menu">
            <ul>
                <li class="active"><a href="loadHomePage">Trang Chủ</a></li>
                <li><a href="#">Thư Viện</a></li>
                <c:if test="${sessionScope.Logining != null && sessionScope.isAdmin == 1}">
                    <li><a href="#">Quản Lý</a>
                        <ul class="header__menu__dropdown">
                            <li><a href="loadManagerBookPage">Quản Lý Sách</a></li>
                            <li><a href="loadManagerUserPage">Quản Lý Người Dùng</a></li>
                            <li><a href="#">Danh sách Book đã cho thuê </a></li>
                            <li><a href="#">Quản Lý Blog</a></li>
                        </ul>
                    </li>
                </c:if>
                <li><a href="#">Blog</a></li>
                <c:if test="${sessionScope.Logining != null && sessionScope.isAdmin != 1}">
                    <li><a href="./contact.html">Contact</a></li>
                </c:if>
            </ul>
        </nav>
        <div id="mobile-menu-wrap"></div>
        <div class="header__top__right__social">
            <a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
            <a href="https://twitter.com/?lang=vi"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-pinterest-p"></i></a>
        </div>
        <div class="humberger__menu__contact">
            <ul>
                <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                <li>Free Shipping for all Order of $99</li>
            </ul>
        </div>
    </div>
    <!-- Humberger End -->
        <!-- Header Section Begin -->
    <header class="header">
        <div class="header__top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__left">
                            <ul>
                                <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                                <li>Free Shipping for all Order of $99</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__right">
                            <div class="header__top__right__social">
                                <a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
                                <a href="https://twitter.com/?lang=vi"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-linkedin"></i></a>
                                <a href="#"><i class="fa fa-pinterest-p"></i></a>
                            </div>
                            <c:if test="${sessionScope.Logining == null}">
                            <div class="header__top__right__auth">
                                <a href="loadLoginPage"><i class="fa fa-user"></i> Đăng nhập</a>
                            </div>
                            </c:if>
                            <c:if test="${sessionScope.Logining != null}">
                            <div class="header__top__right__auth">
                                <a href="loadManagerInfo"><i class="fa fa-user-secret"></i> ${sessionScope.name}</a>
                            </div>  
                            <div class="header__top__right__auth">
                                <a href="logout"><i class="fa fa-sign-out"></i> Đăng Xuất</a>
                            </div>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="header__logo">
                        <a href="loadHomePage"><img src="img/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <nav class="header__menu">
                        <ul>
                            <li class="active"><a href="loadHomePage">Home</a></li>
                            <li><a href="#">Thư Viện</a></li>
                            <c:if test="${sessionScope.Logining != null && sessionScope.isAdmin == 1}">
                                <li><a href="#">Quản Lý</a>
                                    <ul class="header__menu__dropdown">
                                        <li><a href="loadManagerBookPage">Quản Lý Sách</a></li>
                                        <li><a href="loadManagerUserPage">Quản Lý Người Dùng</a></li>
                                        <li><a href="#">Danh sách Book đã cho thuê </a></li>
                                        <li><a href="#">Quản Lý Blog</a></li>
                                    </ul>
                                </li>
                            </c:if>
                            
                            <li><a href="./blog.html">Diễn Đàng</a></li>
                            <c:if test="${sessionScope.Logining != null && sessionScope.isAdmin != 1}">
                                <li><a href="./contact.html">Contact</a></li>
                            </c:if>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <div class="header__cart">
                        <ul>
                            <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                            <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                        </ul>
                        <div class="header__cart__price">item: <span>$150.00</span></div>
                    </div>
                </div>
            </div>
            <div class="humberger__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>
    <!-- Header Section End -->
    
