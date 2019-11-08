package behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FanMedState implements State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("med -> off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is med";
    }
}
