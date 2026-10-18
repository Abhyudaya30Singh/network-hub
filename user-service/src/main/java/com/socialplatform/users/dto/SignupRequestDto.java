package com.socialplatform.users.dto;

import lombok.Data;

@Data
public class SignupRequestDto {
    private String name, email, password;
}
