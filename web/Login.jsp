<%--
    Document   : login
    Created on : 22 Oct, 2012, 2:40:33 PM
    Author     : trainee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Photoshoot
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20110926

-->
<html:html>
    <head>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>E-Market Online Market </title>
        <link href="style/style.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="jquery-1.6.2.min.js"></script>
        <script type="text/javascript" src="jquery.poptrox-0.1.js"></script>
    </head>
    <body>
       

        <div id="header" class="container">
            <div id="logo">
                <h1><a href="#">E-Market  </a></h1>
                <p><a>Online market</a></p>
            </div>
            <div id="menu">
                <ul>
                    <li><a href="HomePage.jsp">Homepage</a></li>
                    <li><a href="UserDetails.jsp">Register</a></li>
                    <li><a href="veera.jsp">Contact</a></li>
                    
                </ul>
            </div>
        </div>
        <!-- end #header -->
       
                           <div id="bg3">

                                
                            </div>

        <%@include file="Gallery1.jsp" %>
        <div id="page">
            <div id="bg1">
                <div id="bg2">
                    <div id="bg3">
                        <div id="content">

                  <h3> ${requestScope.msg} </h3><br>
                            <h3> ${requestScope.msg1}</h3>
                            <h2>LOGIN</h2>
                            <html:javascript formName="LoginActionForm"/>
                            <html:form action="/LoginAction" method="post" onsubmit="return validateLoginActionForm(this);">
                                <table>
                                    <tr>

                                        <td>UserName</td>
                                        <td><html:text property="userName" value=""/></td>
                                    </tr>
                                    <tr>
                                        <td>Password</td>
                                        <td><html:password property="password" value=""/></td>
                                    </tr>
                                    <tr>
                                        <td><html:submit value="SUBMIT"/> <html:reset value="RESET"/></td>

                                    </tr>
                                </table>
                            </html:form>
                        </div>


                    </div>
                </div>
            </div>
        </div>
      <%@include file="Footer.jsp" %>
        <!-- end #footer -->
    </body>
</html:html>




















