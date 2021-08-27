<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<footer>
<div class="content_1200 footer">
<h1 class="footer_logo">Street-flo: Find your perfect dancer</h1>
</div>
</footer>

<div id="loginPopupLayer">
    <div class="popup_login">
        <div class="title_bar">
            <h2>SNS Log-In</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <ul class="sns">
                <li><img src="/resources/assets/kakao.svg" alt="kakao"> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
                </li>
                <%--					<li><img src="assets/facebook.svg" alt="facebook"> <a--%>
                <%--						href="#">Facebook</a></li>--%>
                <li><a href="/oauth2/authorization/facebook">
                    <div class="fb-login-button" data-width="" data-size="large" data-button-type="continue_with"
                         data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"></div></a></li>
                <li><img src="/resources/assets/line.svg" alt="line"> <a href="/oauth2/authorization/naver">Line</a>
                </li>
                <li><img src="/resources/assets/google.svg" class="google">
                    <a href="/oauth2/authorization/google">Google</a></li>
            </ul>
        </div>
    </div>
</div>


<div id="signUpPopupLayer1">
    <div class="popup_login">
        <div class="title_bar">
            <h2>SNS Sign-Up</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <ul class="signUpbtn">
                <li><a href="javascript:void(0)">선생님</a>
                </li>
                <li><a href="javascript:void(0)">학생</a></li>
            </ul>
        </div>
    </div>
</div>



<div id="signUpPopupLayer2">
    <div class="popup_login">
        <div class="title_bar">
            <h2>SNS Sign-Up</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <ul class="sns">
                <li><img src="/resources/assets/kakao.svg" alt="kakao"> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
                </li>
                <li><a href="/oauth2/authorization/facebook">
                    <div class="fb-login-button" data-width="" data-size="large" data-button-type="continue_with"
                         data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"></div></a></li>
                <li><img src="/resources/assets/line.svg" alt="line"> <a href="/oauth2/authorization/naver">Line</a>
                </li>
                <li><img src="/resources/assets/google.svg" class="google">
                    <a href="/oauth2/authorization/google">Google</a></li>
            </ul>
        </div>
    </div>
</div>