package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/index.css\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <div class=\"sidebar\">\n");
      out.write("            <div class=\"logo-details\">\n");
      out.write("                <i class='bx bxs-leaf'></i>\n");
      out.write("                <span class=\"logo_name\">Jell center</span>       \n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav-links\" >\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"adminHome\" class=\"active\">\n");
      out.write("                        <i class='bx bxs-grid-alt' ></i>\n");
      out.write("                        <span class=\"links_name\">Dash board</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-teacher\">\n");
      out.write("                        <i class='bx bx-circle-three-quarter' ></i>\n");
      out.write("                        <span class=\"links_name\">Teacher</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-levels\">\n");
      out.write("                        <i class='bx bx-collection' ></i>\n");
      out.write("                        <span class=\"links_name\">Level</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-course\">\n");
      out.write("                        <i class='bx bx-book-open' ></i>\n");
      out.write("                        <span class=\"links_name\">Course</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-class\">\n");
      out.write("                        <i class='bx bxs-graduation' ></i>\n");
      out.write("                        <span class=\"links_name\">Class</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-class-student\">\n");
      out.write("                       <i class='bx bxs-id-card'></i>\n");
      out.write("                        <span class=\"links_name\">Class Student</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"list-mark\">\n");
      out.write("                        <i class='bx bxs-bookmark-heart' ></i>\n");
      out.write("                        <span class=\"links_name\">Mark</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class='bx bxs-message-square' ></i>\n");
      out.write("                        <span class=\"links_name\">Attendance</span>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"logoutControl\" class=\"log_out\">\n");
      out.write("                        <i class='bx bx-log-out'></i>\n");
      out.write("                        <span class=\"links_name\">log out</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"home-section\">\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"sidebar-button\">\n");
      out.write("                    <i class='bx bx-menu sidebarBtn' ></i>\n");
      out.write("                    <span class=\"dashboard\">Dashboard</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-box\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search...\">\n");
      out.write("                    <i class='bx bx-search'></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"profile-details\">\n");
      out.write("                    \n");
      out.write("                    <img src=\"image/index/anhdaidien1.jpg\" alt=\"\">\n");
      out.write("                    <a href=\"list-admin\"><span class=\"admin_name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    <!-- <i class='bx bx-chevron-down'></i> --></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"home-content\">\n");
      out.write("                <div class=\"overview-boxes\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"right-side\">\n");
      out.write("                            <div class=\"box-topic\">Total Student</div>\n");
      out.write("                            <div class=\"number\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <i class='bx bxs-graduation cart'></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"right-side\">\n");
      out.write("                            <div class=\"box-topic\">Total teacher</div>\n");
      out.write("                            <div class=\"number\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <i class='bx bxs-briefcase-alt-2 cart two'></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"right-side\">\n");
      out.write("                            <div class=\"box-topic\">Total Class</div>\n");
      out.write("                            <div class=\"number\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <i class='bx bxs-institution cart three' ></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"right-side\">\n");
      out.write("                            <div class=\"box-topic\">Total course</div>\n");
      out.write("                            <div class=\"number\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <i class='bx bxs-school cart four' ></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        let sidebar = document.querySelector(\".sidebar\");\n");
      out.write("        let sidebarBtn = document.querySelector(\".sidebarBtn\");\n");
      out.write("        sidebarBtn.onclick = function () {\n");
      out.write("            sidebar.classList.toggle(\"active\");\n");
      out.write("            if (sidebar.classList.contains(\"active\")) {\n");
      out.write("                sidebarBtn.classList.replace(\"bx-menu\", \"bx-menu-alt-right\");\n");
      out.write("            } else {\n");
      out.write("                sidebarBtn.classList.replace(\"bx-menu-alt-right\", \"bx-menu\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
