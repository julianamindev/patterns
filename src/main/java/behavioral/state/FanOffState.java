package behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FanOffState implements State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("off -> Low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
