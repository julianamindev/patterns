package behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FanLowState implements State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        log.info("low -> med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
