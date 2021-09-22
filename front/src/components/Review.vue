<template>
  <div class="review_list clear">
    <div class="left">
      <h1>Reviews</h1>
    </div>
    <div class="right">
      <div class="swiper-container">
        <div class="swiper-wrapper">
          <div
            class="swiper-slide"
            v-for="item in items"
            :key="item.name"
          >
            <div class="review_box">
              <div class="border-top"></div>
              <div class="border-middle">
                <div class="top clear">
                  <div class="left">
                    <img
                      src="http://placeimg.com/340/200/animals"
                      alt="profile_img"
                    />
                  </div>
                  <div class="right">
                    <h4>{{ item.name }}</h4>
                    <h4>종목: {{ item.genre }}</h4>
                    <p>Lv. {{ item.level }}</p>
                  </div>
                </div>
                <div class="bottom">
                  <p>
                    -  {{ item.content1 }}<br />
                    - 다양한 강사 선생님<br />
                    - 좋은 시설<br />
                  </p>
                </div>
                <button>Edit>></button>
              </div>
              <div class="border-bottom"></div>
            </div>
          </div>
        </div>
        <div class="swiper-button-next"></div>
        <div
          style="display:none"
          class="swiper-button-prev"
        ></div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  data() {
    return {
      items: []
    }
  },
  mounted() {
    this.init()
  },
  methods: {
    async init() {
      const _this = this
      const { data } = await this.$fetch({
        method:'GET',
        url: 'http://localhost:9090/reviewTest'
      })
       this.items = data
       console.log(data)
    }
  }
}
</script>

<style scoped lang="scss">

.review_list .left{
  text-align: left;
}

.swiper-slide {
  margin-right: 1em;
}

</style>
