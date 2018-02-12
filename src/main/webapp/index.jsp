<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/masterpage.tld" prefix="master"%>
<master:ContentPage materPageId="master">

<master:Content contentPlaceHolderId="title">
    子页,标题
</master:Content>

<master:Content contentPlaceHolderId="nav">
    <h5>子页导航</h5> 
</master:Content>

<master:Content contentPlaceHolderId="main">
    <h3>子页主内容</h3>
    <br />
    ${test }
</master:Content>

</master:ContentPage>