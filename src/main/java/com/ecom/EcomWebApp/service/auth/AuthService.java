package com.ecom.EcomWebApp.service.auth;

import com.ecom.EcomWebApp.dto.SignupRequest;
import com.ecom.EcomWebApp.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    boolean hasUserWithEmail(String email);
}
