package com.Springsecurity.SecurityAssignment.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfigure  extends WebSecurityConfigurerAdapter{
	
 @Override

 protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	 auth.inMemoryAuthentication()
	 .withUser("foo")
	 .password("foo")
	 .roles("USER")
	 .and()
	 .withUser("ranji")
	 .password("abc")
	 .roles("ADMIN");
	 
 }

 @Override
 protected void configure(HttpSecurity http) throws Exception{
	 
	 http.authorizeRequests()
	 .antMatchers("/admin").hasRole("ADMIN")
	 .antMatchers("/user").hasAnyRole("USER","ADMIN")
	 .antMatchers("/").permitAll()
	 .and().formLogin();
	 
 }
	
 
 @Bean
 protected PasswordEncoder getPasswordEncoder() {
	 return NoOpPasswordEncoder.getInstance();
 }
 
 
 
}
