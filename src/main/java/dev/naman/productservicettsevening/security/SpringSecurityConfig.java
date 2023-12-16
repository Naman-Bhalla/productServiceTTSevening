package dev.naman.productservicettsevening.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                                .requestMatchers("/products").permitAll()
//                        .requestMatchers("/products").hasAuthority("ADMIN")
                                .requestMatchers("/webhooks/stripe/").permitAll()
                        .requestMatchers("/topics/course/**").authenticated()
                        .anyRequest().permitAll() //only allow a person who has logged in to be able to access any URL
//                                .anyRequest().permitAll() // allow anyone to access any url without needing login
                )
                .oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()))
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(jwt -> jwt
                                .jwtAuthenticationConverter(new CustomJwtAuthenticationConverter())
                        )
                )
                .csrf().disable()
                .cors().disable();
        return http.build();
    }

}
