package behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pullChain();
        log.info("{}", fan);

        fan.pullChain();
        log.info("{}", fan);

        fan.pullChain();
        log.info("{}", fan);
    }
}