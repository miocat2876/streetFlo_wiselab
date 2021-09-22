import axios from 'axios'

export default {
  install(app){
    app.config.globalProperties.$fetch = (opt) => axios(opt)
      // axios({
      //   method: 'PUT',
      //   url: ''
      // })
  }
}