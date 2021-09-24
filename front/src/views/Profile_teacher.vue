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
                            <div class="value_box tag">
                                <div class="combo_box">
                                    <select v-model="tag1">
                                        <option>select</option>
                                        <option>tag1-1</option>
                                        <option>tah1-2</option>
                                        <option>tag1-3</option>
                                    </select>
                                </div>
                                <p>/</p>
                                <div class="combo_box">
                                    <select>
                                        <option>select</option>
                                        <option>tag2-1</option>
                                        <option>tah2-2</option>
                                        <option>tag2-3</option>
                                    </select>
                                </div>
                                <p>/</p>
                                <div class="combo_box">
                                    <select>
                                        <option>select</option>
                                        <option>tag3-1</option>
                                        <option>tah3-2</option>
                                        <option>tag3-3</option>
                                    </select>
                                </div>
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
import { profileTeacherAdd } from '../api'

export default {
    props: {
        propsState: String,
    },
    async created() {
      let agrument = {
        
      };
    },
    data: function() {
        return {
          
        };
    },
    methods: {
        async profileTeacherAdd() {
            let agrument = {
                  
            }; 
            console.log(agrument);

            
        },
    },
    
};
</script>

<style lang="scss"></style>