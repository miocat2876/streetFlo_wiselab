import { createRouter, createWebHistory } from "vue-router";
import Calender from "../views/Calender.vue";
import Student from "../views/Profile_student.vue";
import Teacher from "../views/Profile_teacher.vue";

const routes = [
  {
    path: "/",
    name: "Calender",
    component: Calender,
  }, 
  {
    path: "/ProfileStudent",
    name: "Student",
    component: Student,
  },
  {
    path: "/ProfileTeacher",
    name: "Teacher",
    component: Teacher,
  },
  {
    path: "/about",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
