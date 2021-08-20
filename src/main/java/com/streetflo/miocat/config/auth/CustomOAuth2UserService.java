package com.streetflo.miocat.config.auth;

import com.streetflo.miocat.config.auth.dto.OAuthAttributes;
import com.streetflo.miocat.config.auth.dto.SessionUser;
import com.streetflo.miocat.dao.rest.MemberDao;
import com.streetflo.miocat.domain.user.User;
import com.streetflo.miocat.domain.user.UserRepository;
import com.streetflo.miocat.dto.rest.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@RequiredArgsConstructor
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User>{

    private MemberDao dao;

    private final UserRepository userRepository;
    private final HttpSession httpSession;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2UserService<OAuth2UserRequest, OAuth2User> delegate = new DefaultOAuth2UserService();
        OAuth2User oAuth2User = delegate.loadUser(userRequest);

        String registrationId = userRequest.getClientRegistration().getRegistrationId();

        String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails()
                .getUserInfoEndpoint().getUserNameAttributeName();

        String role = "test";
                //  (String) httpSession.getAttribute("user");

        OAuthAttributes attributes = OAuthAttributes.of(registrationId, userNameAttributeName, role, oAuth2User.getAttributes());

        MemberDto user = saveOrUpdate(attributes);
        // exception 처리?
        httpSession.setAttribute("user", user);

        return new DefaultOAuth2User(
                Collections.singleton(new SimpleGrantedAuthority(role)),
                attributes.getAttributes(),
                attributes.getNameAttributeKey());
    }


    private MemberDto saveOrUpdate(OAuthAttributes attributes) {

//        MemberDto user = userRepository.findByEmail(attributes.getEmail())
//                .map(entity -> entity.update(attributes.getName(), attributes.getPicture()))
//                .orElse(attributes.toEntity());

        MemberDto user = dao.saveOrUpdate(attributes);
        return user;
    }

    }

