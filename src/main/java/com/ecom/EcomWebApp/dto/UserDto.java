package com.ecom.EcomWebApp.dto;

import com.ecom.EcomWebApp.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String email;
    private String name;
    private UserRole userRole;
}
