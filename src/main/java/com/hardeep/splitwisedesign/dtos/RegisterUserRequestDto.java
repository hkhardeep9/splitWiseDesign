package com.hardeep.splitwisedesign.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDto {
    private String name;
    private String phone;
    private String password;
}
