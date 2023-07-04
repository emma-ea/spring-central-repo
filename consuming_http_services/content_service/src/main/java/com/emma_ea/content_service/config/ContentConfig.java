package com.emma_ea.content_service.config;

import com.emma_ea.content_service.sevice.ContentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ContentConfig {

    @Bean
    public ContentService contentService() {
        WebClient client = WebClient.builder()
                .baseUrl("http://localhost:8081/api")
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder()
                .clientAdapter(WebClientAdapter.forClient(client))
                .build();
        return factory.createClient(ContentService.class);
    }

}
