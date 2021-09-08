export default {
  namespaced: true,
  state: () => ({
    isShowNav: false
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
    }
  }
}
