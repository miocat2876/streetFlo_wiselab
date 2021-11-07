import Vue from "vue";
import App from "./App.vue";
import store from "./store";
import router from "./router";
import axios from "axios";
// import GAuth from 'vue-google-oauth2';

axios.defaults.baseURL = 'http://localhost:9090'

Vue.prototype.$axios = axios;

Vue.config.productionTip = false;

// let gauthClientId = process.env.VUE_APP_GOOGLE_OAUTH_PATH
// const gAuthOptions = { clientId: gauthClientId, scope: 'email', prompt: 'consent', fetch_basic_profile: false }

// Vue.use(GAuth, gAuthOptions);

// store.dispatch("getCommonCode")

new Vue({
  store,
  router,
  render: (h) => h(App),
}).$mount("#app");
