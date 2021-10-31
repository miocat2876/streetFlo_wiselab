<template>
  <div></div>
</template>

<script>
import { mapMutations, mapActions } from 'vuex'

export default {
  created () {
    const token = this.$route.query.token
    const userName = this.$route.query.userName
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
