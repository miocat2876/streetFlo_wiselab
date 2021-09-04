<template>
    <div class="popup edit_profile">
        <div class="title_bar">
            <h2>Edit Profile - Student</h2>
            <a class="close"></a>
        </div>
        <div class="content_box">
            <div class="top edit_profile clear">
                <div class="left">
                    <a>
                        <img src="/resources/assets/profile_img.png" alt="profile_img">
                    </a>
                </div>
                <div class="right">
                    <ul>
                        <li>
                            <div class="title_box">
                                <h4>이름:</h4> 
                            </div>
                            <div class="value_box name">
                                <input class="w100"/>
                            </div>
                        </li>
                        <li>
                            <div class="title_box">
                                <h4>관심 장르:</h4>
                            </div>
                            <div class="value_box interest">
                                <div class="combo_box">
                                    <select>
                                        <option>select</option>
                                    </select>
                                </div>
                                <p>/</p>
                                <div class="combo_box">
                                    <select>
                                        <option>select</option>
                                    </select>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="title_box">
                            </div>
                            <div class="value_box level">
                                <div class="combo_box">
                                    <select>
                                        <option>select</option>
                                    </select>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="bottom edit_profile">
                <ul>
                    <li>
                        <div class="title_box">
                            <h4>소개글<br/>(300자 내외)</h4>
                        </div>
                        <div class="value_box">
                            <textarea></textarea>
                        </div>
                    </li>
                </ul>
            </div>
            <a class="save_bt">Save >></a>
        </div>
    </div>
</template>

<script>
import { profileStudent } from '../api'

export default {
    props: {
      propsState: String,
    },
    async created() {
      let agrument = {
        
      };
    }
};
</script>

<style scoped lang="scss"></style>