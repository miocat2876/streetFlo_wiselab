import Vue from "vue";
import VueRouter from "vue-router";
import store from '../store/index.js';
import Home from "@/views/Home";
import OauthRedirect from "@/components/oauth/Redirect";
import Mypage from "@/views/Mypage";
import AcademyList from "@/views/AcademyList";
import LoginTest from "@/views/LoginTest";
import ProfileStudent from "@/views/profile_student";
import ProfileTeacher from "@/views/profile_teacher";

Vue.use(VueRouter);

const requireAuth = () => (to, from, next) => {
  if (store.state.token !== "") {
    return next();
  }
  alert("로그인하십시오.")
  next("/");
};

export default new VueRouter({
  routes: [
    {
      path: "/",
      name: "Home",
      component: Home,
    },
    {
      path: "/LoginTest",
      name: "LoginTest",
      component: LoginTest,
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
      path: "/about",
      name: "About",
      component: () => import("@/views/About.vue"),
    },
    {
      path: "/ProfileStudent",
      name: "ProfileStudent",
      component: () => import("@/views/profile_student.vue"),
    },
    {
      path: "/ProfileTeacher",
      name: "ProfileTeacher",
      component: () => import("@/views/profile_teacher.vue"),
    },
  ],
});
