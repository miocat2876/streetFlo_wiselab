package com.streetflo.miocat.config.auth;

import com.streetflo.miocat.config.auth.dto.OAuthAttributes;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class oAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {



    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        String targetUrl = "http://localhost:8080/#/oauth/redirect" + "?token=success&" + "userName=test" ;

        getRedirectStrategy().sendRedirect(request, response, targetUrl);
    }

}