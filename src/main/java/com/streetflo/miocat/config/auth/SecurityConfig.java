package com.streetflo.miocat.config.auth;


import com.streetflo.miocat.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizationRequestResolver;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestResolver;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

import java.util.function.Consumer;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


        private final CustomOAuth2UserService customOAuth2UserService;

        @Autowired
        private ClientRegistrationRepository clientRegistrationRepository;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .headers().frameOptions().disable()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/**", "/resources/**", "**/images/**", "/js/**", "/h2-console/**", "/profile","/main").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                    .anyRequest().authenticated()
                    .and()
                    .logout()
                    .logoutSuccessUrl("/")
                    .and()
                    .oauth2Login(oauth2 -> oauth2
                            .authorizationEndpoint(authorization -> authorization
                                    .authorizationRequestResolver(
                                            authorizationRequestResolver(this.clientRegistrationRepository)))
                    .userInfoEndpoint()
                    .userService(customOAuth2UserService));
        }

        private OAuth2AuthorizationRequestResolver authorizationRequestResolver(
                ClientRegistrationRepository clientRegistrationRepository) {

            DefaultOAuth2AuthorizationRequestResolver authorizationRequestResolver =
                    new DefaultOAuth2AuthorizationRequestResolver(
                            clientRegistrationRepository, "/oauth2/authorization");
            authorizationRequestResolver.setAuthorizationRequestCustomizer(authorizationRequestCustomizer());
            return  authorizationRequestResolver;
        }

        private Consumer<OAuth2AuthorizationRequest.Builder> authorizationRequestCustomizer() {
            return customizer -> customizer
                    .additionalParameters(params -> params.put("prompt", "consent"));
        }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}