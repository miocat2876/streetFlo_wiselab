package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class PhotoDto {
  
    private int seq;
    private int memberSeq;
    private int academySeq;
    private String fileUploadName;
    private String fileSaveName;
    private String fileSize;
    private String fileExtension;
    private String fileDeleteYn;
    private String fileDeleteDt;
    private String fileCreateDt;
    private String fileCreateYn;
    private String photo;

}
