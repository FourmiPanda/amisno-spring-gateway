package com.amisno.infragateway;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        System.out.println("RIBBON PING :");
        System.out.println(config.toString());
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        System.out.println("RIBBON RULE :");
        System.out.println(config.toString());
        return new AvailabilityFilteringRule();
    }
}
