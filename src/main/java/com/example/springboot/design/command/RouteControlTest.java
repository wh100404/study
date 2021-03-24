package com.example.springboot.design.command;

public class RouteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
//        LightOnCommand lightOnCommand = new LightOnCommand(new Light());

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remoteControl.setSlot(garageDoorOpenCommand);

        remoteControl.buttonWasPressed();
    }
}
