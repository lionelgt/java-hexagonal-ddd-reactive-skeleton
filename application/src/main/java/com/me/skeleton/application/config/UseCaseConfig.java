package com.me.skeleton.application.config;


import com.me.skeleton.domain.annotation.UseCase;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    basePackages = {"com.me.skeleton.domain.*"},
    includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {UseCase.class})},
    useDefaultFilters = false
)
public class UseCaseConfig {
}
