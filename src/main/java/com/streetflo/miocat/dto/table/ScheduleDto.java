package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class ScheduleDto {
    private int serachMonth;
    private int day;

    private int seq;
    private int memberSeq;
    private String content;
    private String schedule;
    private String distinction;
    private String startTime;
    private String endTime;
    private String startDay;
    private String endDay;
    private String genre;
    private String level;
}
