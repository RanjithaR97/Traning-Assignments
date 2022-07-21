package com.Springsecurity.SpringBootCustomLoginform.configure;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
	// TODO Auto-generated method stub
	http.authorizeRequests()
	.anyRequest().authenticated()
	.and().formLogin()
	.loginPage("/login")
	.permitAll();
}
}
