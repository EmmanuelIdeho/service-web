package com.example.secure_web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Defines which URL paths should be secured and which should not.
        //In this case, the /, /login and /home paths are configured to not require any authentication to view and all other paths must be.
        http.authorizeHttpRequests((requests) -> requests
        .requestMatchers("/", "/home").permitAll()
        .anyRequest().authenticated()
        )
        .formLogin((form) -> form
        .loginPage("/login")
        .permitAll()
        )
        .logout((logout) -> logout.permitAll());

		return http.build();
    }

    @Bean 
    public UserDetailsService userDetailsService(){
        //Sets up an in-memory user store with a single user.
        UserDetails user = User.withDefaultPasswordEncoder()
                            .username("user")
                            .password("password")
                            .roles("USER")
                            .build();

        return new InMemoryUserDetailsManager(user);
    }
    
}
