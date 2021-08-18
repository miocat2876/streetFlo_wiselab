package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class ScheduleDto {

    private int seq;
    private int memberSeq;
    private String content;
    private String schedule;
    private String distinction;
}
