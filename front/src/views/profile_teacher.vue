<template>
    <div class="popup edit_profile">
        <div class="title_bar">
            <h2>Edit Profile - Teacher/Academy</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <div class="top edit_profile clear">
                <div class="left">
                    <a>
                        <img src="@/images/profile_img.png" alt="profile_img"/>
                    </a>
                </div>
                <div class="right">
                    <ul>
                        <li>
                            <div class="title_box">
                                <h4>이름:</h4> 
                            </div>
                            <div class="value_box name">
                                <input class="w100" v-model="teacherName"/>
                            </div>
                        </li>
                        <li>
                            <div class="title_box">
                                <h4>장르:</h4>
                            </div>
                            <div class="value_box interest">
                                <div class="combo_box">
                                    <select v-model="genre1">
                                        <option>select</option>
                                        <option>Breaking1</option>
                                        <option>hiphop1</option>
                                        <option>Waacking1</option>
                                    </select>
                                </div>
                                <p>/</p>
                                <div class="combo_box">
                                    <select v-model="genre2">
                                        <option>select</option>
                                        <option>Breaking2</option>
                                        <option>hiphop2</option>
                                        <option>Waacking2</option>
                                    </select>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="bottom">
                    <ul>
                        <li class="clear">
                            <div class="title_box">
                                <h4>Tags:</h4>
                            </div>
                            <div class="value_box">
                            <Hashtags :placeholder="해시태그를입력하세요"></Hashtags>
                             <!--    <input class="w100" v-model="teacherTag" @keyup.enter="splitTag" placeholder="태그를입력하세요(5개)"/> -->
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="bottom edit_profile clear">
                <ul>
                    <li>
                        <div class="title_box">
                            <h4>Instagram ID</h4> 
                        </div>
                        <div class="value_box ">
                            <input class="w100" v-model="instaId"/>
                        </div>
                    </li>
                    <li>
                        <div class="title_box">
                            <h4>Youtube</h4> 
                        </div>
                        <div class="value_box ">
                            <input class="w100" v-model="utubeId"/>
                        </div>
                    </li>
                    <li>
                        <div class="title_box">
                            <h4>E-mail</h4> 
                        </div>
                        <div class="value_box mail">
                            <input v-model="email1"/>
                            <p>@</p>
                            <div class="combo_box">
                                <select v-model="email2">
                                    <option>select</option>
                                    <option>naver.com</option>
                                    <option>gmail.com</option>
                                    <option>kakao.com</option>
                                </select>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="title_box">
                            <h4>Website</h4> 
                        </div>
                        <div class="value_box ">
                            <input class="w100" v-model="teacherSiteAddr"/>
                        </div>
                    </li>
                    <li>
                        <div class="title_box">
                            <h4>Location</h4> 
                        </div>
                        <div class="value_box ">
                            <input class="w100" v-model="teacherLocation" />
                        </div>
                    </li>
                    <li>
                        <div class="title_box">
                            <h4>소개글<br/>(300자 내외)</h4>
                        </div>
                        <div class="value_box">
                            <textarea v-model="teacherContent"></textarea>
                        </div>
                    </li>
                </ul>
            </div>
            <a class="save_bt" @click="profileTeacherAdd">Save >></a>
        </div>
    </div>
</template>

<script>
import { profileTeacherAdd} from '../api'
import Hashtags from '@/components/hashTagBar'

export default {
    props: {
        propsState: String,
    },
    async created() {
      let argument = {

      };
    },
    data: function() {
        return {
            teacherName     : ''
          , genre1          : []
          , genre2          : []
          , teacherTag      : []
          , instaId         : ''
          , utubeId         : ''
          , email           : ''
          , teacherSiteAddr : ''
          , loca1           : ''
          , loca2           : ''
          , loca3           : ''
          , teacherContent  : ''
        };
    },
    methods: {
        async splitTag() {
            console.log("111");
        },
        async profileTeacherAdd() {
            let argument = {
                  teacherName    : this.teacherName
                , genre1         : this.genre1
                , genre2         : this.genre2
                , tags           : this.teacherTag
                , instaId        : this.instaId
                , youtubeId      : this.utubeId
                , email          : this.email1 + "@" +this.email2
                , website        : this.teacherSiteAddr
                , loca1          : this.teacherLocation
                , loca2          : this.teacherLocation
                , loca3          : this.teacherLocation
                , teacherContent : this.teacherContent
            };
            console.log(argument);

            const {data} = await profileTeacherAdd(argument);
        }
  },
  components: {
      Hashtags: Hashtags,
   },

};
</script>

<style lang="scss"></style>