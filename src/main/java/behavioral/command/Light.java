package behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// receiver
public class Light {

    private static Logger log = LoggerFactory.getLogger(Light.class);

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }


    private void on() {
        log.info("Lights on");
    }

    private void off() {
        log.info("Lights off");
    }
}
