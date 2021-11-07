import Vue from "vue";
import VueRouter from "vue-router";
import store from '../store/index.js';
import Home from "@/views/Home";
import OauthRedirect from "@/components/oauth/Redirect";
import Mypage from "@/views/Mypage";

import TeacherPage from "@/views/TeacherPage";
import AcademyPage from "@/views/AcademyPage";
import AcademyList from "@/views/AcademyList";

Vue.use(VueRouter);

const requireAuth = () => (to, from, next) => {
  if (store.state.token !== "") {
    return next();
  }
  alert("로그인하십시오.")
  this.$store.dispatch('navigation/offLogin')
  next("/");
};

const router = new VueRouter({
  routes: [
    {
      path: "/",
      name: "Home",
      component: Home,
    },
    {
      path: "/Mypage",
      name: "Mypage",
      component: Mypage,
    },
    {
      path: "/MyPageOauth",
      name: "MyPageOauth",
      component: Mypage,
      beforeEnter: requireAuth(),
    },
    {
      path: '/oauth/redirect',
      name: 'OauthRedrect',
      component: OauthRedirect
    },
    {
      path: "/AcademyList",
      name: "AcademyList",
      component: AcademyList,
    },
    {
      path: "/teacher/:id",
      name: "TeacherPage",
      component: TeacherPage,
    },
    {
      path: "/academy/:id",
      name: "AcademyPage",
      component: AcademyPage,
    },
    {
      path: "/about",
      name: "About",
      component: () => import("@/views/About.vue"),
    },
  ],
}
);

//로그인-> 쿠키,로그인값 (서버) -> 클라이언트 쿠키는 x 로그인값(1) 스토어 스토어 값 1 로그인 되었있다 0 로그아웃
//로그아웃
//클라이언트 쿠키 엑세스 토큰 스토어 로그인 상태
//쿠키상태 여부
//통신안하고 로그인 상태관리
//


router.beforeEach(function (to, from, next) {
  // to : 이동할 url
  // from : 현재 url
  // next : to에서 지정한 url로 이동하기 위해 꼭 호출해야 하는 함수
  store.dispatch("getCommonCode").then(function (){
    next();
  });
});

export default router
