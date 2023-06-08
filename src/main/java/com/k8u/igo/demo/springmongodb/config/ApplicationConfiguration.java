package com.k8u.igo.demo.springmongodb.config;

import com.k8u.igo.demo.springmongodb.converter.BookDtoConverter;
import com.k8u.igo.demo.springmongodb.converter.BookEntityConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public ConversionService conversionService(){
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(new BookEntityConverter());
        defaultConversionService.addConverter(new BookDtoConverter());
        return defaultConversionService;
    }
}
