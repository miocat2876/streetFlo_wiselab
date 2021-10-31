import * as MutationTypes from "./type/mutation-types";

export default {
  [MutationTypes.SET_CALENDER_DATA](state, data) {
    state.calenderData = data;
  },
  setToken (state, token) {
    state.token = token
  },
  setUserName (state, userName) {
    state.userName = userName
  }
};
