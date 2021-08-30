package com.streetflo.miocat.dto.table;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ScheduleWeekDto {
    private int serachMonth;

    private int seq;
    private int scheduleSeq;
    private ArrayList<Integer> week;

}
