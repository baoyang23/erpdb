/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-03 00:04:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>管理系统</title>\r\n");
      out.write("    <link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"adminjs/themes/default/easyui.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"adminjs/themes/icon.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"adminjs/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"adminjs/jquery.easyui.1.2.6.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src='adminjs/index.js'> </script>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"overflow-y: hidden\"  fit=\"true\"   scroll=\"no\">\r\n");
      out.write("<noscript>\r\n");
      out.write("    <div style=\" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;\">\r\n");
      out.write("        <img src=\"images/noscript.gif\" alt='抱歉，请开启脚本支持！' />\r\n");
      out.write("    </div></noscript>\r\n");
      out.write("\r\n");
      out.write("<div id=\"loading-mask\" style=\"position:absolute;top:0px; left:0px; width:100%; height:100%; background:#D2E0F2; z-index:20000\">\r\n");
      out.write("    <div id=\"pageloading\" style=\"position:absolute; top:50%; left:50%; margin:-120px 0px 0px -120px; text-align:center;  border:2px solid #8DB2E3; width:200px; height:40px;  font-size:14px;padding:10px; font-weight:bold; background:#fff; color:#15428B;\">\r\n");
      out.write("        <img src=\"images/loading.gif\" align=\"absmiddle\" /> 正在加载中,请稍候...</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div region=\"north\" split=\"true\" border=\"false\" style=\"overflow: hidden; height: 30px;\r\n");
      out.write("        background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;\r\n");
      out.write("        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体\">\r\n");
      out.write("    <span style=\"float:right; padding-right:20px;\" class=\"head\">欢迎 <span id=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>  <a href=\"#\" id=\"editpass\">修改密码</a> <a href=\"#\" id=\"loginOut\">安全退出</a></span>\r\n");
      out.write("    <span style=\"padding-left:10px; font-size: 16px; \"><img src=\"images/blocks.gif\" width=\"20\" height=\"20\" align=\"absmiddle\" /> 管理系统</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div region=\"south\" split=\"true\" style=\"height: 30px; background: #D2E0F2; \">\r\n");
      out.write("    <div class=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div region=\"west\" split=\"true\"  title=\"导航菜单\" style=\"width:180px;\" id=\"west\">\r\n");
      out.write("    <div id=\"nav\">\r\n");
      out.write("        <!--  导航内容 -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mainPanle\" region=\"center\" style=\"background: #eee; overflow-y:hidden\">\r\n");
      out.write("    <div id=\"tabs\" class=\"easyui-tabs\"  fit=\"true\" border=\"false\" >\r\n");
      out.write("        <div title=\"欢迎使用\" style=\"padding:20px;overflow:hidden; color:red; \" >\r\n");
      out.write("            <h1 style=\"font-size:24px;\"></h1>\r\n");
      out.write("            <h1 style=\"font-size:24px;\"></h1>\r\n");
      out.write("            <h1 style=\"font-size:24px;\"></h1>\r\n");
      out.write("            <h1 style=\"font-size:24px;\"></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--修改密码窗口-->\r\n");
      out.write("<!--修改密码窗口-->\r\n");
      out.write("<div id=\"w\" class=\"easyui-dialog\">\r\n");
      out.write("    <div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("        <div region=\"center\" border=\"false\" style=\"padding: 10px; background: #fff;\">\r\n");
      out.write("            <table cellpadding=3>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>旧密码：</td>\r\n");
      out.write("                    <td><input id=\"txtOldPass\" type=\"password\" class=\"txt01\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>新密码：</td>\r\n");
      out.write("                    <td><input id=\"txtNewPass\" type=\"password\" class=\"txt01\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>确认密码：</td>\r\n");
      out.write("                    <td><input id=\"txtRePass\" type=\"password\" class=\"txt01\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"mm\" class=\"easyui-menu\" style=\"width:150px;\">\r\n");
      out.write("    <div id=\"tabupdate\">刷新</div>\r\n");
      out.write("    <div class=\"menu-sep\"></div>\r\n");
      out.write("    <div id=\"close\">关闭</div>\r\n");
      out.write("    <div id=\"closeall\">全部关闭</div>\r\n");
      out.write("    <div id=\"closeother\">除此之外全部关闭</div>\r\n");
      out.write("    <div class=\"menu-sep\"></div>\r\n");
      out.write("    <div id=\"closeright\">当前页右侧全部关闭</div>\r\n");
      out.write("    <div id=\"closeleft\">当前页左侧全部关闭</div>\r\n");
      out.write("    <div class=\"menu-sep\"></div>\r\n");
      out.write("    <div id=\"exit\">退出</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
