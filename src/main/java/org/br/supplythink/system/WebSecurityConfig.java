package org.br.supplythink.system;

import org.br.supplythink.security.SmartSupplyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SmartSupplyUserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
//		.antMatchers("").hasAnyRole("ROLE_STOCK")
//		.antMatchers("").hasAnyRole("ROLE_DEMAND")
//		.antMatchers("").hasAnyRole("ROLE_COLLABORATIVE")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		    .loginPage("/entrar")
		     .permitAll()
		     .and()
		     .logout().logoutSuccessUrl("/entrar?logout")
		     .permitAll()
		     .and()
		     .rememberMe()
		     .userDetailsService(userDetailsService); 
	}

}
