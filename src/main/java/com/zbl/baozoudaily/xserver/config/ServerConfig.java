package com.zbl.baozoudaily.xserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "xserver")
// PropertySource默认取application.properties
// @PropertySource(value = "config.properties")
public class ServerConfig {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
