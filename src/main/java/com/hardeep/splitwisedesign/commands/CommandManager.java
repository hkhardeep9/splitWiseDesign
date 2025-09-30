package com.hardeep.splitwisedesign.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CommandManager {
    private List<Command> commands = new ArrayList<>();

    @Autowired
    public CommandManager(RegisterUserCommand registerUserCommand, SettleGroupCommand settleGroupCommand) {
        commands.add(registerUserCommand);
        commands.add(settleGroupCommand);
    }

    public void execute(String input) {
        for (Command command : commands) {
            if(command.canExecute(input)){
                command.execute(input);
                break;
            }
        }
    }
}
