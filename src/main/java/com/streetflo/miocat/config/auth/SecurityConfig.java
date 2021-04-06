package com.streetflo.miocat.config.auth;


import com.streetflo.miocat.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//            // 보안예외처리 (WebSecurity) - 리소스 인증 범위 풀어줌
//        web.ignoring().antMatchers("/js/**","/css/**","/images/**","/font/**","/html/**");
//    }

        private final CustomOAuth2UserService customOAuth2UserService;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .headers().frameOptions().disable()
                    .and()
                    .authorizeRequests()
                    .antMatchers("/", "/resources/**", "**/images/**", "/js/**", "/h2-console/**", "/profile","/main").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                    .anyRequest().authenticated()
                    .and()
                    .logout()
                    .logoutSuccessUrl("/")
                    .and()
                    .oauth2Login()
                    .userInfoEndpoint()
                    .userService(customOAuth2UserService);
        }

//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 보안 처리 (HttpSecurity)
//        http.authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/**", "/h2-console/**").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login/form")
//                .usernameParameter("userId")
//                .passwordParameter("password")
//                .loginProcessingUrl("/login/perform")
//                .defaultSuccessUrl("/login/success")
//                .failureUrl("/login/fail")
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/login/logout")
//                .invalidateHttpSession(true)
//                .and()
//                .exceptionHandling().accessDeniedPage("/login/denied");
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public LoginService loginService() {
//        return new LoginService();
//    }
}