<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>

<head>
<meta charset="utf-8">
<title>dance</title>
</head>

<body>
        <section class="content">
        <tiles:insertAttribute name="top"/>
                <%--        <tiles:insertAttribute name="left"/>--%>
                <tiles:insertAttribute name="body" />
                <tiles:insertAttribute name="footer" />
        </section>
</body>

</html>