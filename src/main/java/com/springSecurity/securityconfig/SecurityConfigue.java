package com.springSecurity.securityconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity   
public class SecurityConfigue {
	@Bean
	public UserDetailsService userdetailservice() {
		UserDetails user=User.withUsername("user")
				.password(passwordencoder()
						.encode("1234"))
				.roles("user")
				.build();	
		UserDetails admin=User.withUsername("admin").password(passwordencoder().encode("123")).roles("admin").build();
	return new InMemoryUserDetailsManager(user,admin); 
	
	}
	
	@Bean
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
    public SecurityFilterChain filtelrchain(HttpSecurity http) throws Exception {
    	http.csrf().disable().authorizeHttpRequests()
    	.anyRequest().
    	authenticated()
    	.and()
    	.formLogin(); 
    	return http.build();
    }
}
