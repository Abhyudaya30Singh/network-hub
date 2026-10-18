package com.socialplatform.users.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email, password;
}
