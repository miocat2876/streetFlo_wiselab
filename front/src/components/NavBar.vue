<template>
  <div>
    <header class="w-100">
      <div class="content_1200 menu">
        <a class="menu_title">Menu</a> 
        <a
          href="javascript:void(0)"
          class="menu_toggle">
          <img
            src="@/images/menu.svg"
            alt="menubar" /></a>
        <h1 class="logo">
          <a href="/">[Street-Flo]</a>
        </h1>
      </div>
      <nav
        id="nav"
        v-if="done"
        :class="{ show: isShowNav }">
        <div class="nav">
          <div class="nav_title">
            <a href="javascript:void(0)">Menu</a> 
            <a
              href="javascript:void(0)"
              class="nav_toggle"><img
                src="@/images/menu-black.svg"
                alt="menubar" /></a>
          </div>
          <ul class="nav_menu">
            <li class="nav_list nav_login">
              <a href="javascript:void(0)">Log-In</a>
            </li>
            <li class="nav_list nav_signUp">
              <a href="javascript:void(0)">Sign-Up</a>
            </li>
            <li class="nav_list">
              <a href="/calendarTeacher">Mypage</a>
            </li>
            <li class="nav_list nav_search">
              <a href="/instructorList">Search</a>
              <ul class="nav_search_sub">
                <li><a href="/instructorList">Teacher</a></li>
                <li><a href="javascript:void(0)">Academy</a></li>
              </ul>
            </li>
            <li class="nav_list">
              <a href="javascript:void(0)">FAQ</a>
            </li>
            <li class="nav_list">
              <a href="javascript:void(0)">About Us</a>
            </li>
          </ul>
          <div class="nav_sns">
            <a href="javascript:void(0)"><img
              src="@/images/instar.png"
              alt="insta" /></a>
            <a href="javascript:void(0)"><img
              src="@/images/mail.png"
              alt="mail" /></a>
          </div>
        </div>
      </nav>
    </header>
    

<div  v-if="false" id="loginPopupLayer">
    <div class="popup_login">
        <div class="title_bar">
            <h2>SNS Log-In</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <ul class="sns">
                <li><img src="@/images/kakao.svg" alt="kakao"/> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
                </li>
               
                <li><a href="/oauth2/authorization/facebook">
                    <div class="fb-login-button" data-width="" data-size="large" data-button-type="continue_with"
                         data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"></div></a></li>
                <li><img src="@/images/line.svg" alt="line"/> <a href="/oauth2/authorization/naver">Line</a>
                </li>
                <li><img src="@/images/google.svg" class="google"/>
                    <a href="/oauth2/authorization/google">Google</a></li>
            </ul>
        </div>
    </div>
</div>


<div  v-if="false" id="signUpPopupLayer1">
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



<div v-if="false" id="signUpPopupLayer2">
    <div class="popup_login">
        <div class="title_bar">
            <h2>SNS Sign-Up</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <ul class="sns">
                <li><img src="@/images/kakao.svg" alt="kakao"/> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
                </li>
                <li><a href="/oauth2/authorization/facebook">
                    <div class="fb-login-button" data-width="" data-size="large" data-button-type="continue_with"
                         data-layout="default" data-auto-logout-link="false" data-use-continue-as="false"></div></a></li>
                <li><img src="@/images/line.svg" alt="line"/> <a href="/oauth2/authorization/naver">Line</a>
                </li>
                <li><img src="@/images/google.svg" class="google"/>
                    <a href="/oauth2/authorization/google">Google</a></li>
            </ul>
        </div>
    </div>
</div>


  </div>
</template>



<script>


export default {
  data () {
    return {
      navigations: {}
    }
  },
  computed: {
    isShowNav () {
      return this.$store.state.navigation.isShowNav
    }
  },
  created () {
    this.init()
  },
  methods: {
    async init () {
      this.navigations = await this.$fetch({
        requestName: 'navigations'
      })
      this.done = true
    },
    offNav () {
      this.$store.dispatch('navigation/offNav')
    }
  }
}
</script>
    
