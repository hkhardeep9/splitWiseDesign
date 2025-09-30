package com.hardeep.splitwisedesign.dtos;

import com.hardeep.splitwisedesign.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponseDto {
    private User user;
    private ResponseStatus responseStatus;
}
