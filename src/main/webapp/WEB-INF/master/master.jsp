<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/masterpage.tld" prefix="master"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<master:MasterPage id="master">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><master:ContentPlaceHolder id="title" /></title>
</head>
<body>
	<hr />
	<h1>母版页内容.............</h1>
	<master:ContentPlaceHolder id="nav" />
	<hr />
	<master:ContentPlaceHolder id="main" />
	<h2>母版页文字</h2>
	<br />
	<br />
	<br /> ...........................
</body>
	</html>
</master:MasterPage>