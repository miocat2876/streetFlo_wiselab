package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class MemberDto {

    private int seq;
    private String flatform;
    private String uniqueIdentifier;
    private String member;
    private String mailAddress;
    private String memberClass;
    private String nickName;
    private String profileContent;
    private String alarmYn;
    private String memberCreateDt;
    private String memberUpdateDt;
    

}
