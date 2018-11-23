package org.cap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan("org.cap")
public class MyResolver implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver returnFile() {
		InternalResourceViewResolver i = new InternalResourceViewResolver();
		i.setViewClass(JstlView.class);
		i.setPrefix("/WEB-INF/pages/");
		i.setSuffix(".jsp");
		return i;
	}
	
}
