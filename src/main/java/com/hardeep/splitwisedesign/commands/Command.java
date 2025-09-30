package com.hardeep.splitwisedesign.commands;

public interface Command {
    boolean canExecute(String command);
    void execute(String command);
}
