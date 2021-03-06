package com.streetflo.miocat.config.auth.dto;

import com.streetflo.miocat.dao.rest.MemberDao;
import com.streetflo.miocat.domain.user.User;
import com.streetflo.miocat.dto.rest.MemberDto;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String id;
    private String email;
    private String picture;

    public SessionUser(MemberDto user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
