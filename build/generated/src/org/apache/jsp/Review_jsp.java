package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Payment Review</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.png\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/linearicons-v1.0.0/icon-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("     <script>\n");
      out.write("function validateForm() {\n");
      out.write("  var x = document.forms[\"myForm\"][\"cno\"].value;\n");
      out.write("  if (x == \"\" || x == null) {\n");
      out.write("    alert(\"Card number must be filled out\");\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("}\n");
      out.write("</script>   \n");
      out.write("        \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"animsition\">\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t<!-- Header -->\n");
      out.write("\t<header class=\"header-v4\">\n");
      out.write("\t\t<!-- Header desktop -->\n");
      out.write("\t\t<div class=\"container-menu-desktop\">\n");
      out.write("\t\t\t<!-- Topbar -->\n");
      out.write("\t\t\t<div class=\"top-bar\">\n");
      out.write("\t\t\t\t<div class=\"content-topbar flex-sb-m h-full container\">\n");
      out.write("\t\t\t\t\t<div class=\"left-top-bar\">\n");
      out.write("\t\t\t\t\t\tFree shipping for standard order over $100\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"right-top-bar flex-w h-full\">\n");
      out.write("\t\t\t\t\t\t<a href=\"myAccount.jsp\" class=\"flex-c-m trans-04 p-lr-25\">\n");
      out.write("\t\t\t\t\t\t\tMy Account\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("                                                <a href=\"#\" class=\"flex-c-m trans-04 p-lr-25\">\n");
      out.write("\t\t\t\t\t\t\tHelp & FAQs\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m trans-04 p-lr-25\">\n");
      out.write("\t\t\t\t\t\t\tEN\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m trans-04 p-lr-25\">\n");
      out.write("\t\t\t\t\t\t\tUSD\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"wrap-menu-desktop how-shadow1\">\n");
      out.write("\t\t\t\t<nav class=\"limiter-menu-desktop container\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Logo desktop -->\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/logo-01.png\" alt=\"IMG-LOGO\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Menu desktop -->\n");
      out.write("\t\t\t\t\t<div class=\"menu-desktop\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"home-02.html\">Home</a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"product.html\">Shop</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"blog.html\">Blog</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"about.html\">About</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"contact.html\">Contact</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Icon header -->\n");
      out.write("\t\t\t\t\t<div class=\"wrap-icon-header flex-w flex-r-m\">\n");
      out.write("\t\t\t\t\t\t<div class=\"icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"zmdi zmdi-search\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart\" data-notify=\"2\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"zmdi zmdi-shopping-cart\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti\" data-notify=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"zmdi zmdi-favorite-outline\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Header Mobile -->\n");
      out.write("\t\t<div class=\"wrap-header-mobile\">\n");
      out.write("\t\t\t<!-- Logo moblie -->\t\t\n");
      out.write("\t\t\t<div class=\"logo-mobile\">\n");
      out.write("\t\t\t\t<a href=\"index.html\"><img src=\"images/icons/logo-01.png\" alt=\"IMG-LOGO\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Icon header -->\n");
      out.write("\t\t\t<div class=\"wrap-icon-header flex-w flex-r-m m-r-15\">\n");
      out.write("\t\t\t\t<div class=\"icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-search\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart\" data-notify=\"2\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-shopping-cart\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti\" data-notify=\"0\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-favorite-outline\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Button show menu -->\n");
      out.write("\t\t\t<div class=\"btn-show-menu-mobile hamburger hamburger--squeeze\">\n");
      out.write("\t\t\t\t<span class=\"hamburger-box\">\n");
      out.write("\t\t\t\t\t<span class=\"hamburger-inner\"></span>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Menu Mobile -->\n");
      out.write("\t\t<div class=\"menu-mobile\">\n");
      out.write("\t\t\t<ul class=\"topbar-mobile\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"left-top-bar\">\n");
      out.write("\t\t\t\t\t\tFree shipping for standard order over $100\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"right-top-bar flex-w h-full\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m p-lr-10 trans-04\">\n");
      out.write("\t\t\t\t\t\t\tHelp & FAQs\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m p-lr-10 trans-04\">\n");
      out.write("\t\t\t\t\t\t\tMy Account\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m p-lr-10 trans-04\">\n");
      out.write("\t\t\t\t\t\t\tEN\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"flex-c-m p-lr-10 trans-04\">\n");
      out.write("\t\t\t\t\t\t\tUSD\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"main-menu-m\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"index.html\">Home</a>\n");
      out.write("\t\t\t\t\t<ul class=\"sub-menu-m\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Homepage 1</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home-02.html\">Homepage 2</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home-03.html\">Homepage 3</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<span class=\"arrow-main-menu-m\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"product.html\">Shop</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"shoping-cart.html\" class=\"label1 rs1\" data-label1=\"hot\">Features</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"blog.html\">Blog</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"about.html\">About</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"contact.html\">Contact</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Modal Search -->\n");
      out.write("\t\t<div class=\"modal-search-header flex-c-m trans-04 js-hide-modal-search\">\n");
      out.write("\t\t\t<div class=\"container-search-header\">\n");
      out.write("\t\t\t\t<button class=\"flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search\">\n");
      out.write("\t\t\t\t\t<img src=\"images/icons/icon-close2.png\" alt=\"CLOSE\">\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t\t<form class=\"wrap-search-header flex-w p-l-15\">\n");
      out.write("\t\t\t\t\t<button class=\"flex-c-m trans-04\">\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-search\"></i>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<input class=\"plh3\" type=\"text\" name=\"search\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- Cart -->\n");
      out.write("\t<div class=\"wrap-header-cart js-panel-cart\">\n");
      out.write("\t\t<div class=\"s-full js-hide-cart\"></div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"header-cart flex-col-l p-l-65 p-r-25\">\n");
      out.write("\t\t\t<div class=\"header-cart-title flex-w flex-sb-m p-b-8\">\n");
      out.write("\t\t\t\t<span class=\"mtext-103 cl2\">\n");
      out.write("\t\t\t\t\tYour Cart\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart\">\n");
      out.write("\t\t\t\t\t<i class=\"zmdi zmdi-close\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"header-cart-content flex-w js-pscroll\">\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"header-cart-buttons flex-w w-full\">\n");
      out.write("\t\t\t\t\t\t<a href=\"shopping-cart.jsp\" class=\"flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10\">\n");
      out.write("\t\t\t\t\t\t\tView Cart\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"paymentDetails.jsp\" class=\"flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10\">\n");
      out.write("\t\t\t\t\t\t\tCheck Out\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- breadcrumb -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"bread-crumb flex-w p-l-25 p-r-15 p-t-30 p-lr-0-lg\">\n");
      out.write("\t\t\t<a href=\"home-02.html\" class=\"stext-109 cl8 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\tHome\n");
      out.write("\t\t\t\t<i class=\"fa fa-angle-right m-l-9 m-r-10\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"stext-109 cl4\">\n");
      out.write("\t\t\t\tPayment Details\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- Shoping Cart -->\n");
      out.write("\t<form class=\"bg0 p-t-75 p-b-85\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-10 col-xl-7 m-lr-auto m-b-50\">\n");
      out.write("\t\t\t\t\t<div class=\"m-l-25 m-r--38 m-lr-0-xl\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-table-shopping-cart\">\n");
      out.write("                                                    \n");
      out.write("                                                    ");

String customer = request.getParameter("customer");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "clothingdb";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<h2 align=\"center\"><font><strong>Please Check Details Before Pay</strong></font></h2><br>\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <th>productName</th>\n");
      out.write("<th>price</th>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT productName,price FROM cart  ";


resultSet = statement.executeQuery(sql);

while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write(" <td>");
      out.print(resultSet.getString("productName") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("price") );
      out.write("</td>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("        <input class=\"flex-c-m stext-101 cl0 size-116 bg3 bor14 hov-btn3 p-lr-15 trans-04 pointer\" type=\"submit\" value=\"Pay Now\" action=\"thankyou.html\"/>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("                                        </div></div></div></div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<footer class=\"bg3 p-t-75 p-b-32\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-lg-3 p-b-50\">\n");
      out.write("\t\t\t\t\t<h4 class=\"stext-301 cl0 p-b-30\">\n");
      out.write("\t\t\t\t\t\tCategories\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tWomen\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tMen\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tShoes\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tWatches\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-lg-3 p-b-50\">\n");
      out.write("\t\t\t\t\t<h4 class=\"stext-301 cl0 p-b-30\">\n");
      out.write("\t\t\t\t\t\tHelp\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tTrack Order\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tReturns \n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tShipping\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"p-b-10\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"stext-107 cl7 hov-cl1 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tFAQs\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-lg-3 p-b-50\">\n");
      out.write("\t\t\t\t\t<h4 class=\"stext-301 cl0 p-b-30\">\n");
      out.write("\t\t\t\t\t\tGET IN TOUCH\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p class=\"stext-107 cl7 size-201\">\n");
      out.write("\t\t\t\t\t\tAny questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"p-t-27\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 cl7 hov-cl1 trans-04 m-r-16\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-facebook\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 cl7 hov-cl1 trans-04 m-r-16\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-instagram\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fs-18 cl7 hov-cl1 trans-04 m-r-16\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pinterest-p\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-lg-3 p-b-50\">\n");
      out.write("\t\t\t\t\t<h4 class=\"stext-301 cl0 p-b-30\">\n");
      out.write("\t\t\t\t\t\tNewsletter\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-input1 w-full p-b-4\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input1 bg-none plh1 stext-107 cl7\" type=\"text\" name=\"email\" placeholder=\"email@example.com\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"focus-input1 trans-04\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"p-t-18\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"flex-c-m stext-101 cl0 size-103 bg1 bor1 hov-btn2 p-lr-15 trans-04\">\n");
      out.write("\t\t\t\t\t\t\t\tSubscribe\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"p-t-40\">\n");
      out.write("\t\t\t\t<div class=\"flex-c-m flex-w p-b-18\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"m-all-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-pay-01.png\" alt=\"ICON-PAY\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"m-all-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-pay-02.png\" alt=\"ICON-PAY\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"m-all-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-pay-03.png\" alt=\"ICON-PAY\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"m-all-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-pay-04.png\" alt=\"ICON-PAY\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"m-all-1\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/icons/icon-pay-05.png\" alt=\"ICON-PAY\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"stext-107 cl6 txt-center\">\n");
      out.write("\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Back to top -->\n");
      out.write("\t<div class=\"btn-back-to-top\" id=\"myBtn\">\n");
      out.write("\t\t<span class=\"symbol-btn-back-to-top\">\n");
      out.write("\t\t\t<i class=\"zmdi zmdi-chevron-up\"></i>\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(\".js-select2\").each(function(){\n");
      out.write("\t\t\t$(this).select2({\n");
      out.write("\t\t\t\tminimumResultsForSearch: 20,\n");
      out.write("\t\t\t\tdropdownParent: $(this).next('.dropDownSelect2')\n");
      out.write("\t\t\t});\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/MagnificPopup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.js-pscroll').each(function(){\n");
      out.write("\t\t\t$(this).css('position','relative');\n");
      out.write("\t\t\t$(this).css('overflow','hidden');\n");
      out.write("\t\t\tvar ps = new PerfectScrollbar(this, {\n");
      out.write("\t\t\t\twheelSpeed: 1,\n");
      out.write("\t\t\t\tscrollingThreshold: 1000,\n");
      out.write("\t\t\t\twheelPropagation: false,\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(window).on('resize', function(){\n");
      out.write("\t\t\t\tps.update();\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
