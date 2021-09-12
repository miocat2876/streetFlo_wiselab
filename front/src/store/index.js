import { createStore } from "vuex";
import {mutations} from "@/store/mutations.js";
import {actions} from "@/store/actions.js";
import navigation from './navigation'


export default createStore({
  modules: {
    navigation
  },
  mutations,
  actions,
});
