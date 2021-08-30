import axios from "axios";

const commonUrl = "http://localhost:9090";

const scheduleFind = (data) => {
  return axios.post(`${commonUrl}/scheduleFind`, data);
};

const scheduleAdd = (data) => {
  return axios.post(`${commonUrl}/scheduleAdd`, data);
};

const scheduleSubscribeAdd = (data) => {
  return axios.post(`${commonUrl}/scheduleSubscribeAdd`, data);
};

export { scheduleFind, scheduleAdd, scheduleSubscribeAdd };
