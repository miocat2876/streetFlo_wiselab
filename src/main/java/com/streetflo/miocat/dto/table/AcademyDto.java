package com.streetflo.miocat.dto.table;

import lombok.Data;

@Data
public class AcademyDto {
	
	private int seq;
	private int memberSeq;
	private String academyName;
	private String addressSido;
	private String addressDong;
	private String addressDetail;
	private String academyCreateDt;
	private String tag;

}
