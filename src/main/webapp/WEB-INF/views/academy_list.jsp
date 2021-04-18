<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/sumoselect.min.css">
    <link href="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/css/tooltipster.bundle.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/jquery.sumoselect.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/js/tooltipster.bundle.min.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="/resources/js/common.js"></script>

    <title>Calendar</title>
</head>
<body>
<div class="academy_list">
    <div class="content_1200">
        <div class="title_box">
            <h1>Dance Academy</h1>
        </div>
    </div>
    <div class="content_1200">
        <div class="search_wrap">
            <div class="search_box">
                <input class="top">
                <a class="search_bt"></a>
                <div class="bottom">
                    <p>Calss Level:</p>
                    <a class="on">Beginner</a>
                    <a>Intermediate</a>
                    <a>Master</a>
                    <a> <span class="combo_box">
                            <select>
                                <option>Location</option>
                            </select>
                        </span>
                    </a>
                </div>
            </div>
            <div class="list_box">
                <div class="bottom">
                    <ul class="clear">
                        <li>
                            <img src="http://placeimg.com/340/200/animals">
                            <h2>Selene Lee</h2>
                            <p>Krumping, K-Pop</p>
                            <div class="level"></div>
                        </li>
                        <li>
                            <img src="http://placeimg.com/340/160/animals">
                            <h2>Selene Lee</h2>
                            <p>Krumping, K-Pop</p>
                            <div class="level"></div>
                        </li>
                        <li>
                            <img src="http://placeimg.com/340/160/animals">
                            <h2>Selene Lee</h2>
                            <p>Krumping, K-Pop</p>
                            <div class="level"></div>
                        </li>
                        <li>
                            <img src="http://placeimg.com/340/160/animals">
                            <h2>Selene Lee</h2>
                            <p>Krumping, K-Pop</p>
                            <div class="level"></div>
                        </li>
                        <li>
                            <img src="http://placeimg.com/340/160/animals">
                            <h2>Selene Lee</h2>
                            <p>Krumping, K-Pop</p>
                            <div class="level"></div>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <div class="map_wrap">
            <div style="border: black 1px solid; width: 500px; height: 500px;"></div>
        </div>
    </div>
    <div class="content_1200">
        <a class="top_bt" href="#">
            <p></p>
        </a>
    </div>
</div>
</body>
</html>