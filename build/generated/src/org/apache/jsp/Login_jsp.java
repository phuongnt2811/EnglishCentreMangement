package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel =\"icon\" href=\"image/index/Jell center.png\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--        <link rel=\"stylesheet\" href=\"CSS/login.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.js\">\n");
      out.write("        <title>Jell Center</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        @keyframes animate {\n");
      out.write("            /* bắt đầu và tăng dần từ 0-100 rồi lại quay về 0 */\n");
      out.write("            0%,\n");
      out.write("            100% {\n");
      out.write("                background-image: url(image/index/1.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            20% {\n");
      out.write("                background-image: url(image/index/2.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            40% {\n");
      out.write("                background-image: url(image/index/3.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            60% {\n");
      out.write("                background-image: url(image/index/4.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            80% {\n");
      out.write("                background-image: url(image/index/5.jpg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            100% {\n");
      out.write("                background-image: url(image/index/6.jpg);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            position: relative;\n");
      out.write("            color: black;\n");
      out.write("            animation: animate 25s ease-in-out infinite;\n");
      out.write("            background-size: cover;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 150px auto;\n");
      out.write("\n");
      out.write("            /* margin-top: 50px; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            height: auto;\n");
      out.write("            width: 30%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #login {\n");
      out.write("            min-height: 100px;\n");
      out.write("            display: inline-block; \n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #ffffffcc;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-control {\n");
      out.write("            position: relative;\n");
      out.write("            font-size: 16px;\n");
      out.write("            height: auto;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid gray;\t\n");
      out.write("        }\n");
      out.write("        .form-select {\n");
      out.write("            position: relative;\n");
      out.write("            font-size: 16px;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 150px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid gray; \n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            margin-bottom: -1px;\n");
      out.write("            border-bottom-left-radius: 0;\n");
      out.write("            border-bottom-right-radius: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"password\"] {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            border-top-left-radius: 0;\n");
      out.write("            border-top-right-radius: 0;\n");
      out.write("        }\n");
      out.write("        .logo img{\n");
      out.write("            display: inline-block;\n");
      out.write("            height: 250px;\n");
      out.write("            width: 250px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type = \"submit\"]{\n");
      out.write("            margin-top: 10px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            min-height: 30px;\n");
      out.write("            width: 150px;\n");
      out.write("            height: 40px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            text-align: center;\n");
      out.write("            border-top-left-radius: 0;\n");
      out.write("            border-top-right-radius: 0;\n");
      out.write("            background-color: rgb(106, 106, 235);\n");
      out.write("            border: 1px solid activeborder;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id =\"login\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"image/index/Jell center.png\" alt=\"logo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <form action=\"login-control\" method=\"post\">\n");
      out.write("                    <td><input type=\"text\" name=\"username\" class=\"form-control\" placeholder=  \"Account\" > <br></td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\"> <br></td> \n");
      out.write("                    <td><input type=\"checkbox\" name=\"remember\" value=\"true\"> Remember me </td> <a href=\"update-pasword\"> forgot password?</a> <br>\n");
      out.write("                    <h4 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h4>\n");
      out.write("\n");
      out.write("                    <div class=\"Submit\">\n");
      out.write("                        <input class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" value=\"Login\"> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
}
