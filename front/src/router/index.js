import {createRouter, createWebHistory} from 'vue-router';
import Home from '@/views/Home';
import Mypage from '@/views/Mypage';
import Login from '@/views/Login'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/login',
    name: 'login',
    component: Login
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
    beforeEnter: function(to, from, next) { 
      if (to.matched.some(function(routeInfo) {
      return routeInfo.meta.authRequired;
    })) {
      alert('Login Please!');
    } else {
      console.log("routing success : '" + to.path + "'");
    };
    }
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '@/views/About.vue'),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});



export default router;
