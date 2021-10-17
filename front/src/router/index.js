import Vue from "vue";
import VueRouter from "vue-router";
import Home from "@/views/Home";
import Mypage from "@/views/Mypage";
import AcademyList from "@/views/AcademyList";

Vue.use(VueRouter);

const requireAuth = () => (to, from, next) => {
  if (this.$store.state.id !== "") {
    return next();
  }
  alert("로그인이 필요한 페이지입니다.");
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
});
