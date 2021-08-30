<template>
  <div>
    <header class="w-100">
      <div class="content_1200 menu">
        <a class="menu_title">Menu</a> 
        <a
          href="javascript:void(0)"
          class="menu_toggle">
          <img
            src="@/images/menu.svg"
            alt="menubar" /></a>
        <h1 class="logo">
          <a href="/">[Street-Flo]</a>
        </h1>
      </div>
      <nav
        id="nav"
        v-if="done"
        :class="{ show: isShowLNB }">
        <div class="nav">
          <div class="nav_title">
            <a href="javascript:void(0)">Menu</a> 
            <a
              href="javascript:void(0)"
              class="nav_toggle"><img
                src="@/images/menu-black.svg"
                alt="menubar" /></a>
          </div>
          <ul class="nav_menu">
            <li class="nav_list nav_login">
              <a href="javascript:void(0)">Log-In</a>
            </li>
            <li class="nav_list nav_signUp">
              <a href="javascript:void(0)">Sign-Up</a>
            </li>
            <li class="nav_list">
              <a href="/calendarTeacher">Mypage</a>
            </li>
            <li class="nav_list nav_search">
              <a href="/instructorList">Search</a>
              <ul class="nav_search_sub">
                <li><a href="/instructorList">Teacher</a></li>
                <li><a href="javascript:void(0)">Academy</a></li>
              </ul>
            </li>
            <li class="nav_list">
              <a href="javascript:void(0)">FAQ</a>
            </li>
            <li class="nav_list">
              <a href="javascript:void(0)">About Us</a>
            </li>
          </ul>
          <div class="nav_sns">
            <a href="javascript:void(0)"><img
              src="@/images/instar.png"
              alt="insta" /></a>
            <a href="javascript:void(0)"><img
              src="@/images/mail.png"
              alt="mail" /></a>
          </div>
        </div>
      </nav>
    </header>
  </div>
</template>



<script>
export default {
  data () {
    return {
      navigations: {}
    }
  },
  computed: {
    isShowRNB () {
      return this.$store.state.navigation.isShowRNB
    }
  },
  created () {
    this.init()
  },
  methods: {
    async init () {
      this.navigations = await this.$fetch({
        requestName: 'navigations'
      })
      this.done = true
    },
    offNav () {
      this.$store.dispatch('navigation/offNav')
    }
  }
}
</script>
    
