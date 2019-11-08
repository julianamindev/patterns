package behavioral.mediator;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// receiver
@Slf4j
public class Light {
    private boolean isOn = false;

    private String location = "";

    public Light() {}

    public Light(String location) {
        this.location = location;
    }

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
        log.info("{} lights on", location);
    }

    private void off() {
        log.info("{} lights off", location);
    }
}
