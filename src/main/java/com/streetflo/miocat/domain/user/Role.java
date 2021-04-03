package com.streetflo.miocat.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
//    TEACHER("ROLE_TEACHER", "선생님");
    USER("ROLE_USER", "학생");

    private final String key;
    private final String title;

}

