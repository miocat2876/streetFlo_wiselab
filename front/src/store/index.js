import Vue from 'vue'
import Vuex from "vuex";
import state from './state'
import mutations from './mutations'
import actions from './actions'
import navigation from './navigation'

Vue.use(Vuex)

//getter 계산된 속성
//mutations state를 변경시키는 열확
//actions mutations을 실행시키는 트리거
//http://ccambo.github.io/Dev/Vue/5.what-is-the-store-in-vuex/
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
