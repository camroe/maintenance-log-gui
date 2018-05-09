//package com.cmr.avtech.configuration;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///** CAUTION: This is not a Spring Security Configuration that you would want to use for a production
// * website. These settings are only to support development of a Spring Boot web application and enable
// * access to the H2 database console. I cannot think of an example where you’d actually want the H2
// * database console exposed on a production database.
// *
// */
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests().antMatchers("/").permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/h2_console/**").permitAll();
//        httpSecurity.csrf().disable();
//        httpSecurity.headers().frameOptions().disable();
//    }
//
//}
