package com.cognizant.spring_learn.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    private final SecretKey key =
            Keys.hmacShaKeyFor(
                "mysecretkeymysecretkeymysecretkey12".getBytes()
            );

    @GetMapping("/authenticate")
    public String authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64 = authHeader.substring(6);
        byte[] decoded = Base64.getDecoder().decode(base64);

        String credentials =
                new String(decoded, StandardCharsets.UTF_8);

        String[] values = credentials.split(":");

        String username = values[0];
        String password = values[1];

        if (username.equals("user") && password.equals("pwd")) {

            String token = Jwts.builder()
                    .subject(username)
                    .issuedAt(new Date())
                    .expiration(new Date(System.currentTimeMillis() + 600000))
                    .signWith(key)
                    .compact();

            return "{\"token\":\"" + token + "\"}";
        }

        return "{\"error\":\"Invalid credentials\"}";
    }
}