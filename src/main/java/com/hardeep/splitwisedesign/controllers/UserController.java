package com.hardeep.splitwisedesign.controllers;

import com.hardeep.splitwisedesign.dtos.RegisterUserRequestDto;
import com.hardeep.splitwisedesign.dtos.RegisterUserResponseDto;
import com.hardeep.splitwisedesign.dtos.ResponseStatus;
import com.hardeep.splitwisedesign.dtos.StatusCode;
import com.hardeep.splitwisedesign.models.User;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public RegisterUserResponseDto registerUser(RegisterUserRequestDto requestDto) {
        RegisterUserResponseDto responseDto = new RegisterUserResponseDto();

        User user  = new User();
        user.setName(requestDto.getName());
        user.setPassword(requestDto.getPassword());
        user.setPhone(requestDto.getPhone());
        user.setId(10L);

        responseDto.setUser(user);
        ResponseStatus rs =  new ResponseStatus();
        rs.setMessage("user created successfully");
        rs.setStatus(StatusCode.SUCCESS);
        responseDto.setResponseStatus(rs);
        return responseDto;
    }
}
