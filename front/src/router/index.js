import Vue from "vue";
import VueRouter from "vue-router";
import store from '../store/index.js';
import Home from "@/views/Home";
import OauthRedirect from "@/components/oauth/Redirect";
import Mypage from "@/views/Mypage";
import AcademyList from "@/views/AcademyList";

Vue.use(VueRouter);

const requireAuth = () => (to, from, next) => {
  if (store.state.token !== "") {
    return next();
  }
  alert("로그인하십시오.")
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
      path: "/about",
      name: "About",
      component: () => import("@/views/About.vue"),
    },
  ],
}
);
router.afterEach((to, from) => {
  store.dispatch("getCommonCode");
})

export default router
