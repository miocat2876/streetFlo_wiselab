package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class LogDto {

    private int seq;
    private String url;
    private String log;
    private String logLevel;
    private String logCreateDt;
}
