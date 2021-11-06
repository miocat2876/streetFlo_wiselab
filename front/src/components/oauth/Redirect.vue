<template>
  <div></div>
</template>

<script>
import { mapMutations, mapActions } from 'vuex'

import VueCookies from 'vue-cookies'

export default {
  created () {
    const token = this.$route.query.token
    const userName = this.$route.query.userName

    VueCookies.set("accesstoken", token)
    this.$axios.defaults.headers.common["x-access-token"] = token

    console.log('token', token)
    if (token) {
      this.setToken(token)
      this.setUserName(userName)
    }
    this.$router.replace('/MyPageOauth')
  },
  methods: {
    ...mapMutations(['setToken']),
    ...mapMutations(['setUserName'])
  }
}
</script>
