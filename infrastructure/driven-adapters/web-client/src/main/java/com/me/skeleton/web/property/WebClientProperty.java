package com.me.skeleton.web.property;

import java.util.Map;

import lombok.Data;

@Data
public class WebClientProperty {
    private String url;
    private Map<String, String> services;
}


