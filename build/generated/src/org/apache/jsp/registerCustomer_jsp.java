package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Register</title>\n");
      out.write("\n");
      out.write("    <!-- Icons font CSS-->\n");
      out.write("    <link href=\"register/vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"register/vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"register/vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"register/vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"register/css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script> \n");
      out.write("function CheckPassword()\n");
      out.write("{\n");
      out.write("    var p = document.forms[\"form1\"][\"pass\"].value;\n");
      out.write("    var cp = document.forms[\"form1\"][\"confirm\"].value;\n");
      out.write("var passw=  /^[A-Za-z]\\w{7,14}$/;\n");
      out.write("if(!p.match(passw) && p.length > 8 && p.length < 16)\n");
      out.write("{ \n");
      out.write("    alert('password must include letters and numbers, password must be more than 8 characters')\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script> \n");
      out.write("    \n");
      out.write("\n");
      out.write("<script> \n");
      out.write("function CheckPasswordMatch()\n");
      out.write("{\n");
      out.write("    var p = document.forms[\"form1\"][\"pass\"].value;\n");
      out.write("    var cp = document.forms[\"form1\"][\"confirm\"].value;\n");
      out.write("\n");
      out.write("if(p!=cp)\n");
      out.write("{ \n");
      out.write("    alert('passwords should match')\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script> \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function ValidateEmail() \n");
      out.write("{\n");
      out.write("    var regexEmail = /\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*/;\n");
      out.write("var email = document.forms[\"form1\"][\"email\"].value;\n");
      out.write("\n");
      out.write("if (regexEmail.test(email.value)) {\n");
      out.write("    alert(\"email is correct\")\n");
      out.write("} else {\n");
      out.write("    alert(\"email not correct\")\n");
      out.write("\n");
      out.write("}\n");
      out.write("    \n");
      out.write("}\n");
      out.write("    \n");
      out.write("</script>    \n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("    function myFunc() \n");
      out.write("{\n");
      out.write("    ValidateEmail();\n");
      out.write("    CheckPasswordMatch();\n");
      out.write(" \n");
      out.write("    \n");
      out.write("}\n");
      out.write("    \n");
      out.write("</script> \n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #link { color: #ffffff; } /* CSS link color */\n");
      out.write("  </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins\">\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\n");
      out.write("            <div class=\"card card-3\">\n");
      out.write("                <div class=\"card-heading\"></div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Registration Info</h2>\n");
      out.write("                    <form method=\"POST\" name=\"form1\" action=\"register_Customer\" onsubmit=\"return CheckPassword()\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Full Name\" name=\"full\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3 js-datepicker\" type=\"text\" placeholder=\"Birthdate\" name=\"birthday\">\n");
      out.write("                            <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"rs-select2 js-select-simple select--no-search\">\n");
      out.write("                                <select name=\"gender\" required=\"\">\n");
      out.write("                                    <option disabled=\"disabled\" selected=\"selected\">Gender</option>\n");
      out.write("                                    <option>Male</option>\n");
      out.write("                                    <option>Female</option>\n");
      out.write("                                    <option>Other</option>\n");
      out.write("                                </select>\n");
      out.write("                                <div class=\"select-dropdown\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"email\" placeholder=\"Email\" name=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Username\" name=\"user\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-group\">\n");
      out.write("                             <input class=\"input--style-3\" type=\"password\" placeholder=\"Password\" name=\"pass\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-group\">\n");
      out.write("                             <input class=\"input--style-3\" type=\"password\" placeholder=\"Confirm Password\" name=\"confirm\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        <div class=\"p-t-10\">\n");
      out.write("                            <button class=\"btn btn--pill btn--green\" type=\"submit\" onclick=\"myFunc()\"  >Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                         <div>\n");
      out.write("                             <a id=\"link\" href=\"loginCustomer.jsp\">Already have an account?</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"register/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Vendor JS-->\n");
      out.write("    <script src=\"register/vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"register/vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"register/vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"register/js/global.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
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
