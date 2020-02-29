package com.hotel.security;

// https://medium.com/keycloak/secure-spring-boot-2-using-keycloak-f755bc255b68

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {

    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}

//https://www.thomasvitale.com/spring-security-keycloak/