package com.example.springsecuritybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityBasicsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityBasicsApplication.class, args);
		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
//		for(int i=1;i<=10;i++){
//			String authenticatedPassword= passwordEncoder.encode("pass");
//			System.out.println("The password is "+authenticatedPassword);
//		}
	}

}
