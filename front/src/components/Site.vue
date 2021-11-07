<template>
  <div class="review_list clear">
    <div class="left">
      <h1>Location</h1>
      <p class="address">
        서울특별시 송파구 마천로7가길 1-1
      </p>
      <p class="time">
        [10:00 a.m~20:00 p.m / 일요일 휴무]
      </p>
    </div>
    <div class="right">
      <div class="swiper-container">
        <div class="swiper-wrapper">
          <div
            class="swiper-slide"
          >
            <div class="review_box">
              <div class="border-top"></div>
              <div class="border-middle">
                <div class="map-container">
                  <div id="map"></div>
                </div>
              </div>
              <div class="border-bottom"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

import axios from "axios";


export default {
  computed: {},
  data () {
    return {
    }
  },
  mounted() {
    if (window.kakao && window.kakao.maps) {
      this.initMap();
    } else {
      const script = document.createElement("script");
      script.onload = () => kakao.maps.load(this.initMap);
      script.src =
        "http://dapi.kakao.com/v2/maps/sdk.js?appkey=b34b600bb41cf3a0032ce43193d12339";
      document.head.appendChild(script);
    }
  },
  methods: {
    async initMap() {
      this.createMap();
    },
    async createMap(){

    var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
      mapOption = { 
          center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
          level: 2 // 지도의 확대 레벨
      };

    // 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
    var map = new kakao.maps.Map(mapContainer, mapOption); 

  // 주소-좌표 변환 객체를 생성합니다
  var geocoder = new kakao.maps.services.Geocoder();
        
  // 주소로 좌표를 검색합니다
  geocoder.addressSearch('서울특별시 송파구 마천로7가길 1-1', function(result, status) {

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
            content: '<div id="des" style=""> 머스타시 </div>'
        });
        infowindow.open(map, marker);

        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
    } 
});    

    }
}
}
</script>




<style lang="scss">

.review_list .left .address {
  padding : 1em 0 ; 
  color: white;
}

.review_list .left p {
  color: white;
}

.review_list .review_box .border-top {
  width: 100%;
  background-color: white;
}

.review_list .review_box .border-top::after{
  width: 106.7%;
}

.review_list .review_box .border-middle {
  width: 100%;
}

.review_list .review_box .border-bottom {
  width: 100%;
  background-color: white;
}

.review_list .review_box .border-bottom::after{
  width: 106.7%;
}

.map-container {
  width:100%;
  height: 100%;
}

#map {
  overflow: visible !important; 
  width:100%;
  height: 200px;
  z-index: -1;
}


#des {
  width:150px;
  height: 100%;
  text-align:center;
  padding:2px 0; 
  font-size:0.8em;
}



</style>