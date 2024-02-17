package com.me.skeleton.web.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(value ="rest")
public class WebClientProperties {
    private Map<String, WebClientProperty> clients;
}


