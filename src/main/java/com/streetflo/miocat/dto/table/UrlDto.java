package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class UrlDto {

    private int seq;
    private int memberSeq;
    private int academySeq;
    private String urlLink;
    private String urlCreateDt;
}

