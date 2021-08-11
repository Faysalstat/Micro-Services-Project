//package com.myprojects.orderservice;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//@EnableOAuth2Sso
//public class SecSecurityConfig extends WebSecurityConfigurerAdapter {
//
////    @Override
////    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
////        // authentication manager (see below)
////    }
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        // http builder configurations for authorize requests and form login (see below)
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/login*").permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic();
//    }
//}
