<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'details.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <table >
    <tr >
   <td>编号：</td>
   <td><input type="text" name="id" value="${person.id}"> </td>
   </tr>
   <tr> 
   <td>姓名： </td>
   <td><input type="text" name="name" value="${person.name}"></td>
   </tr>
    <tr>
   <td>密码：  </td>
   <td><input type="text" name="password" value="${person.password}"> </td>
   </tr>
   </table>
  </body>
</html>
