package org.tekcamp.springtek.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().anyRequest().permitAll();

//		http.csrf().disable().authorizeRequests()
//				.antMatchers("/").permitAll()
//				.antMatchers(HttpMethod.POST,"/books").permitAll()
//				.antMatchers(HttpMethod.GET, "/books").permitAll()
////                .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
////                .antMatchers(HttpMethod.GET,"/master/*").permitAll()
////                .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
//				.anyRequest().authenticated();
		http
				.csrf().disable()
				.authorizeRequests()
				.anyRequest().permitAll();
	}
}
