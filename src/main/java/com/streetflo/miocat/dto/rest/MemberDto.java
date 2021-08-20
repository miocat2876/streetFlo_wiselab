package com.streetflo.miocat.dto.rest;

import lombok.Data;

@Data
public class MemberDto {

    private String name;
    private String email;
    private String picture;
    private String role;

}