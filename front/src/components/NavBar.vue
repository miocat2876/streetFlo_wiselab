<template>
  <div>
    <header class="w-100">
      <div
        class="content_1200 menu"
        @click="onNav()"
      >
        <a 
          class="menu_title"
        >Menu</a> 
        <a
          href="javascript:void(0)"
          class="menu_toggle"
        >
          <img
            src="@/images/menu.svg"
            alt="menubar"
          /></a>
        <h1 class="logo">
          <a href="#/">[Street-Flo]</a>
        </h1>
      </div>
      <nav :class="{ show: isShowNav }">
        <div class="nav">
          <div class="nav_title">
            <a href="javascript:void(0)">Menu</a> 
            <a
              href="javascript:void(0)"
              class="nav_toggle"
              @click="offNav()"
            ><img
              src="@/images/menu-black.svg"
              alt="menubar"
            /></a>
          </div>
          <ul class="nav_menu">
            <li 
              v-if="isSignIn"
              @click="onLogin()"
              class="nav_list nav_login"
            >
              <a
                href="javascript:void(0)"
              >Log-In</a>
            </li>
            <li
              v-if="isSignIn"
              @click="onSignUp()"
              class="nav_list nav_signUp"
            >
              <a
                href="javascript:void(0)"
              >Sign-Up</a>
            </li>
            <li 
              @click="handleClickSignOut"
              class="nav_list"
            >
              <a 
                href="javascript:void(0)"
              >Log-Out</a>
            </li>
            <li 
              v-if="!isSignIn"
              class="nav_list"
            >
              <a href="#/mypage">Mypage</a>
            </li>
            <li class="nav_list nav_search">
              <a href="#/instructorList">Search</a>
              <ul class="nav_search_sub">
                <li><a href="#/instructorList">Teacher</a></li>
                <li><a href="javascript:void(0)">Academy</a></li>
              </ul>
            </li>
            <li class="nav_list">
              <a href="javascript:void(0)">FAQ</a>
            </li>
            <li class="nav_list">
              <a href="#/about">About Us</a>
            </li>
          </ul>
          <div class="nav_sns">
            <a href="javascript:void(0)"><img
              src="@/images/instar.png"
              alt="insta"
            /></a>
            <a href="javascript:void(0)"><img
              src="@/images/mail.png"
              alt="mail"
            /></a>
          </div>
        </div>
      </nav>
    </header>
    

    <div
      id="loginPopupLayer"
      :class="{ show: isShowLogin }"
    >
      <div class="popup_login">
        <div class="title_bar">
          <h2>SNS Log-In</h2>
          <a
            class="close"
            href="javascript:void(0)"
            @click="offLogin()"
          ></a>
        </div>
        <div class="content_box">
          <ul class="sns">
            <li>
              <img
                src="@/images/kakao.svg"
                alt="kakao"
              /> <a href="#/oauth2/authorization/kakao">KakaoTalk</a>
            </li>
            <!--                
            <li>
              <a href="#/oauth2/authorization/facebook">
                <div
                  class="fb-login-button"
                  data-width=""
                  data-size="large"
                  data-button-type="continue_with"
                  data-layout="default"
                  data-auto-logout-link="false"
                  data-use-continue-as="false"
                ></div></a>
            </li>
            <li>
              <img
                src="@/images/line.svg"
                alt="line"
              /> <a href="#/oauth2/authorization/naver">Line</a>
            </li> -->
            <li>
              <img
                src="@/images/google.svg"
                class="google"
              />
              <a 
                href="http://localhost:9090/oauth2/authorization/google?redirect_uri=http://localhost:8080/oauth/redirect"
              >Google</a>
            </li>
          </ul>
        </div>
      </div>
    </div>


    <div
      id="signUpPopupLayer1"
      :class="{ show: isShowSignUp }"
    >
      <div class="popup_login">
        <div class="title_bar">
          <h2>SNS Sign-Up</h2>
          <a
            class="close"
            href="javascript:void(0)"
            @click="offSignUp()"
          ></a>
        </div>
        <div class="content_box">
          <ul class="signUpbtn">
            <li>
              <a href="javascript:void(0)">선생님</a>
            </li>
            <li><a href="javascript:void(0)">학생</a></li>
          </ul>
        </div>
      </div>
    </div>



    <div
      id="signUpPopupLayer2"
      :class="{ show: isShowSignUp }"
    >
      <div class="popup_login">
        <div class="title_bar">
          <h2>SNS Sign-Up</h2>
          <a
            class="close"
            href="javascript:void(0)"
            @click="offSignUp()"
          ></a>
        </div>
        <div class="content_box">
          <ul class="sns">
            <li>
              <img
                src="@/images/kakao.svg"
                alt="kakao"
              /> <a href="#/oauth2/authorization/kakao">KakaoTalk</a>
            </li>
            <!-- <li>
              <a href="#/oauth2/authorization/facebook">
                <div
                  class="fb-login-button"
                  data-width=""
                  data-size="large"
                  data-button-type="continue_with"
                  data-layout="default"
                  data-auto-logout-link="false"
                  data-use-continue-as="false"
                ></div></a>
            </li>
            <li>
              <img
                src="@/images/line.svg"
                alt="line"
              /> <a href="#/oauth2/authorization/naver">Line</a>
            </li> -->
            <li>
              <img
                src="@/images/google.svg"
                class="google"
              />
              <a 
                href="http://localhost:9090/oauth2/authorization/google?redirect_uri=http://localhost:8080/oauth/redirect"
              >Google</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>



<script>
import { mapActions, mapGetters, mapMutations } from 'vuex'
import VueCookies from 'vue-cookies'

export default {
  data () {
    return {
      navigations: {},
      isSignIn: this.$store.state.userName
    }
  }, 
  computed: {
    isShowNav () {
      return this.$store.state.navigation.isShowNav
    },
    isShowLogin(){
      return this.$store.state.navigation.isShowLogin
    },
    isShowSignUp(){
      return this.$store.state.navigation.isShowSignUp
    }
  },
  created () {
    this.init()
  },
  methods: {
    ...mapMutations(['setToken']),
    ...mapGetters(['getToken']),
    async init () {
      this.navigations = await this.$axios({
        requestName: 'navigations'
      })
      this.done = true
    },
    onNav() {
      this.$store.dispatch('navigation/onNav')
    },
    offNav () {
      this.$store.dispatch('navigation/offNav')
    },
    onLogin() {
      this.$store.dispatch('navigation/onLogin')
    },
    offLogin() {
      this.$store.dispatch('navigation/offLogin')
    },
    onSignUp() {
      this.$store.dispatch('navigation/onSignUp')
    },
    offSignUp() {
      this.$store.dispatch('navigation/offSignUp')
    },

    async handleClickSignIn(){
      try {
        this.$store.dispatch('navigation/offLogin')
        this.$store.dispatch('navigation/offSignUp')
      } catch (error) {
        console.error(error);
        return null;
      }
    },

    async handleClickSignOut(){
      try {
        
        await this.$cookies.remove("accesstoken")
        await this.$store.commit('signOut')
        this.offNav()
        alert("로그아웃 되었습니다.")
        this.$router.push("/")
        this.$router.go();
      } catch (error) {
      }
    }
  },
    mounted(){
    let that = this
    let checkGauthLoad = setInterval(function(){
      // that.isSignIn = that.$gAuth.isAuthorized
    }, 1000);
  }
}
</script>
