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

<!-- css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/sumoselect.min.css">
    <link href="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/css/tooltipster.bundle.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
    <!-- <link rel="stylesheet" type="text/css" href="css/style2.css"> -->

<!-- script -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sumoselect@3.0.5/jquery.sumoselect.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/tooltipster@4.2.8/dist/js/tooltipster.bundle.min.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="/resources/js/common.js"></script>
    <script src="/resources/js/calender.js" defer></script>



    <title>Calendar_teacher</title>
</head>
<body>
    <div class="calender_teacther">
        <div class="top">
            <div class="content_1200 content">
                <div class="avatar">
                    <img src="http://placeimg.com/340/200/animals" alt="">
                </div>
                <div class="info">
                    <h2 class="name">Selene Lee <span>Edit Profile >></span></h2>
                    <div class="age">
                    <p>개인강사/ 25세, 여자</p>
                    <p><span>Krumping,</span> <span>K-Pop</span></p>
                    </div>
                </div>
                <div class="mode">
                <label class="switch" for="checkbox">
                  <input type="checkbox" id="checkbox" />
                  <div class="slider round"></div>
                </label>
            </div>
            </div>

        </div>
        <div class="content">
         <div class="bottom content_1200">
            <div class="calendar clear">
                <div class="left">
                    <div class="top">
                        <h1>Calendar</h1>
                        <h3 class="calendarDate"></h3>
                        <button class="calLeft">left</button>
                        <button class="calRight">right</button>
                    </div>
                    
                </div>
                <div class="right">
                    <!-- <table>
                        <tr>
                            <td><p></p></td>
                            <td><p>1</p></td>
                            <td><p>2</p></td>
                            <td><p>3</p></td>
                            <td><p>4</p></td>
                            <td><p>5</p></td>
                            <td><p>6</p></td>
                        </tr>
                        <tr>
                            <td><p>7</p></td>
                            <td><p>8</p></td>
                            <td><p>9</p></td>
                            <td><p>10</p></td>
                            <td><p>11</p></td>
                            <td><p>12</p></td>
                            <td><p>13</p></td>
                        </tr>
                        <tr>
                            <td><p>14</p></td>
                            <td><p>15</p></td>
                            <td><p>16</p></td>
                            <td><p>17</p></td>
                            <td><p>18</p></td>
                            <td><p>19</p></td>
                            <td><p>20</p></td>
                        </tr>
                        <tr>
                            <td><p>21</p></td>
                            <td><p>22</p></td>
                            <td class="able">
                                <p class="calendar_tooltip">23</p>
                            </td>
                            <td class="able"><p class="calendar_tooltip">24</p></td>
                            <td class="able"><p class="calendar_tooltip">25</p></td>
                            <td class="able"><p class="calendar_tooltip">26</p></td>
                            <td class="able"><p class="calendar_tooltip">27</p></td>
                        </tr>
                        <tr>
                            <td class="able"><p class="calendar_tooltip">28</p></td>
                            <td><p></p></td>
                            <td><p></p></td>
                            <td><p></p></td>
                            <td><p></p></td>
                            <td><p></p></td>
                            <td><p></p></td>
                        </tr>
                    </table> -->
                </div>
            </div>
            <div class="notice_list clear">
                <div class="left">
                    <h1>New Notice</h1>
                    <span>Swipe for previous notices</span>
                </div>
                <div class="right">
                    <div class="swiper-container">
                         <div class="swiper-wrapper">
                        <div class="swiper-slide">
                            <div class="review_box">
                            <div class="border-top"></div>
                            <div class="border-middle">
                                <div class="notice">
                                    <div class="notice_title">
                                        <p>공지수업:</p>
                                        <div class="box"></div>
                                    </div>
                                    <div class="notice_content">
                                        <p>내용 (200자 내외):</p>
                                       <div class="box"></div>
                                    </div>
                                    <button>Send >></button>
                                </div>

                            </div>
                            <div class="border-bottom"></div>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="review_box">
                            <div class="border-top"></div>
                            <div class="border-middle">
                                <div class="notice">
                                    <div class="notice_title">
                                        <p>공지수업:</p>
                                        <div class="box"></div>
                                    </div>
                                    <div class="notice_content">
                                        <p>내용 (200자 내외):</p>
                                       <div class="box"></div>
                                    </div>
                                    <button>Send >></button>
                                </div>
                            </div>
                            <div class="border-bottom"></div>
                            </div>
                        </div>
                    </div>

                        <div class="swiper-button-next"></div>
                        <div class="swiper-button-prev"></div>

                    </div>
                </div>
            </div>
            <div class="review_list clear">
                <div class="left">
                    <h1>Reviews</h1>
                </div>
                <div class="right">
                    <div class="swiper-container">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <div class="review_box">
                                    <div class="border-top"></div>
                                    <div class="border-middle">
                                        <div class="top clear">
                                            <div class="left">
                                                <img src="/resources/assets/profile_img.png" alt="profile_img">
                                            </div>
                                            <div class="right">
                                                <h4>김하연 (23 여)</h4>
                                                <h4>종목: 브레이크댄스</h4>
                                                <p>Lv. Beginner</p>
                                            </div>
                                        </div>
                                        <div class="bottom">
                                            <p>
                                                - 유익한 수업, 재밌는 커리큘럼<br/>
                                                - 다양한 강사 선생님<br/>
                                                - 좋은 시설<br/>
                                            </p>
                                        </div>
                                        <button>Edit>></button>
                                    </div>
                                    <div class="border-bottom"></div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="review_box">
                                    <div class="border-top"></div>
                                    <div class="border-middle">
                                        <div class="top clear">
                                            <div class="left">
                                                <img src="/resources/assets/profile_img.png" alt="profile_img">
                                            </div>
                                            <div class="right">
                                                <h4>김하연 (23 여)</h4>
                                                <h4>종목: 브레이크댄스</h4>
                                                <p>Lv. Beginner</p>
                                            </div>
                                        </div>
                                        <div class="bottom">
                                            <p>
                                                - 유익한 수업, 재밌는 커리큘럼<br/>
                                                - 다양한 강사 선생님<br/>
                                                - 좋은 시설<br/>
                                            </p>
                                        </div>
                                        <button>Edit>></button>
                                    </div>
                                    <div class="border-bottom"></div>
                                </div>
                            </div>
                            <div class="swiper-slide">
                                <div class="review_box">
                                    <div class="border-top"></div>
                                    <div class="border-middle">
                                        <div class="top clear">
                                            <div class="left">
                                                <img src="/resources/assets/profile_img.png" alt="profile_img">
                                            </div>
                                            <div class="right">
                                                <h4>김하연 (23 여)</h4>
                                                <h4>종목: 브레이크댄스</h4>
                                                <p>Lv. Beginner</p>
                                            </div>
                                        </div>
                                        <div class="bottom">
                                            <p>
                                                - 유익한 수업, 재밌는 커리큘럼<br/>
                                                - 다양한 강사 선생님<br/>
                                                - 좋은 시설<br/>
                                            </p>
                                        </div>
                                        <button>Edit>></button>
                                    </div>
                                    <div class="border-bottom"></div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-button-next"></div>
                        <div class="swiper-button-prev"></div>
                    </div>
                </div>
            </div>
        
        </div>
        </div>
    
    </div>

</body>
</html>