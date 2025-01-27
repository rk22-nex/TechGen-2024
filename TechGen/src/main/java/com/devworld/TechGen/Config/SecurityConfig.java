//package com.devworld.TechGen.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//
//
//
//
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//   
//	   @Bean
//	    public UserDetailsService userDetailsService() {
//
//	        return new UserInfoUserDetailsService();
//	    }
//
//	
//	  @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        return new BCryptPasswordEncoder();
//	    }
//
//	    @Bean
//	    public AuthenticationProvider authenticationProvider(){
//	        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
//	        authenticationProvider.setUserDetailsService(userDetailsService());
//	        authenticationProvider.setPasswordEncoder(passwordEncoder());
//	        return authenticationProvider;
//	    }
//
//	
//	@Bean
//	public SecurityFilterChain secfilterchain(HttpSecurity http) throws Exception {
//		return http.csrf().disable().authorizeHttpRequests().anyRequest().authenticated().and().formLogin().and().build();
//	}
//	
//	
//}
