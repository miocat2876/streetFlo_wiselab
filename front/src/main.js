import Vue from "vue";
import App from "./App.vue";
import store from "./store";
import router from "./router";
import axios from "axios";
import VueCookies from 'vue-cookies';

axios.defaults.baseURL = 'http://localhost:9090'

Vue.prototype.$axios = axios;

Vue.use(VueCookies);
Vue.$cookies.config("7d");

Vue.config.productionTip = false;

new Vue({
  store,
  router,
  render: (h) => h(App),
}).$mount("#app");
