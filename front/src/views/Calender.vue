<template>
  <div class="contents_box">
    <div class="content_1200 calendar claer">
      <div class="left">
        <div class="top">
          <h1>Calendar</h1>
          <h3>
            <a class="mon_before" @click="calenderPrev"></a>{{ computedMonthNames }}, {{ year
            }}<a class="mon_after" @click="calenderNext"></a>
          </h3>
          <a
            class="add_bt"
            v-if="state === 'mypage'"
            :class="[addBt ? 'on' : '']"
            @click="addBt = !addBt"
            >Add Class</a
          >
          <ul class="add_class" :style="[addBt ? 'display : block' : 'display : none']">
            <li class="date">
              <div class="title_box">
                <h4>Date:</h4>
              </div>
              <div class="value_box claer">
                <input v-model="startDay" />
                <p>─</p>
                <input v-model="endDay" />
              </div>
            </li>
            <li>
              <ul class="week">
                <li>
                  <!-- v-bind:style="[everydayToggle ? 'color: #00ffa8' : 'color: #c9caca']" -->
                  <label @click="computedEverydayToggle()">매일</label>
                </li>
                <li>
                  <input type="checkbox" id="mon" value="0" v-model="checkedDays" />
                  <label for="mon">일</label>
                </li>
                <li>
                  <input type="checkbox" id="tue" value="1" v-model="checkedDays" />
                  <label for="tue">월</label>
                </li>
                <li>
                  <input type="checkbox" id="wed" value="2" v-model="checkedDays" />
                  <label for="wed">화</label>
                </li>
                <li>
                  <input type="checkbox" id="thu" value="3" v-model="checkedDays" />
                  <label for="thu">수</label>
                </li>
                <li>
                  <input type="checkbox" id="fri" value="4" v-model="checkedDays" />
                  <label for="fri">목</label>
                </li>
                <li>
                  <input type="checkbox" id="sat" value="5" v-model="checkedDays" />
                  <label for="sat">금</label>
                </li>
                <li>
                  <input type="checkbox" id="sun" value="6" v-model="checkedDays" />
                  <label for="sun">토</label>
                </li>
              </ul>
            </li>
            <li class="location">
              <div class="title_box">
                <h4>Location:</h4>
              </div>
              <div class="value_box">
                <input v-model="location" />
              </div>
            </li>
            <li class="time">
              <div class="title_box">
                <h4>Time:</h4>
              </div>
              <div class="value_box">
                <input v-model="startTime" />
                <p>─</p>
                <input v-model="endTime" />
              </div>
            </li>
            <li class="note">
              <div class="title_box">
                <h4>Note:</h4>
              </div>
              <div class="value_box">
                <input v-model="content" />
              </div>
            </li>
            <li class="level">
              <div class="title_box">
                <h4>Class Level:</h4>
              </div>
              <div class="value_box">
                <div class="combo_box">
                  <select v-model="level">
                    <option value="select">select</option>
                    <option value="test">test</option>
                  </select>
                </div>
              </div>
            </li>
            <li>
              <a class="save_bt" @click="scheduleAdd()">Save >></a>
            </li>
          </ul>
        </div>
        <div class="bottom">
          <ul>
            <li class="date clear">
              <div class="title_box">
                <h4>Date:</h4>
              </div>
              <div class="value_box claer">
                <input />
                <p>─</p>
                <input />
              </div>
            </li>
            <li>
              <ul class="week clear">
                <li>매일</li>
                <li>월</li>
                <li class="on">화</li>
                <li>수</li>
                <li class="on">목</li>
                <li>금</li>
                <li>토</li>
                <li>일</li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
      <div class="right" :style="[state !== 'mypage' ? 'min-height: auto' : '']">
        <table>
          <tr v-for="n in Math.ceil(computedMakeCaledar.length / 7)" :key="n">
            <td
              :class="[item.schedule ? 'able' : '']"
              v-for="item in computedMakeCaledar.slice((n - 1) * 7, 7 * n)"
              :key="item.key"
            >
              <p
                :class="[item.schedule ? 'calendar_tooltip' : '']"
                :style="[state !== 'mypage' ? 'padding: 4px' : '']"
              >
                {{ item.day }}
              </p>
              <div id="calendar" v-if="item.schedule">
                <div class="top">
                  <h2>{{ item.date }}</h2>
                </div>
                <div class="bottom">
                  <ul>
                    <li v-for="schedule in item.schedule" :key="schedule.key">
                      <h3>
                        {{ schedule.startTime }}-{{ schedule.endTime }}
                        상태 :
                        {{ schedule.type }}
                      </h3>
                      <p>[{{ schedule.level }}]</p>
                      <span>
                        <span v-if="state !== 'mypage'">
                          Class Level:
                          {{ schedule.level }}</span
                        >
                        <span v-if="state === 'mypage'">{{ schedule.content }}</span>
                      </span>
                      <a v-if="state !== 'mypage'" @click="scheduleSubscribeAdd(schedule)">
                        임시 상세등록
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </td>
          </tr>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
  import {scheduleFind, scheduleAdd, scheduleSubscribeAdd} from '../api';

  export default {
    props: {
      propsState: String,
    },
    async created() {
      let agrument = {
        year: this.year,
        month: this.month,
        memberSeq: this.id,
        date: `${this.year}-${this.month}-${this.day}`,
      };
      this.state = 'mypage';
      try {
        console.log(agrument);
        const {data: result} = await scheduleFind(agrument);
        console.log('====>', result);
        this.data = result;
      } catch (e) {
        console.log(e);
      }
    },
    data: function () {
      const date = new Date();
      const year = date.getFullYear();
      const month = date.getMonth();

      return {
        id: 4,
        day: 1,
        year: year,
        month: month + 1,
        data: [],
        addBt: false,
        state: this.propsState,
        startDay: '',
        endDay: '',
        checkedDays: [],
        everydayToggle: false,
        startTime: '',
        endTime: '',
        location: '',
        content: '',
        level: '',
      };
    },
    components: {},
    computed: {
      computedMakeCaledar() {
        return this.data;
      },
      computedMonthNames() {
        const monthNames = [
          'January',
          'February',
          'March',
          'April',
          'May',
          'June',
          'July',
          'August',
          'September',
          'October',
          'November',
          'December',
        ];
        return monthNames[this.month - 1];
      },
    },

    methods: {
      goBack(a) {
        console.log(a);
      },
      async calenderPrev() {
        if (this.month === 1) {
          this.year -= 1;
          this.month = 12;
        } else {
          this.month -= 1;
        }

        let agrument = {
          year: this.year,
          month: this.month,
          memberSeq: this.id,
          date: `${this.year}-${this.month}-${this.day}`,
        };

        const {data: result} = await scheduleFind(agrument);
        console.log(result);
        this.data = result;
      },
      async calenderNext() {
        if (this.month === 12) {
          this.year += 1;
          this.month = 1;
        } else {
          this.month += 1;
        }

        let agrument = {
          year: this.year,
          month: this.month,
          memberSeq: this.id,
          date: `${this.year}-${this.month}-${this.day}`,
        };

        console.log(agrument);
        const {data: result} = await scheduleFind(agrument);
        console.log(result);
        this.data = result;
      },
      async scheduleAdd() {
        let agrument = {
          memberSeq: this.id,
          content: this.content,
          schedule: this.schedule,
          distinction: this.distinction,
          startTime: this.startTime,
          endTime: this.endTime,
          startDay: this.startDay,
          endDay: this.endDay,
          genre: this.genre,
          level: this.level,
          week: this.checkedDays,
        };

        console.log(agrument);

        const {data: addResult} = await scheduleAdd(agrument);

        console.log(addResult);

        let agrument2 = {
          year: this.year,
          month: this.month,
          memberSeq: this.id,
          date: `${this.year}-${this.month}-${this.day}`,
        };
        const {data: result} = await scheduleFind(agrument2);
        console.log(result);
        this.data = result;
      },
      computedEverydayToggle() {
        this.everydayToggle = !this.everydayToggle;

        if (this.everydayToggle) {
          this.checkedDays = [0, 1, 2, 3, 4, 5, 6];
        } else {
          this.checkedDays = [];
        }
      },
      async scheduleSubscribeAdd(e) {
        let agrument = {
          memberSeq: this.id,
          scheduleSeq: e.seq,
          subscribeDt: e.date,
        };

        const {data: result} = await scheduleSubscribeAdd(agrument);
        console.log(result);
      },
    },
  };
</script>

<style scoped lang="scss"></style>
