package com.example.springsecuritybasics;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@EnableMethodSecurity
public class Controllers {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hi! You're in Spring Security";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")      // only role admin can access it
    public String admin(){
        return "You are in the admin page";
    }
    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ROLE_USER')")      // only role user can access it
    public String user(){
        return "You are in the user page";
    }
}
