package com.streetflo.miocat.dto.rest;

import lombok.Data;

@Data
public class MemberDto {

    private String id;
    private String email;
    private String picture;
    private String memType;
    private String platform;
    private String uniqueIdentifier;

    private String accessCode;

}