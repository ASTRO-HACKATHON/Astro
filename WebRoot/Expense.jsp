<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <div
		style="height:320px;background-image:url(<%=basePath%>images/dashboard.png);
		background-position:center;"
		align="center"></div> --%>
		
	<div style="width: 100%; height: auto;">
		<img src="<%=basePath%>images/cost_tracker_analyser.png" />	
	</div>
		

</body>
</html>