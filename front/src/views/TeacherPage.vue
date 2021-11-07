<template>
  <div>
    <div class="content_1200 instructor_info">
      <div class="top clear">
        <div class="Title">
          <h1>{{ id }}</h1>
        </div>
        <div class="left">
          <div class="tag_list">
            <ul class="clear">
              <li>Breakdance</li>
              <li>Competition Winner</li>
              <li class="gray">
                Class Closed
              </li>
            </ul>
          </div>
          <p>
            Welcome! I am a B-girl originating from Hawaii of the United States. I've
            started my career as a breakdancer when I was 14, and became a member
            of the Royal Family at 17. After staying there for about a year, I decided to
            work on my own and started to participate in various dance competitions
            around the world.<br /><br />
            I know South Korea to be home to many of the best breakdancers out there,
            and this is why I've decided to stay here for a few years to learn your dance
            culture. I'm looking foward to meeting many people, from new beginners to
            widely experienced dancers :)
          </p>
          <div class="link_box">
            <a><img src="../images/mail.png" /></a>
            <a><img src="../images/phone.png" /></a>
            <a><img src="../images/instar.png" /></a>
          </div>
        </div>
        <div class="right">
          <img src="http://placeimg.com/440/420/animals" />
        </div>
      </div>
      <div class="bottom">
        <Calender></Calender>
      </div>
      <div class="review_list clear">
        <Review></Review>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import Calender from "@/components/TeacherCalender";
import Notice from "@/components/Notice";
import Review from "@/components/Review";


export default {
  data() {
    return {
      id: this.$route.params.id,
    }
  },
   created() {
    const id = this.$route.params.id;
    // axios.get(``);
  },
  computed: {},
  components: {
    Calender,
    Review
  }
};
</script>


