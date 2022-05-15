package com.web.application.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ServiceAdaptor extends WebMvcConfigurationSupport{
		@Autowired
		ServiceInterceptor serviceInterceptor;

		@Override
		protected void addInterceptors(InterceptorRegistry registry) {
		//	super.addInterceptors(registry);
			registry.addInterceptor(serviceInterceptor);
		}

	}

