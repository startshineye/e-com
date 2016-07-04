package org.apache.jsp.WEB_002dINF.jsp.sys.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("<!-- jquery引入必须在head下面 -->\r\n");
      out.write("<script type=\"text/javascript\" src =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"\" method=\"post\" id = \"form\">\r\n");
      out.write("<!-- 隐藏用于删除时候获取id -->\r\n");
      out.write("<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name = \"id\">\r\n");
      out.write("<table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("      姓名:<input type=\"text\" name=\"name\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>\r\n");
      out.write("      年龄:<input type=\"text\" name=\"age\">\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"button\" value=\"查询\" onclick=\"selectAll();\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <table  bordercolor=\"red\" border=\"1px\">\r\n");
      out.write(" <!-- thead部分 -->\r\n");
      out.write("      <tr>\r\n");
      out.write("       <td>序号</td>\r\n");
      out.write("       <td>姓名</td>\r\n");
      out.write("       <td>年龄</td>\r\n");
      out.write("       <td><center>操作</center></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("  <!--tbody  --> \r\n");
      out.write("  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   </table>\r\n");
      out.write("  <!-- 操作按钮 --> \r\n");
      out.write("      <input type=\"button\" value = \"新增\" onclick=\"to_insert();\">\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  //纯粹表单提交获取数据---javascript表单提交\r\n");
      out.write("   function to_detail(id){\r\n");
      out.write("\t //请求路径\r\n");
      out.write("\t   $(\"#form\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/to_detail.do?id=\"+id);\r\n");
      out.write("\t   //提交表单 \r\n");
      out.write("\t   $(\"#form\").submit();\r\n");
      out.write("   }\r\n");
      out.write("   //jquery提交 \r\n");
      out.write("   function dele(id){\r\n");
      out.write("\t   //请求路径\r\n");
      out.write("\t   $(\"#form\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/delete.do?id=\"+id);\r\n");
      out.write("\t   //提交表单 \r\n");
      out.write("\t   $(\"#form\").submit();\r\n");
      out.write("   }\r\n");
      out.write(" //jquery提交 \r\n");
      out.write("   function to_update(id){\r\n");
      out.write("\t   //请求路径\r\n");
      out.write("\t   $(\"#form\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/to_update.do?id=\"+id);\r\n");
      out.write("\t   //提交表单 \r\n");
      out.write("\t   $(\"#form\").submit();\r\n");
      out.write("   }\r\n");
      out.write(" function to_insert(){\r\n");
      out.write("\t//请求路径\r\n");
      out.write("\t   $(\"#form\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/to_insert.do\");\r\n");
      out.write("\t   //提交表单 \r\n");
      out.write("\t   $(\"#form\").submit();\r\n");
      out.write(" }\r\n");
      out.write(" function selectAll(){\r\n");
      out.write("\t//请求路径\r\n");
      out.write("\t   $(\"#form\").attr(\"action\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${webPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/select.do\");\r\n");
      out.write("\t   //提交表单 \r\n");
      out.write("\t   $(\"#form\").submit();\r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("user");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("     <tr>\r\n");
          out.write("       <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("       <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("       <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("       <td>\r\n");
          out.write("         <input type=\"button\" value=\"详情 \" onclick=\"to_detail('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\"/>\r\n");
          out.write("         <input type=\"button\" value=\"删除\" onclick=\"dele('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\"/>\r\n");
          out.write("         <input type=\"button\" value=\"修改\" onclick=\"to_update('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\"/>\r\n");
          out.write("       </td>\r\n");
          out.write("      </tr>\r\n");
          out.write("  ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
