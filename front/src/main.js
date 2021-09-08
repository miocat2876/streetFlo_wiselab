import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";

// var sessionOptions = {
//   persist: true
// }


createApp(App).use(store).use(router).mount("#app");
