package headfirst.command.simpleremote;

/**
 * 调用者
 * Created by Gavin on 2017/3/14.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
