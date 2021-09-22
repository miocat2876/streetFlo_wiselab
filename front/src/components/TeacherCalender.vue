<template>
  <div class="content_1200 calendar clear">
    <div class="left">
      <div class="top">
        <h1>Calendar</h1>
        <h3>
          <a
            class="mon_before"
            @click="calenderPrev"
          ></a>{{ computedMonthNames }}, {{ year }}<a
            class="mon_after"
            @click="calenderNext"
          ></a>
        </h3>
      </div>
    </div>
    <div
      class="right"
      :style="[state !== 'detail' ? 'min-height: auto' : '']"
    >
      <table>
        <tr
          v-for="n in Math.ceil(computedMakeCaledar.length / 7)"
          :key="n"
        >
          <td
            :class="[item.schedule ? 'able' : '']"
            v-for="item in computedMakeCaledar.slice((n - 1) * 7, 7 * n)"
            :key="item.key"
          >
            <p
              :class="[item.schedule ? 'calendar_tooltip' : '']"
              :style="[state !== 'detail' ? 'padding: 4px' : '']"
            >
              {{ item.day }}
            </p>
            <div
              id="calendar"
              v-if="item.schedule"
            >
              <div class="top">
                <h2>{{ item.date }}</h2>
              </div>
              <div class="bottom">
                <ul>
                  <li
                    v-for="schedule in item.schedule"
                    :key="schedule.key"
                  >
                    <h3>
                      {{ schedule.startTime }}-{{ schedule.endTime }}
                      상태 :
                      {{ schedule.type }}
                    </h3>
                    <p>[{{ schedule.level }}]</p>
                    <span>
                      <span v-if="state !== 'detail'">
                        Class Level:
                        {{ schedule.level }}</span>
                      <span v-if="state === 'detail'">{{ schedule.content }}</span>
                    </span>
                    <a
                      v-if="state !== 'detail'"
                      @click="scheduleSubscribeAdd(schedule)"
                    >
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
</template>

<script>
  import {scheduleFind, scheduleAdd, scheduleSubscribeAdd} from '../api';

  export default {
    props: {
      state: String,
    },
    async created() {
      let agrument = {
        year: this.year,
        month: this.month,
        memberSeq: this.id,
        date: `${this.year}-${this.month}-${this.day}`,
      };
      try {
        console.log(agrument);
        const {data: result} = await scheduleFind(agrument);
        console.log('====>', result);
        this.data = result;
      } catch (e) {
        console.log(e);
      }

      console.log('====>111', this.state);
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
