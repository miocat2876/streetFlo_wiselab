<template>
  <div class="notice_list clear">
    <div class="left">
      <h1>New Notice</h1>
      <span>Swipe for previous notices >> </span>
    </div>
    <div class="right">
      <div class="swiper-container">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
            <div class="review_box">
              <div class="border-top"></div>
              <div class="border-middle">
                <div class="notice">
                  <div class="notice_title">
                    <p>공지수업:</p>
                    <div>
                      <select
                        class="box"
                        v-model="selected"
                      >
                        <option
                          v-for="option in options"
                          :key="option.title"
                        >
                          {{ option.title }}
                        </option>
                      </select>
                    </div>
                  </div>
                  <div class="notice_content">
                    <p>내용 (200자 내외):</p>
                    <div>
                      <textarea
                        v-model.trim="cont"
                        ref="cont"
                        class="box"
                      ></textarea>
                    </div>
                  </div>
                  <a
                    href="javascript:void(0);"
                    @click="postNotice"
                  > <button>Send >></button></a>
                </div>
              </div>
              <div class="border-bottom"></div>
            </div>
          </div>
          <div
            class="swiper-slide"
            v-for="item in items"
            :key="item.name"
          >
            <div class="review_box">
              <div class="border-top"></div>
              <div class="border-middle">
                <form class="notice">
                  <div class="notice_title">
                    <p>공지수업:</p>
                    <div class="box">
                      {{ item.lect }}
                    </div>
                  </div>
                  <div class="notice_content">
                    <p>내용 (200자 내외):</p>
                    <div class="box cont">
                      {{ item.cont }} 
                    </div>
                  </div>
                </form>
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
    
		return{
      id:'null',
      form:'',
      cont:'',
      selected: 'null',
      options: [
      { title: '수업 1', value: 'A' },
      { title: '수업 2', value: 'B' },
      { title: '수업 3', value: 'C' }
      ],
      items: []
		}
  },
  mounted() {
    this.init()
  },
	methods:{
    async init() {
    // const _this = this
    // const data = 
    //  await this.$axios.get('/noticeTest')
    //   .then((res)=>{
    //       this.items = res.data
    //       console.log(res.data)
    //   })
    //   .catch((err)=>{
		// 		console.log(err);
		// 	}) // eslint-disable-line no-unused-vars
  },




		myPage(){ 
			this.$router.push({path:'./Mypage',query:this.body});
		}
		,postNotice() { 
			if(!this.selected == 'null') {
				alert("강의를 선택하세요.");
				return;
			}

			this.form = { 
				lect:this.selected
				,cont:this.cont
				,id:this.id
			} 
			
      // this.$axios.post(`${commonUrl}/notice`, this.form)
      this.$axios.post(`localhost:9090/notice`, this.form)
			.then((res)=>{
				if(res.data.success) {
					alert('등록되었습니다.');
					this.myPage();
				} else {
					alert("등록을 실패했습니다. \n다시 등록해 주세요.");
				}
			}) 
			.catch((err)=>{
        console.log(this.form);
				console.log(err);
			})
			
		}
	}	
}
</script>

<style scoped lang="scss">

.left{
  text-align: left;
}

.cont {
  padding: 5px;
}

</style>
