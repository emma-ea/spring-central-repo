package com.emma_ea.dog_secure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DogSecurity {

   @Bean
   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

     http.authorizeHttpRequests(
             (auth) -> auth.anyRequest().authenticated())
             .httpBasic(Customizer.withDefaults());
     return http.build();
   }

   @Bean
   public UserDetailsService userDetailsService(PasswordEncoder encoder) {
      InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
      manager.createUser(
              User.withUsername("user")
                      .password(encoder.encode("password"))
                      .roles("USER")
                      .build()
      );
      return manager;
   }

   @Bean
   public PasswordEncoder encoder() {
      return new BCryptPasswordEncoder();
   }



}
