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
            네버마인드 스튜디오는 12년 전에 강남의 작은 건물에서 역사가 시작되었다. 국내외로 대회를 휩쓸고 다니며 명성을 누린 세계적인 스트릿댄서 '김현서'와 그의 크루원들은 자신들의 댄시 철학 'Never Stay Down'을 퍼트리고 싶어했고, 한국 스트릿 댄서들의 육성 최전선에서 활동하며
            수많은 후배들을 길러 냈다.
            <br /> <br />
            현재는 김현서 크루 외에 Micky Maniac, 현세리아, Lil Bil 외 다수의 유명 댄서들이 강사로 활동하고 있으며 다양한 장르와 난이도의 댄스 수업들 뿐만이 아닌 보컬 트레이닝과 댄스 매니지먼트 수업 등 엔터테인먼트 전반의 장르에 대한 퀄리티 높은 수업들을 진행 중이다.
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
        <Review></Review>
      </div>
      <div class="bottom">
        <Site></Site>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import Review from "@/components/Review";
import Site from "@/components/Site";


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
    Review,
    Site
  }
};
</script>


