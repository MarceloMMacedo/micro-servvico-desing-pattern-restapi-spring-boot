package br.com.padroes.ptgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RouterConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/comportamental/strategy/**")
                        .uri("lb://strategy"))
                .route(p -> p
                        .path("/comportamental/observer/**")
                        .uri("lb://observador"))
                .build();
    }

}
