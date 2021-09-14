package com.hatkhola.apigatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RoutingConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/order/**")
                        .filters(f ->
                                f.circuitBreaker(
                                        h-> h.setFallbackUri("forward:/countriesfallback")))
                        .uri("lb://ORDER-SERVICE")
                        ).build();
    }

}
