package com.mangosoft.proxyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ProxyServerApplication {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProxyServerApplication.class, args);
    }

}
