<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>

	<div class="content_1200 index">
		<c:if test="${userName != null}">
		<c:set var="userName" scope="session" value="${userName}"/>
		<c:out value="${userName}"/>
		<a href="/logout" class="btn btn-info active" role="button">Logout</a>
		</c:if>
		<div class="bg">
			<div class="rect">
				<div class="circle1"></div>
			</div>
		</div>
		<div class="top">
			<a class="on">[Teacher]</a> <a>[Academy]</a>
		</div>
		<div class="search_box">
			<input class="search"> <a class="search_bt"></a>
			<div class="bottom">
				<ul>
					<li class="on"><a class="on">All</a> <a>B-boying</a> <a>Krumping</a>
						<a>Housedance</a> <a>Hip-Hop</a> <a>Locking</a> <a>Popping</a> <a>Waacking</a>
						<a>Choreography</a> <a>K-Pop</a> <a>Girls hip-hop</a> <a>Girlish</a>
					</li>
					<li>
						<p>Class Level:</p> <a>Beginner</a> <a class="on">Intermediate</a>
						<a>Master</a>
					</li>
				</ul>
			</div>
		</div>
	</div>

</body>