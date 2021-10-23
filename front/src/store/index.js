import Vue from 'vue'
import Vuex from "vuex";
import state from './state'
import mutations from './mutations'
import actions from './actions'
import navigation from './navigation'

Vue.use(Vuex)

export default new Vuex.Store({
  state,
  getters: {
    userName: state => state.userName,
    token: state => state.token
  },
  mutations,
  actions,
  modules: {
    navigation
  }
});
