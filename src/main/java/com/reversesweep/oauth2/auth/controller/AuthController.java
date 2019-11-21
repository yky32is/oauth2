package com.reversesweep.oauth2.auth.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthController {

    @RequestMapping(value="/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
