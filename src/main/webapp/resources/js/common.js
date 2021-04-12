$(function () {
    $('.combo_box select').SumoSelect();

    $('.contents_box .calendar .add_bt').click(function() {
        $(this).toggleClass('on');
        $(this).parent().find(".add_class").slideToggle();
    });

    function SetTooltipContent(instance, obj) {
        var date = new Date(); 
        var year = date.getFullYear(); 
        var month = new String(date.getMonth()+1); 
        var day = new String(date.getDate()); 

        if(month.length == 1) { 
            month = "0" + month; 
        } 

        if(day.length == 1) { 
            day = "0" + day; 
        } 

        var tooltip_html = "<div id='calendar'><div class='top'><h2>2021/02/";
        
        var cur_day = obj;
        if(cur_day.length == 1) { 
            cur_day = "0" + cur_day; 
        } 

        tooltip_html += cur_day;
        tooltip_html += "</h2></div>";
        tooltip_html += "<div class='bottom'><ul>";
        tooltip_html += "<li><h3>12:00-14:00</h3><p>[브레이크댄스 기초]</p><span>Class Level Beginner</span><a></a></li>";
        tooltip_html += "<li><h3>12:00-14:00</h3><p>[브레이크댄스 기초]</p><span>Class Level Beginner</span><a></a></li>";
        tooltip_html += "<li><h3>12:00-14:00</h3><p>[브레이크댄스 기초]</p><span>Class Level Beginner</span><a></a></li>";
        tooltip_html += "</ul></div>"
        tooltip_html += "</div>";

        instance.content(tooltip_html);
    };

    $('.calendar_tooltip').tooltipster({
        functionBefore: function(instance, helper) {
            SetTooltipContent(instance, $(helper.origin).html());
        },
        content: "Loading...",
        interactive: true,
        contentAsHTML: true
    });   

    function UpdateInstructorImg() {
        var boardwidth = $(".instructor_list .list_box .bottom img").width();
        var boardheight = boardwidth * 0.47;

        $(".instructor_list .list_box .bottom img").each(function () {
            $(this).css({ "height": boardheight + "px" });
        });
    }

    //swipe
    UpdateInstructorImg();
    $(window).resize(function () {
        UpdateInstructorImg();
    });

    var appendNumber = 2;
    var swiper = new Swiper(".swiper-container", {
        slidesPerView: 2,
        centeredSlides: true,
        spaceBetween: 30,
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev"
        }
    });
     var swiper2 = new Swiper(".notice_list .swiper-container", {
        slidesPerView: 2,
        centeredSlides: true,
        spaceBetween: 20,
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev"
        }
     });

    var swiper = new Swiper(".swiper-container", {
        slidesPerView: 2,
        centeredSlides: true,
        spaceBetween: 10,
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev"
        },
        loop : false,
        virtual: {
            slides : ['Slide 1', 'Slide 2', 'Slide 3'],
            renderSlide : function( slide , index ) {
                console.log(slide);
                return '<div class="swiper-slide">' +
                    '<div class="review_box">' +
                    '<div class="border-top"></div>' +
                    '<div class="border-middle">' +
                    slide  +
                    '</div>' +
                    '<div class="border-bottom"></div>' +
                    '</div>' +
                    '</div>'
            }
        },
        on: {
            init: function (swiper) {
                console.log(swiper);
            },
            reachEnd : function (swiper) {
                 console.log(swiper);
                      swiper.virtual.slides.push('slide'+(swiper.activeIndex+3));
                  console.log(swiper.activeIndex+3);
            },
        }
    });


    $(".swiper-button-next").click(function (e) {
        // console.log(++appendNumber);
        // e.preventDefault();
        // swiper.appendSlide(++appendNumber,[
        //     '<div class="swiper-slide">' +
        //         '<div class="review_box">' +
        //             '<div class="border-top"></div>' +
        //             '<div class="border-middle">' +
        //                 'Slide ' + (++appendNumber) +
        //             '</div>' +
        //             '<div class="border-bottom"></div>' +
        //         '</div>' +
        //     '</div>'
        // ]);



    });



    $(".index .top a").click(function(e) {
        $(".index .top a").removeClass("on");
        $(this).addClass("on");
        
        $(".index .search_box .bottom ul li").removeClass("on");
        $(".index .search_box .bottom ul li").eq($(this).index()).addClass("on");
    });


// show menu
     $(".menu_toggle").click(function () {

        $("nav").stop().animate({
            "margin-right": 0

        }, 500)
       
    })
    $(".nav_toggle").click(function () {
        $("nav").stop().animate({
            "margin-right": "-100%"

        }, 500)
    })

//toggle sub menu
    
    $(".nav_search").click(function () {
        $(".nav_search_sub").slideToggle(400);
    })

//sns popup
    $("#layerPopup").hide();
    $(".nav_login").click(function () {
        $("#layerPopup").show();
    })
    $(".popup_login .close").click(function () {
        $("#layerPopup").hide();
    })



    $(".notice button").click(function () {
        $.ajax({
            url: 'http://kgm2876.iptime.org:9500/test5',
            success: function (data) {
                console.log(data);
            }
        })
    })


    // $(".swiper-button-next").click(function () {
    //     $.ajax({
    //         url: 'http://kgm2876.iptime.org:9500/test7',
    //         success: function (data) {
    //             var data = [{'name' : '김하연','genre' : '크럼핑','level' : 'Master','content1' : '유익한 수업 재밌는 커리큘럼','content2' : '다양한 강사 선생님','content3' : '좋은 시설'},{'name' : '김경민','genre' : '미어캣','level' : 'Master','content1' : '테스트','content2' : '','content3' : ''}];

    //             console.log(data[0].name);
    //         }
    //     })
    // })









});
