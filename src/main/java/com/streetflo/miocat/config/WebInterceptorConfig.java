package com.streetflo.miocat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.streetflo.miocat.interceptor.LoginInterceptor;

@Configuration
public class WebInterceptorConfig implements WebMvcConfigurer  {
	
	@Autowired
	LoginInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(loginInterceptor).excludePathPatterns("/**");
	}

	
	
	
}
