<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>

<!-- css -->
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/sumoselect.min.css">
<link
href="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/css/tooltipster.bundle.css"
rel="stylesheet">
<link rel="stylesheet"
href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css">

<!-- script -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
src="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/jquery.sumoselect.min.js"></script>
<script
src="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/js/tooltipster.bundle.min.js"></script>
<script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
<script src="/resources/js/common.js"></script>
<script src="https://developers.kakao.com/sdk/js/kakao.min.js"></script>

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