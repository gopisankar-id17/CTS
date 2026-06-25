interface Command {
    void execute();
}

class Light {
    void on() {
        System.out.println("Light ON");
    }

    void off() {
        System.out.println("Light OFF");
    }
}

class LightOnCommand implements Command {
    Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class RemoteControl {
    Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();

        RemoteControl rc = new RemoteControl();

        rc.setCommand(new LightOnCommand(light));

        rc.pressButton();
    }
}