package com.example.springboot.design.command;

public interface Command {
    public void execute();

    public void undo();
}
