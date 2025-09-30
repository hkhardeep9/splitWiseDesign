package com.hardeep.splitwisedesign.commands;

import org.springframework.stereotype.Component;

@Component
public class SettleGroupCommand implements Command {
    @Override
    public boolean canExecute(String command) {
        return false;
    }

    @Override
    public void execute(String command) {

    }
}
