import { createApp } from "vue";
import App from "./App";
import router from "./router";
import store from "./store";
import axios from "axios";

import fetch from './plugins/fetch';
import GAuth from 'vue3-google-oauth2';


// var sessionOptions = {
//   persist: true
// }

const app = createApp(App);

let gauthClientId = process.env.VUE_APP_GOOGLE_OAUTH_PATH
const gAuthOptions = { clientId: gauthClientId, scope: 'email', prompt: 'consent', fetch_basic_profile: false }

axios.defaults.baseURL = "http://localhost:9090";
app.config.globalProperties.axios = axios;

app.use(store).use(router).use(GAuth, gAuthOptions).use(fetch);

app.mount("#app");
