import { createApp } from "vue";
import App from "./App";
import router from "./router";
import store from "./store";
import GAuth from 'vue3-google-oauth2'

// var sessionOptions = {
//   persist: true
// }


const app = createApp(App);

let gauthClientId = process.env.VUE_APP_GOOGLE_OAUTH_PATH

const gAuthOptions = { clientId: gauthClientId, scope: 'email', prompt: 'consent', fetch_basic_profile: false }

app.use(store).use(router).use(GAuth, gAuthOptions);

app.mount("#app");
