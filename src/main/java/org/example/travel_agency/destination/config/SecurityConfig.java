package org.example.travel_agency.destination.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {


            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("user")
                    .password("user")
                    .roles("USER")
                    .build();

            UserDetails admin = User.withDefaultPasswordEncoder()
                    .username("admin")
                    .password("admin")
                    .roles("ADMIN")
                    .roles("USER")
                    .build();

            return new InMemoryUserDetailsManager(user, admin);

        }
        @Override
        protected void configure (HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/trips").hasRole("USER")
                .antMatchers("/addtrip").hasRole("ADMIN")
                .and()
                .formLogin().permitAll();
        }
    }
