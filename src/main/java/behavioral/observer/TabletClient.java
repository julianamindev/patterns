package behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    protected void update() {
        log.info("Tablet Stream: {}", subject.getState());
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }
}
