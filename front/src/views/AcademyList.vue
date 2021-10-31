<template>
  <div>
    <div class="academy_list">
      <div class="content_1200">
        <div class="title_box">
          <h1>Dance Academy</h1>
          <a>asdasd</a> 머터리얼 테스트<span class="material-icons">
            settings
          </span>
        </div>
      </div>
      <div class="content-wrap" >
        <div class="content-left" @scroll="scroll">
          <div class="search_box">
            <div class="search">
              <a class="search_bt">
                <i class="fas fa-search"></i>
              </a>
              <input type="text" name="" id="" v-model="searchData.paramSearchValue"  v-on:keyup.enter="getSearch"/>
            </div>
            <div class="bottom">
              <ul class="calss-level">
                <li><span>Calss Level:&nbsp;</span></li>
                <li><a>Beginner</a></li>
                <li><a>Intermediate</a></li>
                <li><a>Master</a></li>
              </ul>
              <div class="combo_box">
                <select>
                  <option>Location</option>
                </select>
              </div>
            </div>
          </div>

          <ul class="img-list">
            <li v-for="data in searchList" :key="data.key">
              <div class="card-wrap">
                <div
                  style="background-image: url(/images/profile_img.png)"
                  class="card-img"
                ></div>
                <div class="title">
                  <p>{{ data.academyName }}</p>
                  <i class="fas fa-map-marker-alt"></i>
                </div>
                <div class="address">
                  {{ data.addressSido + data.addressDong + data.addressDetail }}
                </div>
                <ul class="label-wrap">
                  <li><a href="">#시설</a></li>
                  <li><a href="">#편한 교통</a></li>
                  <li><a href="">#다양한 수업</a></li>
                  <li><a href="">Class Event</a></li>
                </ul>
              </div>
            </li>
          </ul>
        </div>

        <div class="content-right">
          <div id="map"></div>
        </div>
      </div>
      <div class="content_1200">
        <a class="top_bt" href="#">
          <p></p>
        </a>
      </div>
    </div>
  </div>
</template>

<script>
// import Calender from '@/components/TeacherCalender';
// import Notice from '@/components/Notice';
// import Review from '@/components/Review';
import axios from "axios";

export default {
  computed: {},
  // components: {
  //   Calender,
  //   Notice,
  //   Review,
  // },
  data: function() {
    var imageSrc =
      "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
    return {
      imageSrc: imageSrc,
      searchList: [],
      searchData :{
        seq : 0,
        paramCurrentPage : 1,
        paramSearchCondition : "제주특별자치도",
        paramSearchValue : "테스트"
      }
    };
  },
  mounted() {
    if (window.kakao && window.kakao.maps) {
      this.initMap();
    } else {
      const script = document.createElement("script");
      /* global kakao */
      script.onload = () => kakao.maps.load(this.initMap);
      script.src =
        "http://dapi.kakao.com/v2/maps/sdk.js?appkey=b34b600bb41cf3a0032ce43193d12339&libraries=services,clusterer,drawing";
      document.head.appendChild(script);
    }
  },
  methods: {
    async initMap() {
      this.getSearchList()
    },
    async createMap(){

      var mapContainer = document.getElementById("map"), // 지도를 표시할 div
          mapOption = {
            center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
            level: 5 // 지도의 확대 레벨
          };

      //지도 생성
      var map = new kakao.maps.Map(mapContainer, mapOption);
      // const { data } = await axios.post(
      //     `http://localhost:9090/mapTest`,
      //     this.serachData
      // );
      // this.searchList = data;

      // 주소로 좌표를 검색합니다
      var geocoder = new kakao.maps.services.Geocoder();

      console.log(this.searchList[0]);

      for (let i in this.searchList) {
        geocoder.addressSearch(
            this.searchList[i].addressSido +
            this.searchList[i].addressDong +
            this.searchList[i].addressDetail,

            function(result, status) {
              // 정상적으로 검색이 완료됐으면
              if (status === kakao.maps.services.Status.OK) {
                var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                // 결과값으로 받은 위치를 마커로 표시합니다
                var marker = new kakao.maps.Marker({
                  map: map,
                  position: coords
                });
                // 인포윈도우로 장소에 대한 설명을 표시합니다
                var infowindow = new kakao.maps.InfoWindow({
                  content: `<div style="width:150px;text-align:center;padding:6px 0;">${this.searchList[i].academyName}</div>`
                });
                infowindow.open(map, marker);
                // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                //map.setCenter(coords);
                console.log(coords);
              }
            }.bind(this)
        );
      }

    },
    async scroll(e){
      let target = e.target
      console.dir(this.searchList.length);
      if(Math.ceil(target.scrollTop + target.offsetHeight) >= target.scrollHeight){
        this.searchData.seq = this.searchList[this.searchList.length-1].seq
        this.getSearchList();
      }
    }
    ,
    async getSearchList() {

      const { data } = await axios.post(
          `http://localhost:9090/mapTest`,
          this.searchData
      );

      let newArr = [
        ...this.searchList,
        ...data
      ]
      this.searchList = newArr;

      this.createMap()

    },
    async getSearch() {

      console.log(this.searchData);

      const { data } = await axios.post(
          `http://localhost:9090/mapTest`,
          this.searchData
      );

      this.searchList = data;

      this.createMap()

    }

  }
};
</script>
