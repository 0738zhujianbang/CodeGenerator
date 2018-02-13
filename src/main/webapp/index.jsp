<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/masterpage.tld" prefix="master"%>

<master:ContentPage materPageId="master">

	<master:Content contentPlaceHolderId="title">
	主页
	</master:Content>

	<master:Content contentPlaceHolderId="breadcrumb">
		<ul class="breadcrumb">
			<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a></li>

			<li><a href="#">Other Pages</a></li>
			<li class="active">Blank Page</li>
		</ul>
	</master:Content>

	<master:Content contentPlaceHolderId="header">
		<div class="page-header">
			<h3>空页</h3>
		</div>
	</master:Content>

	<master:Content contentPlaceHolderId="content">
		<h3>子页主内容</h3>
		<br />
	    ${test }
	</master:Content>

</master:ContentPage>