<template>
  <div class="home">
    <div class="content_1200 index">
      <div class="bg">
        <div class="rect">
          <div class="circle1"></div>
        </div>
      </div>
      <div class="top">
        <a class="on">[Teacher]</a> <a>[Academy]</a>
      </div>
      <div class="search_box">
        <input class="search"/> <a class="search_bt"></a>
        <div class="bottom">
          <ul>
            <li class="on"><a class="on">All</a> <a>B-boying</a> <a>Krumping</a>
              <a>Housedance</a> <a>Hip-Hop</a> <a>Locking</a> <a>Popping</a> <a>Waacking</a>
              <a>Choreography</a> <a>K-Pop</a> <a>Girls hip-hop</a> <a>Girlish</a>
            </li>
            {{items.G0001}}
            <li>
              <p>Class Level:</p> <a>Beginner</a> <a class="on">Intermediate</a>
              <a>Master</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
import { mapState,mapActions, mapGetters, mapMutations } from 'vuex'
export default {
  name: "Home",
  components: {
  },
  data:function () {
    return {}
  },
  mounted() {
    //console.log(this.$store.state.commonCode);
  },
  computed: { ...mapState({ items: state => state.commonCode, }),}
};
</script>
