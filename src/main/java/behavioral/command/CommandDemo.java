package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandDemo {

    public static void main(String[] args) {
        // receivers
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        // invoker
        Switch lightSwitch = new Switch();

        // concrete command
        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
