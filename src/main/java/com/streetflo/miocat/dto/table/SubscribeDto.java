package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class SubscribeDto {
    
    private int seq;
    private int memberSeq;
    private String subscribeMember;
    private String subscribeDt;
}
