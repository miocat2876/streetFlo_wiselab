package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class RecommendBoardDto {
     
    private int seq;
    private String level;
    private String memberSeq;
    private String content;
    private String boardDeleteDt;
    private String boardDeleteYn;
    private String boardUpdateDt;
    private String boardCreateDt;

}
