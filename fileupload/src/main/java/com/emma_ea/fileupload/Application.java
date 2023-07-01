package com.emma_ea.fileupload;

import com.emma_ea.fileupload.servlet.UploadFilter;
import com.emma_ea.fileupload.servlet.UploadListener;
import com.emma_ea.fileupload.servlet.UploadServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	/// Register Servlet
//	@Bean
//	public ServletRegistrationBean getServletRegistrationBean() {
//		ServletRegistrationBean servletBean = new ServletRegistrationBean(new UploadServlet());
//		servletBean.addUrlMappings("/helloServlet");
//		return servletBean;
//	}
//
//	/// Register Filter
//	@Bean
//	public FilterRegistrationBean getFilterRegitrationBean() {
//		FilterRegistrationBean filterBean = new FilterRegistrationBean(new UploadFilter());
//		filterBean.addUrlPatterns("/helloServlet");
//		return filterBean;
//	}
//
//	/// Register Listener
//	@Bean
//	public ServletListenerRegistrationBean getListenerRegistrationBean() {
//		ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new UploadListener());
//		return listenerBean;
//	}



}
