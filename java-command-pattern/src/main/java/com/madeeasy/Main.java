package com.madeeasy;

import com.madeeasy.impl.LightOffCommand;
import com.madeeasy.impl.LightOnCommand;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remote.setCommand(lightOnCommand);
        remote.pressButton(); // Light is on

        remote.setCommand(lightOffCommand);
        remote.pressButton(); // Light is off
    }
}