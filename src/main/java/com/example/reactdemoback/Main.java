package com.example.reactdemoback;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken("user", "password");


    }

}
