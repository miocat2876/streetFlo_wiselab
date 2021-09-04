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

const profileStudent = (data) => {
  return axios.post(`${commonUrl}/profileStudent`, data);
};

export { scheduleFind, scheduleAdd, scheduleSubscribeAdd, profileStudent };
