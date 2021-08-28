package com.streetflo.miocat.dto.rest;

import com.streetflo.miocat.dto.table.ScheduleDto;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CalenderDto {
    private String day;
    private int memberSeq;
    private int year;
    private int month;
    private String date;
    private ArrayList<ScheduleDto> schedule;
}   