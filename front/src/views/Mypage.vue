<template>
  <div>
    <div class="calender_teacther">
      <div class="wrap">
        <div class="content_1200 content">
          <div class="avatar">
            <img
              src="http://placeimg.com/340/200/animals"
              alt=""
            />
          </div>
          <div class="info">
            <h2 class="name">
              {{ $store.state.userName }} <span>Edit Profile >></span>
            </h2>
            <div class="age">
              <p>개인강사/ 25세, 여자</p>
              <p><span>Krumping,</span> <span>K-Pop</span></p>
            </div>
          </div>
          <div class="mode">
            <label
              class="switch"
              for="checkbox"
            >
              <input
                type="checkbox"
                id="checkbox"
              />
              <div class="slider round"></div>
            </label>
          </div>
        </div>
      </div>
      <div class="content">
        <div class="bottom content_1200">
          <Calender state="detail"></Calender>
          <Notice></Notice>
          <Review></Review>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Calender from "@/components/TeacherCalender";
import Notice from "@/components/Notice";
import Review from "@/components/Review";
import { mapActions, mapGetters, mapMutations } from 'vuex'

export default {
  data () {
    return {
      navigations: {},
      isSignIn: this.$cookies.isKey('accesstoken')
    }
  },
  computed: {
     ...mapGetters(['token', 'userName']),
    token () {
      return this.$store.state.token
    },
    userName () {
      return this.$store.state.userName
    },
  },
  components: {
    Calender,
    Notice,
    Review
  }
};
</script>
