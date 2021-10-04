import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home';
import Mypage from '@/views/Mypage';
import AcademyList from '@/views/AcademyList';
import LoginTest from '@/views/LoginTest';

Vue.use(VueRouter)

const requireAuth = () => (to, from, next) => {
  if (this.$store.state.id !== '') {
    return next();
  }
  alert('로그인이 필요한 페이지입니다.');
  next('/');
};

const routes = [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/LoginTest',
      name: 'LoginTest',
      component: LoginTest
    },
    {
      path: '/Mypage',
      name: 'Mypage',
      component: Mypage,
    },
    {
      path: '/MyPageOauth',
      name: 'MyPageOauth',
      component: Mypage, 
      beforeEnter: requireAuth()
    },
    {
      path: '/about',
      name: 'About',
      component: () => import('@/views/About.vue'),
    },
  ];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});

export default router;
