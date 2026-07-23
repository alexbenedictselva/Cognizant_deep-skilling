package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start authenticate()");

        // Decode Basic Auth header: "Basic base64(user:pwd)"
        String base64Credentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(base64Credentials));
        String[] parts = decoded.split(":", 2);
        String username = parts[0];
        String password = parts[1];

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        String token = jwtUtil.generateToken(username);
        LOGGER.info("End authenticate()");
        return Map.of("token", token);
    }
}
