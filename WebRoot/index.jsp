<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	.errrorstyle{
	
	color: red;
	}
	</style>
  </head>
  
  <body>
  <form action="serchPerson.form" method="post">
 编号查询:<input type="text" name="id"> <input type="submit" value="查询">
  </form>
   <form action="linkfind.form">
    <table>
    <tr>
    <td>姓名:<input type="text" name="name"><input type="submit" value="搜索"> </td>
    </tr>
    
    </table>
    </form>
   <form action="adddate.form" method="post">
   <table>
   <tr  >
   <td>编号：  </td>
   <td><input type="text" name="id"> </td>
   </tr>
   <tr> 
   <td>姓名：  </td>
   <td><f:errors path="*" cssClass="errrorstyle" element="div"></f:errors><input type="text" name="name"> </td>
   </tr>

    <tr>
   <td>密码：  </td>
   <td><input type="text" name="password"> </td>
   </tr>
   <tr>
   <td colspan="2"><input type="submit" value="添加用户"> </td>
   </tr>
   </table>
   </form>
    <a href="listperson.form">查看信息</a>

  </body>

</html>
