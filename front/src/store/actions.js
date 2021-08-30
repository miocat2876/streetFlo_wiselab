import * as ActionTypes from "./type/action-types";
import * as MutationTypes from "./type/mutation-types";
import * as api from "../api";

export default {
  async [ActionTypes.GET_CALENDER_DATA]({ commit }, data) {
    try {
      const result = await api.scheduleFind(data);
      commit(MutationTypes.SET_CALENDER_DATA, result);
    } catch (error) {
      console.log(error);
    }
  },
};
