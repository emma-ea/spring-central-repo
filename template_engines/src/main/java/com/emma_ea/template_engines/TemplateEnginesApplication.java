package com.emma_ea.template_engines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.Locale;

@SpringBootApplication
public class TemplateEnginesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateEnginesApplication.class, args);
	}

}
