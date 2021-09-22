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
          <a href="/">[Street-Flo]</a>
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
              v-if="!user"
              class="nav_list nav_login"
            >
              <a
                href="javascript:void(0)"
                @click="onLogin()"
              >Log-In</a>
            </li>
            <li
              v-if="!user"
              class="nav_list nav_signUp"
            >
              <a
                href="javascript:void(0)"
                @click="onSignUp()"
              >Sign-Up</a>
            </li>
            <li 
              v-if="user"
              class="nav_list"
            >
              <a 
                @click="handleClickSignOut"
                href="javascript:void(0)"
              >Log-Out</a>
            </li>
            <li 
              v-if="user"
              class="nav_list"
            >
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
              <a href="/about">About Us</a>
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
      v-if="!user"
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
              /> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
            </li>
            <!--                
            <li>
              <a href="/oauth2/authorization/facebook">
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
              /> <a href="/oauth2/authorization/naver">Line</a>
            </li> -->
            <li>
              <img
                src="@/images/google.svg"
                class="google"
              />
              <a 
                @click="handleClickSignIn"
                href="javascript:void(0)"
              >Google</a>
            </li>
          </ul>
        </div>
      </div>
    </div>


    <div
      v-if="!user"
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
      v-if="!user"
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
              /> <a href="/oauth2/authorization/kakao">KakaoTalk</a>
            </li>
            <!-- <li>
              <a href="/oauth2/authorization/facebook">
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
              /> <a href="/oauth2/authorization/naver">Line</a>
            </li> -->
            <li>
              <img
                src="@/images/google.svg"
                class="google"
              />
              <a 
                href="javascript:void(0)"
              >Google</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>



<script>
import { inject, toRefs } from "vue";


export default {
  name: "NavBar",
  props: {
    msg: String,
  },
  data () {
    return {
      user: '',
      navigations: {}
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
    async init () {
      this.navigations = await this.$fetch({
        requestName: 'navigations'
      })
      this.done = true
    },
     async handleClickSignIn(){
      try {
        const googleUser = await this.$gAuth.signIn();
        if (!googleUser) {
          return null;
        }
        console.log("googleUser", googleUser);
        this.user = googleUser.getBasicProfile().getEmail();
        console.log("getId", this.user);
        console.log("getBasicProfile", googleUser.getBasicProfile());
        console.log("getAuthResponse", googleUser.getAuthResponse());
        console.log(
          "getAuthResponse",
          this.$gAuth.instance.currentUser.get().getAuthResponse()
        );

      } catch (error) {
        //on fail do something
        console.error(error);
        return null;
      }
    },
    async handleClickGetAuthCode(){
      try {
        const authCode = await this.$gAuth.getAuthCode();
        console.log("authCode", authCode);
      } catch(error) {
        //on fail do something
        console.error(error);
        return null;
      }
    },
    async handleClickSignOut() {
      try {
        await this.$gAuth.signOut();
        console.log("isAuthorized", this.Vue3GoogleOauth.isAuthorized);
        this.user = "";
      } catch (error) {
        console.error(error);
      }
    },
    setup(props) {
    const { isSignIn } = toRefs(props);
    const Vue3GoogleOauth = inject("Vue3GoogleOauth");

    const handleClickLogin = () => {};
    return {
      Vue3GoogleOauth,
      handleClickLogin,
      isSignIn,
    };
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
    }
  }
}
</script>
    
