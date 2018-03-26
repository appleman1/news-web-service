package com.viktor.falkenberg.newswebservice.config;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.feed.RssChannelHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */

@EnableWebMvc
@Configuration
@ComponentScan({"com.viktor.falkenberg.newswebservice"})
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(rssChannelHttpMessageConverter());
        converters.add(jaxb2RootElementHttpMessageConverter());
    }

    @Bean
    public RssChannelHttpMessageConverter rssChannelHttpMessageConverter(){
        return new RssChannelHttpMessageConverter();
    }
    @Bean
    public Jaxb2RootElementHttpMessageConverter jaxb2RootElementHttpMessageConverter(){
        return new Jaxb2RootElementHttpMessageConverter();
    }
}
