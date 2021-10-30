package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Quản lý Sách</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style_1.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"font-family: sans-serif;display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.isAdmin == \"1\" ? \"block\":\"none\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Hero Section Begin -->\n");
      out.write("    <section class=\"hero hero-normal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"hero__categories\">\n");
      out.write("                        <div class=\"hero__categories__all\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                            <span>All departments</span>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Fresh Meat</a></li>\n");
      out.write("                            <li><a href=\"#\">Vegetables</a></li>\n");
      out.write("                            <li><a href=\"#\">Fruit & Nut Gifts</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Berries</a></li>\n");
      out.write("                            <li><a href=\"#\">Ocean Foods</a></li>\n");
      out.write("                            <li><a href=\"#\">Butter & Eggs</a></li>\n");
      out.write("                            <li><a href=\"#\">Fastfood</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Onion</a></li>\n");
      out.write("                            <li><a href=\"#\">Papayaya & Crisps</a></li>\n");
      out.write("                            <li><a href=\"#\">Oatmeal</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Bananas</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <div class=\"hero__search\">\n");
      out.write("                        <div class=\"hero__search__form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <div class=\"hero__search__categories\">\n");
      out.write("                                    All Categories\n");
      out.write("                                    <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" placeholder=\"What do yo u need?\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">SEARCH</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"hero__search__phone\">\n");
      out.write("                            <div class=\"hero__search__phone__icon\">\n");
      out.write("                                <i class=\"fa fa-phone\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone__text\">\n");
      out.write("                                <h5>+65 11.188.888</h5>\n");
      out.write("                                <span>support 24/7 time</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <section class=\"breadcrumb-section set-bg\" data-setbg=\"img/breadcrumb.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div class=\"breadcrumb__text\">\n");
      out.write("                        <h2>Quản Lý Sách</h2>\n");
      out.write("                        <div class=\"breadcrumb__option\">\n");
      out.write("                            <a href=\"loadHomePage\">Trang chủ</a>\n");
      out.write("                            <span>Quản lý sách</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("    <!-- Shoping Cart Section Begin -->\n");
      out.write("    <section class=\"shoping-cart spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"shoping__cart__table\">\n");
      out.write("                        <div class=\"col-lg-9\">\n");
      out.write("                            <div class=\"hero__search\">\n");
      out.write("                                <div class=\"hero__search__form\">\n");
      out.write("                                    <form action=\"#\">\n");
      out.write("                                        <div class=\"hero__search__categories\">\n");
      out.write("                                            All Categories\n");
      out.write("                                            <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Sách bạn tìm kiếm?\">\n");
      out.write("                                        <button type=\"submit\" class=\"site-btn\">Tìm</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone\" style=\"cursor: pointer\" title=\"Thêm sách\">\n");
      out.write("                                    <div class=\"hero__search__phone__icon\">\n");
      out.write("                                        <a href=\"loadAddBookPage\"><i class=\"fa fa-plus\"></i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone\" style=\"cursor: pointer\" title=\"Thêm Thể Loại Mới\">\n");
      out.write("                                    <div class=\"hero__search__phone__icon\">\n");
      out.write("                                         <a href=\"loadAddCatePage\"><i class=\"fa fa-plus\"></i></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"shoping__product\" style=\"width: 30%\">Sách</th>\n");
      out.write("                                    <th style=\"width: 15%\">ID</th>\n");
      out.write("                                    <th style=\"width: 30%\">Tác giả</th>\n");
      out.write("                                    <th style=\"width: 30%\">Lượt mượn</th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                \n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"shoping__checkout\">\n");
      out.write("                        <h5>Danh sách</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Tổng số lượng <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sls}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Shoping Cart Section End -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Js Plugins -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("    <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listB}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"shoping__cart__item\">\n");
          out.write("                                        <a href=\"loadViewInfoBookPage?bookID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <img style=\"width: 120px;\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.anhMH}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.tenSach}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.tenSach}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.tenSach}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                        </a>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"shoping__cart__quantity\">\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"shoping__cart__quantity\">\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.tacGia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"shoping__cart__quantity\">\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.luotMuon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"shoping__cart__item__close\">\n");
          out.write("                                        <span class=\"icon_close\"></span>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
