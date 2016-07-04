package org.apache.jsp.WEB_002dINF.jsp.sys.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

	request.setAttribute("webPath", request.getContextPath());

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-1.7.2.min.js\"></script>\r\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"\" method = \"post\" id = \"userForm\">\r\n");
      out.write("<table>\r\n");
      out.write("     <tr>\r\n");
      out.write("\t     <td>id:<input type=\"text\" name = \"id\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t     <td>姓名:<input type=\"text\" name = \"name\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t     <td>年龄:<input type=\"text\" name = \"age\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t     <td>\r\n");
      out.write("\t      <input type = \"button\" value=\"修改\" onclick=\"update();\"/>\r\n");
      out.write("\t     </td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</center>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction update(){\r\n");
      out.write("\t $(\"#userForm\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/update.do\");\r\n");
      out.write("\t $(\"#userForm\").submit();\r\n");
      out.write("\t}\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
