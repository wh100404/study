package com.example.springboot.design.command;

public class SimpleRemoteControl {

    //有一个插槽持有命令，而这个命令控制着一个装置。
    Command slot;

    public SimpleRemoteControl() {
    }

    //这个方法用来设置插槽控制的命令，如果客户要改变控制器的行为，可以多次调用该方法。
    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
