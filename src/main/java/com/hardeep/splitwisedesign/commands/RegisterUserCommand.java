package com.hardeep.splitwisedesign.commands;

import com.hardeep.splitwisedesign.controllers.UserController;
import com.hardeep.splitwisedesign.dtos.RegisterUserRequestDto;
import com.hardeep.splitwisedesign.dtos.RegisterUserResponseDto;
import com.hardeep.splitwisedesign.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class RegisterUserCommand implements Command {
    @Autowired
    private UserController userController;
    @Override
    public boolean canExecute(String command) {
        if(!command.startsWith("RegisterUser")) {
            return false;
        }
        List<String> params = Arrays.stream(command.split(" ")).toList();
        if(params.size() != 4) {
            return false;
        }
        return true;
    }
    //"RegisterUser <name> <phone> <password>"
    @Override
    public void execute(String command) {
        //Parse input and call controller
        List<String> params = Arrays.stream(command.split(" ")).toList();
        String name = params.get(0);
        String phone = params.get(1);
        String password = params.get(2);
        RegisterUserRequestDto registerUserRequestDto = new RegisterUserRequestDto();
        registerUserRequestDto.setName(name);
        registerUserRequestDto.setPhone(phone);
        registerUserRequestDto.setPassword(password);

        RegisterUserResponseDto responseDto = userController.registerUser(registerUserRequestDto);
        User user = responseDto.getUser();
        System.out.println(user);

    }
}
