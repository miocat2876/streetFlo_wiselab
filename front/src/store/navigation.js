export default {
  namespaced: true,
  state: () => ({
    isShowNav: false,
    isShowLogin: false,
    isShowSignUp: false
  }),
  mutations: {
    updateState (state, payload) {
      Object.keys(payload).forEach(key => {
        state[key] = payload[key]
      })
    }
  },
  actions: {
    onNav ({ commit }){
      commit('updateState', {
        [`isShowNav`]: true
      })
    },
    offNav ({ commit } ) {
      commit('updateState', {
        [`isShowNav`]: false
      })
    },
    onLogin({commit}) {
      commit('updateState', {
        [`isShowLogin`]: true
      })
    },
    offLogin({commit}) {
      commit('updateState', {
        [`isShowLogin`]: false
      })
    },
    onSignUp({commit}) {
      commit('updateState', {
        [`isShowSignUp`]: true
      })
    },
    offSignUp({commit}) {
      commit('updateState', {
        [`isShowSignUp`]: false
      })
    }
  }
}
